package com.xworkz.connect.runner;
import com.xworkz.connect.internal.IplApp;
import com.xworkz.connect.internal.Jdbc;
import com.xworkz.connect.internal.MysqlJdbc;
import com.xworkz.connect.internal.OracleJdbc;

public class JdbcRunner {
    public static void main(String[] args) {
        Jdbc jdbc=new MysqlJdbc();
        jdbc.save();

        Jdbc jdbc1 =new OracleJdbc();
        jdbc1.save();

        IplApp iplApp = new IplApp(jdbc);
        iplApp.Details();

    }

}
