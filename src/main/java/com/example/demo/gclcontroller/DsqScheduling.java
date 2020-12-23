package com.example.demo.gclcontroller;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DsqScheduling {

    private static Map<String, String> putArrayValueToMap(String[] array1, String[] array2) {
        Map<String, String> map = new HashMap<>();
 
        if (array1 == null || array2 == null) {
            return new HashMap<>();
        }
 
        int len;
        if (array1.length > array2.length) {
            len = array1.length;
        } else {
            len = array2.length;
        }
 
        for (int i = 0; i < len; i++) {
            map.put(array1[i], array2[i]);
        }

        return map;
 
    }
 
    public static void main(String[] args) {
        String []array1=new String[]{"天津", "厦门", "福建", "湖南","重庆","北京","上海","深圳","苏州"};
        String []array2=new String[]{"1", "2", "3", "4","5","6","7","8","9"};
        System.out.println(putArrayValueToMap(array1,array2));
    }


    public void test(){
        int[][] num = new int[100][100];
        int n = 6;
        int count =1;

        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                num[i][j]=count++;
            }
        }
        output(num,0,n-1);
    }

    public void output(int[][] num,int start,int end){
        if(start>end || end<=0)return;
        for(int i=start;i<=end;i++){
            System.out.println(num[start][i]);
        }
        for(int i=start+1;i<=end;i++){
            System.out.println(num[i][end]);
        }

        for(int i=end-1;i>=start;i--){
            System.out.println(num[end][i]);
        }
        for(int i=end-1;i>start;i--){
            System.out.println(num[i][start]);
        }

        output(num,start+1,end-1);
    }


}
