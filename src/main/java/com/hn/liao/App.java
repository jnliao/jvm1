package com.hn.liao;

import java.util.ArrayList;

/**
 * @author jnliao
 */
public class App {
    public static void main(String[] args) {
        //demoForYoungGcOften();

        demoForHeapOOM();
    }

    /**
     * 模拟 youngGc
     */
    public static void demoForYoungGc() {
        byte[] array1 = new byte[1024 * 1024];
        array1 = new byte[1024 * 1024];
        array1 = new byte[1024 * 1024];
        array1 = null;

        byte[] array2 = new byte[2 * 1024 * 1024];
    }

    public static void demoForYoungGc2() {
        byte[] array1 = new byte[1024 * 1024];
        array1 = new byte[1024 * 1024];
        array1 = new byte[1024 * 1024];
        array1 = null;

        byte[] array2 = new byte[4 * 1024 * 1024];
    }

    /**
     * 模拟使用cms时，大对象进入老年代
     */
    public static void demoBigObjDirectIntoOld() {
        byte[] array1 = new byte[2 * 1024 * 1024];
    }

    public static void demoForYoungGcOften() {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while (true){
            loadData();
        }

    }

    private static void loadData(){
        byte[] data = null;
        for(int i=0;i<50;i++){
            data  =new byte[100 *1024];
        }
        data = null;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 模拟堆内存溢出 360145
     */
    public static void demoForHeapOOM(){
        long count = 0;
        ArrayList<Object> arrayList = new ArrayList<>();
        while(true){
            arrayList.add(new Object());
            System.out.println("创建第【"+(++count)+"】个对象");
        }
    }



}
