package com.gautham.java.library;

import java.util.ArrayList;

public class JokeTeller {

    private ArrayList jokes = new ArrayList();

    public JokeTeller() {
        jokes.add("Chicken Joke:\nWhy did the chicken cross the road?"); //just to test that everything works
    }

    public String getJoke() {
        return jokes.get(0).toString(); // could have a random function to get from arraylist
    }
}
