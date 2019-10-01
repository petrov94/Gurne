package com.mythreads;

public class Baba  extends Thread{
    private Garne garne;

    public Baba(Garne garne) {
        this.garne = garne;
    }

    public void run() {
        while (true) {
            try {
                garne.sipiBob();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

