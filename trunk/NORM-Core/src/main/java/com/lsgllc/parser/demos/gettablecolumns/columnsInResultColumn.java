package com.lsgllc.parser.demos.gettablecolumns;

/*
 * Date: 11-4-19
 * ref : http://www.dpriver.com/blog/list-of-demos-illustrate-how-to-use-general-sql-parser/get-referenced-table-column-in-a-select-list-item/
 */

import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.select.Select;
import com.lsgllc.parser.columnInClause;

public class columnsInResultColumn {

    public static void main(String args[])
     {
         try {
             String sql = "select sal.income + sal.bonus * emp.age + 5 as real_sal,\n" +
                     "       emp.name as title \n" +
                     "from employee emp, salary sal \n" +
                     "where emp.id=sal.eid";
             Statement statement = CCJSqlParserUtil.parse(sql);
             if (statement instanceof Select) {
                 Select select = (Select) statement;
                 printColumns(select);
             }
         } catch (Exception e) {
             System.out.println("Parse error: " + e.getMessage());
         }

     }

     static void printColumns(Select select){
         System.out.println("Select statement columns: " + select.toString());
     }
}

