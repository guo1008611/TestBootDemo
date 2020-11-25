package com.example.demo.gclcontroller.local;

import java.lang.reflect.Field;

public class TestResflus {
    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("com.example.demo.gclcontroller.TestSynchroinzed");
            Object o = null;
            try {
                o = aClass.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            Field[] declaredFields = o.getClass().getDeclaredFields();
            for (Field a:declaredFields ) {

                System.out.println();
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
