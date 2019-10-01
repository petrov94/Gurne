package com.mythreads;

public class Dete extends Thread{

    private  Garne garne;
    public Dete(Garne garne){
        this.garne=garne;
    }
    public void run(){
        while (true) {
            try {
                garne.qjBob();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
