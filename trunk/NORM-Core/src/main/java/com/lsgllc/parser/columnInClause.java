package com.lsgllc.parser;
/*
 * Date: 11-5-5
 */

import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.schema.Table;
import net.sf.jsqlparser.statement.select.OrderByElement;
import net.sf.jsqlparser.statement.select.GroupByElement;

public class columnInClause  {

    public columnInClause(){}

    public void printColumns(Expression expression, Statement statement){
        System.out.println("Referenced columns:");
        System.out.println("Expression: " + expression.toString());
    }

    public void printColumns(GroupByElement list, Statement statement){
        System.out.println("Referenced columns:");
        System.out.println("Group by: " + list.toString());
    }

    public void printColumns(OrderByElement orderBy, Statement statement){
        System.out.println("Referenced columns:");
        System.out.println("Order by: " + orderBy.toString());
    }


}

class columnVisitor {

    Statement statement = null;

    public columnVisitor(Statement statement) {
        this.statement = statement;
    }

    String getColumnWithBaseTable(String columnName){
        return "Column: " + columnName;
    }

    public void visitExpression(Expression expr){
        System.out.println("Visiting expression: " + expr.toString());
    }

}
