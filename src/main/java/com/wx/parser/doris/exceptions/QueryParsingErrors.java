// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package com.wx.parser.doris.exceptions;


import com.wx.parser.doris.antlr4.DorisParser;

/**
 * Exception packaging to improve code readability.
 */
public class QueryParsingErrors {
    public static ParseException unquotedIdentifierError(String ident, DorisParser.ErrorIdentContext ctx) {
        return new ParseException(String.format("Possibly unquoted identifier %s detected. "
                + "Please consider quoting it with back-quotes as `%s`", ident, ident), ctx);
    }
}
