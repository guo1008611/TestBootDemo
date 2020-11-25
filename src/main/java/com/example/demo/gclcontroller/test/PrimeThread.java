package com.example.demo.gclcontroller.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PrimeThread extends Thread{
    String minPrime;
    PrimeThread(String minPrime) {
        this.minPrime = minPrime;
    }

    public void run() {
        for (int i=0;i<5;i++){
            System.out.print(i+" . . ."+minPrime+"\n");
        }


    }

}
class Diaoyong{
    public static void main(String[] args) throws SQLException {
        PrimeThread a1=new PrimeThread("大哥");
        PrimeThread a2=new PrimeThread("二弟");
        a1.start();
        a2.start();

    }


}