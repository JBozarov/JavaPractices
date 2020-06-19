package com.company;


import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        // initializing empty array: int[] arrName = new int[5]
        // initializing array with values: int[] arrName = {1,5,9,3,7};
        
        int[] arr = {12,46,2,99,45,66,45};
        Arrays.sort(arr);
        Collections.reverse(Arrays.asList(arr));

        int[] reversed = reverser(arr);
        looper(arr);
        looper(reversed);
    }

    public static void looper (int[] a) {
        for (int i = 0; i<a.length; i++ ) {
            System.out.println(a[i]);
        }
    }

    public static int[] reverser(int[] a) {
        int[] reversed = new int[a.length];
        for ( int i = 0; i<a.length; i++ ) {
            reversed[i] = a[a.length-1-i];
        }
        return reversed;
    }
}
