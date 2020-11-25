package com.example.demo.gclcontroller;

import java.util.HashMap;
import java.util.Map;

public class SynchronizedTest {
    public synchronized void method1() {
        System.out.println("Method 1 start");
        try {
            System.out.println("Method 1 execute");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method 1 end");
    }

    public synchronized void method2() {
        System.out.println("Method 2 start");
        try {
            System.out.println("Method 2 execute");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method 2 end");
    }


    public static void main(String[] args) {
//        final SynchronizedTest test = new SynchronizedTest();
//
//        new Thread(test::method1).start();
//
//        new Thread(test::method2).start();

        Map<String, Object> mapPara = new HashMap<>();
       // String wjbh = MapUtil.getMapValue(mapPara, "key值");
    }

}
