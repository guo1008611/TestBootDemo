package com.example.demo.gclcontroller.local;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Testlocal {
    static ThreadLocal<SimpleDateFormat> t1 = new ThreadLocal<SimpleDateFormat>();

    static class MyTask implements Runnable {
        static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        int i = 0;

        public MyTask(int i) {
            this.i = i;
        }

        @Override
        public void run() {

            if (t1.get() == null) {
                t1.set(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
                try {
                    // synchronized (sdf) {
                    // 在未加锁的情况下,很可能会出现异常,sdf 并非线程安全的,
                    // 在每个线程中共享的sdf未必能加载完毕
                    // 原子性未能保证
                    Date t2 = sdf.parse("2018-01-29");
                    System.out.println(t2);
                    // }

                    Date t = t1.get().parse("2018-01-29 10:27:" + i % 60);
                    System.out.println(i + ":" + t);
                } catch (ParseException e) {
                    e.printStackTrace();
                }

            }
        }

    }

    public static void main(String[] args) throws InterruptedException {

        MyTask r1 = new MyTask(100);
        ExecutorService exs = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            exs.execute(r1);
        }
    }

}
