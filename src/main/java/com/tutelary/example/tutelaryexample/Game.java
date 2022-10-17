package com.tutelary.example.tutelaryexample;

public class Game {

    public static void pause() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
