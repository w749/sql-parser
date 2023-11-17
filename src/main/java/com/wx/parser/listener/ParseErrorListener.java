package com.wx.parser.listener;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import com.wx.parser.doris.exceptions.ParseException;
import com.wx.parser.utils.Origin;

import java.util.Optional;

public class ParseErrorListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
                            String msg, RecognitionException e) {
        Origin start;
        if (offendingSymbol instanceof CommonToken) {
            CommonToken token = (CommonToken) offendingSymbol;
            start = new Origin(line, token.getCharPositionInLine());
        } else {
            start = new Origin(line, charPositionInLine);
        }
        throw new ParseException(msg, start, Optional.empty());
    }
}
