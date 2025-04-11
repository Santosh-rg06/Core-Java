package com.java.method.internal;

public class MusicRunner {
    public static void main(String[] args) {
        Speaker sp = new Speaker();
        sp.play();

        Speaker bp = new BluetoothSpeaker();
        bp.play();

        BluetoothSpeaker bs = new BluetoothSpeaker();
        bs.play();
        bs.connectDevice();
    }
}
