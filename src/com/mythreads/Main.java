package com.mythreads;

import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

    public static void main(String[] args) {

        Garne garne = new Garne();
        Dete dete = new Dete(garne);
        Baba baba = new Baba(garne);


        dete.start();
        baba.start();
    }
}
