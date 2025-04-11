package com.java.method.internal;

public class FootwearRunner {
    public static void main(String[] args) {
        Sandal s = new Sandal();
        s.wear();

        Sandal ss = new SportsSandal();
        ss.wear();

        SportsSandal sport = new SportsSandal();
        sport.wear();
        sport.fasten();
    }
}
