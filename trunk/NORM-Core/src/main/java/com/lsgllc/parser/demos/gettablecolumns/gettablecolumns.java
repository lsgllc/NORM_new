package com.lsgllc.parser.demos.gettablecolumns;


import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * The logic to find all tables and columns in SQL script using JSQLParser
 */

class metaDB {

    String columns[][] = {
        {"dbo","subselect3table1","f1"},
        {"dbo","subselect3table2","s3t1a1"}
    };

    public boolean checkColumn(String schema, String table, String column){
       boolean bSchema,bTable,bColumn,bRet = false;
        for (int i=0; i<columns.length;i++){
            if (schema == null){
                bSchema = true;
            }else{
                bSchema = columns[i][0].equalsIgnoreCase(schema);
            }

            if (!bSchema) continue;

            bTable = columns[i][1].equalsIgnoreCase(table);
            if (!bTable) continue;

            bColumn = columns[i][2].equalsIgnoreCase(column);
            if (!bColumn) continue;

            bRet =true;
            break;

        }

        return bRet;
    }

}

class getObject{

    private String sqlfile="";
    private String sqltext = "";

    public void setSqltext(String sqltext) {
        this.sqltext = sqltext;
    }

    public void setSqlfile(String sqlfile) {
        this.sqlfile = sqlfile;
    }


    String[] foundTables = new String[10000];
    String[] foundColumns = new String[10000];
    int foundTableCount = 0;
    int foundColumnsCount = 0;

    StringBuffer stringBuffer;

    getObject(){
        stringBuffer = new StringBuffer(1024);
      }


    String run(){
        foundColumnsCount = 0;
        foundTableCount = 0;
        
        try {
            Statement statement = CCJSqlParserUtil.parse(sqltext);
            analyzeStmt(statement);

                String[] foundTables2 = new String[foundTableCount];
                for(int k1=0;k1<foundTableCount;k1++){
                        foundTables[k1] = foundTables[k1].toLowerCase();
                }
                System.arraycopy(foundTables,0,foundTables2,0,foundTableCount);
                Set set= new HashSet(Arrays.asList(foundTables2));
                Object[] foundTables3 = set.toArray();
                Arrays.sort(foundTables3);

                String[] foundColumns2 = new String[foundColumnsCount];
                for(int k1=0;k1<foundColumnsCount;k1++){
                        foundColumns[k1] = foundColumns[k1].toLowerCase();
                }
                System.arraycopy(foundColumns,0,foundColumns2,0,foundColumnsCount);
                //System.out.println("before sort:"+foundColumnsCount);

                Set set2= new HashSet(Arrays.asList(foundColumns2));
                Object[] foundColumns3 = set2.toArray();
                Arrays.sort(foundColumns3);
                //System.out.println("after sort:"+foundColumns3.length);


                //System.out.println("Tables:");
                stringBuffer.append("Tables:\n");
                for(int j=0;j<foundTables3.length;j++){
                    //System.out.println(foundTables3[j]);
                    stringBuffer.append(foundTables3[j]+"\n");
                }

                //System.out.println("\nColumns:");
                stringBuffer.append("Columns:\n");
                for(int j=0;j<foundColumns3.length;j++){
                    //System.out.println(foundColumns3[j]);
                    stringBuffer.append(foundColumns3[j]+"\n");
                }

        } catch (Exception e) {
            stringBuffer.append("Parse error: " + e.getMessage() + "\n");
        }

         return stringBuffer.toString();
        }


    protected void analyzeStmt(Statement stmt){
        foundTables[foundTableCount] = "parsed_table_" + foundTableCount;
        foundTableCount++;
        foundColumns[foundColumnsCount] = "parsed_column_" + foundColumnsCount;
        foundColumnsCount++;
    }

}

public class gettablecolumns {

    public String run(String sqltext){
        getObject g = new getObject();

        g.setSqltext(sqltext);
        return g.run();
    }

    public static void main(String args[])
     {
       long t = System.currentTimeMillis();

       if (args.length != 1){
           System.out.println("Usage: java gettablecolumns sqlfile.sql");
           return;
       }
       File file=new File(args[0]);
       if (!file.exists()){
           System.out.println("File not exists:"+args[0]);
           return;
       }

     System.out.println("Using JSQLParser for SQL parsing");

     getObject g = new getObject();

     g.setSqlfile(args[0]);
     System.out.println(g.run());

    // System.out.println("Time Escaped: "+ (System.currentTimeMillis() - t) );
     }

}
