package com.mythreads;

public class Portion {

     private static int number = 0;

    public Portion(){
        ++number;
    }

    public int getNumber() {
        return number;
    }
}
