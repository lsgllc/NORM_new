package com.lsgllc.parser.demos.gettablecolumns;

import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.select.Select;

import java.io.File;

public class getResultColumn  {

    public static void main(String args[])
     {
         try {
             String sql = "select a,b,c,DATETOSTRING(date_attr_name,'mm/dd/yyyy') from tbl_a";
             Statement statement = CCJSqlParserUtil.parse(sql);
             if (statement instanceof Select) {
                 Select select = (Select) statement;
                 System.out.println("Parsed select statement: " + select.toString());
             }
         } catch (Exception e) {
             System.out.println("Parse error: " + e.getMessage());
         }
         
     }

}
