package com.lsgllc.parser;

import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.alter.Alter;
import net.sf.jsqlparser.statement.create.table.CreateTable;
import net.sf.jsqlparser.statement.create.view.CreateView;
import net.sf.jsqlparser.statement.update.Update;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* Parsing DDL
* 1. parsing create table.
*/

public class ParsingDDL {
    public static void main(String args[])
    {

//        if (args.length != 1){
//            System.out.println("Usage: java parsingDDL sqlfile.sql");
//            return;
//        }
//        File file=new File(args[0]);
//        if (!file.exists()){
//            System.out.println("File not exists:"+args[0]);
//            return;
//        }
//
//        String msg = "Please select SQL dialect: 1: SQL Server, 2: Oralce, 3: MySQL, 4: DB2, 5: PostGRESQL, 6: Teradta, default is 2: Oracle";
//        System.out.println(msg);
//
//        BufferedReader br=new   BufferedReader(new InputStreamReader(System.in));
//        try{
//            int db = Integer.parseInt(br.readLine());
//            if (db == 1){
//                dbVendor = EDbVendor.dbvmssql;
//            }else if(db == 2){
//                dbVendor = EDbVendor.dbvoracle;
//            }else if(db == 3){
//                dbVendor = EDbVendor.dbvmysql;
//            }else if(db == 4){
//                dbVendor = EDbVendor.dbvdb2;
//            }else if(db == 5){
//                dbVendor = EDbVendor.dbvpostgresql;
//            }else if(db == 6){
//                dbVendor = EDbVendor.dbvteradata;
//            }
//        }catch(IOException i) {
//        }catch (NumberFormatException numberFormatException){
//        }

        try {
            String sqltext = ""; // TODO: Read from resources/createAllIBM.sql
            Statement statement = CCJSqlParserUtil.parse(sqltext);
            analyzeStmt(statement);
        } catch (Exception e) {
            System.out.println("Parse error: " + e.getMessage());
        }
    }

    protected static void analyzeStmt(Statement stmt){
        if (stmt instanceof Update){
            analyzeUpdateStmt((Update)stmt);
        } else if (stmt instanceof CreateTable){
            analyzeCreateTableStmt((CreateTable)stmt);
        } else if (stmt instanceof Alter){
            analyzeAlterTableStmt((Alter) stmt);
        } else if (stmt instanceof CreateView){
            analyzeCreateViewStmt((CreateView)stmt);
        } else {
            System.out.println("Statement type: " + stmt.getClass().getSimpleName());
        }
    }

    protected static void printConstraint(String constraintInfo, Boolean outline){
        System.out.println("\t\tconstraint: " + constraintInfo);

    }

    protected static void printObjectNameList(String objListInfo){
        System.out.println("Object list: " + objListInfo);
    }
    
    protected static void printColumnDefinitionList(String cdlInfo){
        System.out.println("Column definitions: " + cdlInfo);
    }
    
    protected static void printConstraintList(String cnlInfo){
        System.out.println("Constraints: " + cnlInfo);
    }

    protected static void printAlterTableOption(String atoInfo){
        System.out.println("Alter table option: " + atoInfo);
    }

    protected static void analyzeCreateViewStmt(CreateView pStmt){
        CreateView createView = pStmt;
        System.out.println("View name:"+createView.getView().getName());
        System.out.println("View subquery: \n"+ createView.getSelect().toString() );
    }

    protected static void analyzeUpdateStmt(Update pStmt){
        System.out.println("Table Name:"+pStmt.getTable().getName());
        System.out.println("set clause:");
        if (pStmt.getUpdateSets() != null) {
            for (int i = 0; i < pStmt.getUpdateSets().size(); i++) {
                System.out.println("\tcolumn:"+pStmt.getUpdateSets().get(i).getColumns().get(0).getColumnName()+
                        "\tvalue:"+pStmt.getUpdateSets().get(i).getValue(0).toString());
            }
        }
        if(pStmt.getWhere() != null){
            System.out.println("where clause:\n"+pStmt.getWhere().toString());
        }
    }

    protected static void analyzeAlterTableStmt(Alter pStmt){
        System.out.println("Table Name:"+pStmt.getTable().getName());
        System.out.println("Alter table operations:");
        if (pStmt.getAlterExpressions() != null) {
            for (int i = 0; i < pStmt.getAlterExpressions().size(); i++) {
                System.out.println("\tOperation: " + pStmt.getAlterExpressions().get(i).toString());
            }
        }
    }

    protected static void analyzeCreateTableStmt(CreateTable pStmt){
        System.out.println("Table Name:"+pStmt.getTable().getName());
        System.out.println("Columns:");
        if (pStmt.getColumnDefinitions() != null) {
            for (int i = 0; i < pStmt.getColumnDefinitions().size(); i++) {
                System.out.println("\tname:"+pStmt.getColumnDefinitions().get(i).getColumnName());
                System.out.println("\tdatatype:"+pStmt.getColumnDefinitions().get(i).getColDataType().toString());
                if (pStmt.getColumnDefinitions().get(i).getColumnSpecs() != null) {
                    System.out.println("\tspecs:"+pStmt.getColumnDefinitions().get(i).getColumnSpecs().toString());
                }
                System.out.println("");
            }
        }
        
        if (pStmt.getIndexes() != null && !pStmt.getIndexes().isEmpty()) {
            System.out.println("\tindexes:");
            for (int i = 0; i < pStmt.getIndexes().size(); i++) {
                System.out.println("\t\tindex: " + pStmt.getIndexes().get(i).toString());
            }
        }
    }

}
