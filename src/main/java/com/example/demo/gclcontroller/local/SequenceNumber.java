package com.example.demo.gclcontroller.local;

public class SequenceNumber {

    //①通过匿名内部类覆盖ThreadLocal的initialValue()方法，指定初始值

    private static ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>() {
        public Integer initialValue() {
            System.out.println(5);
            return 0;
        }
    };
    // ②获取下一个序列值

    public int getNextNum() {
        seqNum.set(seqNum.get() + 1);
        System.err.println(6);
        return seqNum.get();

    }

    public static void main(String[] args) {
        SequenceNumber sn = new SequenceNumber();
        //③ 3个线程共享sn，各自产生序列号
        System.err.println(1);
        TestClient t1 = new TestClient(sn);

        TestClient t2 = new TestClient(sn);

        TestClient t3 = new TestClient(sn);

        t1.start();

        t2.start();

        t3.start();

    }


}