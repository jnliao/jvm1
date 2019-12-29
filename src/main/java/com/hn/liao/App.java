package com.hn.liao;

/**
 * @author jnliao
 */
public class App {
    public static void main(String[] args) {
        demoBigObjDirectIntoOld();
    }

    public static void demoForYoungGc(){
        byte[] array1 = new byte[1024 * 1024];
        array1 = new byte[1024 * 1024];
        array1 = new byte[1024 * 1024];
        array1 = null;

        byte[] array2 = new byte[2 * 1024 * 1024];
    }

    public static void demoForYoungGc2(){
        byte[] array1 = new byte[1024 * 1024];
        array1 = new byte[1024 * 1024];
        array1 = new byte[1024 * 1024];
        array1 = null;

        byte[] array2 = new byte[4 * 1024 * 1024];
    }

    public static void demoBigObjDirectIntoOld(){
        byte[] array1 = new byte[2 * 1024 * 1024];
    }
}
