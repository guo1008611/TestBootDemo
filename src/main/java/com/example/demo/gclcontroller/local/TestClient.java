package com.example.demo.gclcontroller.local;

public  class TestClient extends Thread{

    private SequenceNumber sn;

    public TestClient(SequenceNumber sn) {
        System.err.println(1);
        this.sn = sn;

    }

    //④每个线程打出3个序列值
    public void run(){
        System.err.println(3);
        for (int i = 0; i < 3; i++) {
            System.out.println("thread["+Thread.currentThread().getName()+"] sn["+sn.getNextNum()+"]");
        }
    }

}

