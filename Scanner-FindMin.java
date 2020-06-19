package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("ENTER NUMBER NEXT LINE: ");
        int count = Integer.parseInt(scanner.nextLine());

        int[] newArr = readInputs(count);

        int show = findMin(newArr);

        System.out.println("MIN number is: ");
        System.out.println(show);

    }



    public static int[] readInputs(int count) {
        int[] result = new int[count];

        for ( int i = 0; i<result.length; i++ ) {
            int input = Integer.parseInt(scanner.nextLine());
            result[i] = input;
            System.out.println("Please enter next number: ");
        }
        return result;
    }



    public static int findMin(int[] arr) {
        int min = arr[0];
        for ( int i = 0; i<arr.length; i++ ) {
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}


