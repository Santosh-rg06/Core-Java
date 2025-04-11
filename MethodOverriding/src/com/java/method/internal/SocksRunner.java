package com.java.method.internal;

public class SocksRunner {
    public static void main(String[] args) {
        Socks s = new Socks();
        s.wear();

        Socks ws = new WoolenSocks();
        ws.wear();

        WoolenSocks wool = new WoolenSocks();
        wool.wear();
        wool.wash();
    }
}
