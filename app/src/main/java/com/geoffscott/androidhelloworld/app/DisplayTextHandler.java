package com.geoffscott.androidhelloworld.app;

import java.util.Random;

/**
 * Created by geoff on 5/30/14.
 */
public class DisplayTextHandler {
    private final Random rand;

    public DisplayTextHandler() {
        rand = new Random();
    }

    public String getDisplayText() {
        int randomInt = rand.nextInt(1000);
        String randomString = String.valueOf(randomInt);
        return randomString;
    }
}
