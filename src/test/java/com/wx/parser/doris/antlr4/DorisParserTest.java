package com.wx.parser.doris.antlr4;

import com.wx.parser.doris.DorisSql;
import com.wx.parser.doris.DorisVisitor;
import com.wx.parser.info.Info;
import com.wx.parser.listener.ParseErrorListener;
import com.wx.parser.listener.PostProcessor;
import com.wx.parser.utils.CaseInsensitiveStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.Test;

public class DorisParserTest {
    private static final ParseErrorListener PARSE_ERROR_LISTENER = new ParseErrorListener();
    private static final PostProcessor POST_PROCESSOR = new PostProcessor();
    @Test
    public void explainTest() {
        System.out.println(dorisParser(DorisSql.EXPLAIN_SQL));
    }
    @Test
    public void selectTest() {
        System.out.println(dorisParser(DorisSql.SELECT_JOIN_SQL));
    }
    @Test
    public void createTest() {
        System.out.println(dorisParser(DorisSql.CREATE_COLS_SQL));
    }

    private Info dorisParser(String sql) {
        DorisLexer lexer = new DorisLexer(new CaseInsensitiveStream(CharStreams.fromString(sql)));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        DorisParser parser = new DorisParser(tokenStream);

        parser.addParseListener(POST_PROCESSOR);
        parser.removeErrorListeners();
        parser.addErrorListener(PARSE_ERROR_LISTENER);

        DorisVisitor dorisVisitor = new DorisVisitor();
        return dorisVisitor.visitSingleStatement(parser.singleStatement());
    }
}
