package com.example.demo.service;

import com.example.demo.gclcontroller.SynchronizedTest;

public class TestUrl {
    public static void main(String[]args){

        Lock l1=new Lock(true);

        Lock l2=new Lock(false);



        Thread t1=new Thread(l1);

        Thread t2=new Thread(l2);

        t1.start();

        t2.start();

    }
}
class MyLock{

        static Object lock1=new Object();

        static Object lock2=new Object();



}
    class Lock implements Runnable{

        private boolean flag;

        Lock(boolean flag){

        this.flag=flag;

        }



        public void run(){

        if(flag){

            synchronized(MyLock.lock1){

                System.out.println("if o1");

               synchronized(MyLock.lock2){

                    System.out.println("if o2");
                }

            }

        }else{

            synchronized(MyLock.lock2){

                    System.out.println("else o2");

                synchronized(MyLock.lock1){

                    System.out.println("else o1");
                }

            }

        }



        }



        }



