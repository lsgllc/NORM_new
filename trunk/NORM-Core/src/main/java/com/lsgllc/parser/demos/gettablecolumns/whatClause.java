package com.lsgllc.parser.demos.gettablecolumns;


import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.delete.Delete;
import net.sf.jsqlparser.statement.insert.Insert;
import net.sf.jsqlparser.statement.select.Select;
import net.sf.jsqlparser.statement.update.Update;
import net.sf.jsqlparser.schema.Table;

public class whatClause  {

    public static void main(String args[])
     {
         try {
             String sql1 = "select employee_id,last_name\n" +
                     "from employees\n" +
                     "where department_id = 90\n" +
                     "group by employee_id\n" +
                     "order by last_name;";
             Statement statement1 = CCJSqlParserUtil.parse(sql1);
             System.out.println("Select statement parsed: " + statement1.toString());

             String sql2 = "insert into emp e1 (e1.lastname,job) values('scott',10);";
             Statement statement2 = CCJSqlParserUtil.parse(sql2);
             System.out.println("\n\nInsert statement parsed: " + statement2.toString());

             String sql3 = "update employees\n" +
                     "set department_ID = 70\n" +
                     "where employee_id = 113;";
             Statement statement3 = CCJSqlParserUtil.parse(sql3);
             System.out.println("\n\nUpdate statement parsed: " + statement3.toString());

             String sql4 = "delete from employees E\n" +
                     "where employee_id = \n" +
                     "(select employee_sal\n" +
                     "from emp_history\n" +
                     "where employee_id = e.employee_id);";
             Statement statement4 = CCJSqlParserUtil.parse(sql4);
             System.out.println("\n\nDelete statement parsed: " + statement4.toString());

         } catch (Exception e) {
             System.out.println("Parse error: " + e.getMessage());
         }
     }

}
