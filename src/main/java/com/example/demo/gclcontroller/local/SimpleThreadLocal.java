package com.example.demo.gclcontroller.local;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SimpleThreadLocal {
    private Map valueMap = Collections.synchronizedMap(new HashMap<>());

    public void set(Object newValue) {
        //①键为线程对象，值为本线程的变量副本
        valueMap.put(Thread.currentThread(), newValue);
    }

    public Object get() {
        Thread currentThread = Thread.currentThread();

        Object o = valueMap.get(currentThread);
        //②返回本线程对应的变量
        if (o == null && !valueMap.containsKey(currentThread)) {
        //③如果在Map中不存在，放到Map   中保存起来。


            o = initialValue();

            valueMap.put(currentThread, o);
        }
        return o;
    }
    public void remove() {
        valueMap.remove(Thread.currentThread());

    }

    public Object initialValue() {
        return null;

    }

    public static void main(String[] args) {
        Map map=new HashMap();
        map.put("gcl","1");
        //{gcl=1}
        String[] split = map.toString().split("=");
        String substring = split[1].substring( 0, split[1].length() -1);
        System.out.println(substring);
    }
}
