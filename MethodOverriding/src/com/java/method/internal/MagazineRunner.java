package com.java.method.internal;

public class MagazineRunner {
    public static void main(String[] args) {
        Publication pub = new Publication();
        pub.publish();

        Publication mag = new Magazine();
        mag.publish();

        Magazine magazine = new Magazine();
        magazine.publish();
        magazine.displayCoverStory();
    }
}
