## Sql-Parser
该项目使用Antlr4解析SQL语句，目前仅支持Doris个别SQL语句（EXPLAIN、SELECT、CREATE、DELETE）。 Antlr4词法和语法文件均来自Doris官网， 参考`fe/fe-core/src/main/java/org/apache/doris/nereids/parser/LogicalPlanBuilder.java`文件生成`com.wx.parser.doris.DorisVisitor`，测试SQL参考`com.wx.parser.doris.antlr4.DorisParserTest`

语法和词法文件保存在`src/main/antlr4`目录下，pom中引用了`antlr4-maven-plugin`插件，如果g4文件有更新则执行`mvn clean package`命令重新生成java文件