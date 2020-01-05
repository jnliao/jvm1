package com.hn.liao;

/**
 * @author jnliao
 */
public class App {
    public static void main(String[] args) {
        demoForYoungGcOften();
    }

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



}
