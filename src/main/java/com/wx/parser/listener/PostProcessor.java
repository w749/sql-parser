package com.wx.parser.listener;

import com.wx.parser.doris.antlr4.DorisParser;
import com.wx.parser.doris.antlr4.DorisParserBaseListener;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import com.wx.parser.doris.exceptions.QueryParsingErrors;

import java.util.function.Function;

public class PostProcessor extends DorisParserBaseListener {
    @Override
    public void exitErrorIdent(DorisParser.ErrorIdentContext ctx) {
        String ident = ctx.getParent().getText();
        throw QueryParsingErrors.unquotedIdentifierError(ident, ctx);
    }

    @Override
    public void exitQuotedIdentifier(DorisParser.QuotedIdentifierContext ctx) {
        replaceTokenByIdentifier(ctx, 1, token -> {
            // Remove the double back ticks in the string.
            token.setText(token.getText().replace("``", "`"));
            return token;
        });
    }

    @Override
    public void exitNonReserved(DorisParser.NonReservedContext ctx) {
        replaceTokenByIdentifier(ctx, 0, i -> i);
    }

    private void replaceTokenByIdentifier(ParserRuleContext ctx, int stripMargins,
                                          Function<CommonToken, CommonToken> f) {
        ParserRuleContext parent = ctx.getParent();
        parent.removeLastChild();
        Token token = (Token) (ctx.getChild(0).getPayload());
        CommonToken newToken = new CommonToken(
                new org.antlr.v4.runtime.misc.Pair<>(token.getTokenSource(), token.getInputStream()),
                DorisParser.IDENTIFIER,
                token.getChannel(),
                token.getStartIndex() + stripMargins,
                token.getStopIndex() - stripMargins);
        parent.addChild(new TerminalNodeImpl(f.apply(newToken)));
    }
}
