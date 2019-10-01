package com.mythreads;

import org.omg.PortableServer.POA;

import java.util.Comparator;
import java.util.concurrent.ArrayBlockingQueue;

public class Garne {

    private static final int MIN_BOB=5;
    private static final int MAX_BOB=100;
    private int bob = 50;

    ArrayBlockingQueue<Portion> queue = new ArrayBlockingQueue<>(MAX_BOB);

    public void qjBob() throws InterruptedException {
        System.out.println("Qm porciq s nomer "+ queue.take().getNumber() + "   " + queue.size());
    }

    public void sipiBob() throws InterruptedException {
        queue.put(new Portion());
        System.out.println("Sipvam");
     }
//    public synchronized void qjBob(){
//        if(bob == MIN_BOB){
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        bob--;
//        System.out.println("Bob " + bob);
//        notifyAll();
//    }
//
//    public synchronized void sipiBob()  {
//        if(bob == MAX_BOB){
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        bob++;
//        System.out.println("Bob " + bob);
//        notifyAll();
//    }

}
