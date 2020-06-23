package com.company;

public class Main {
    public static void main(String[] args) {

        //isPalindrome testing
        int n = 1253;
        isPalindrome(n);
    }



    // isPalindrome function
    public static boolean isPalindrome(int num) {
        int reversed = 0;
        while ( num != 0 ) {
            int digit = num%10;
            reversed = reversed*10 + digit;
            num = num/10;
        }
        System.out.println(reversed == num);
        return reversed == num;
    }


}
