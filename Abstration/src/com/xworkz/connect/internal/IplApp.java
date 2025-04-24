package com.xworkz.connect.internal;

public class IplApp {
    private Jdbc jdbc;

    public IplApp(Jdbc jdbc) {
        this.jdbc = jdbc;


    }

    public void Details() {
        if (jdbc != null){
            System.out.println("running the details");
        }
        else{
            System.out.println("error");
        }
    }
}