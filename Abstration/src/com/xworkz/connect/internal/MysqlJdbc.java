package com.xworkz.connect.internal;

public class MysqlJdbc implements Jdbc {
        @Override
    public void save() {
            System.out.println("Running in the save method");
        }
}
