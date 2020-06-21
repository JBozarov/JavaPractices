package com.company;

import java.util.ArrayList;

class IntClass {
    int myInt;

    public IntClass (int myInt) {
        this.myInt = myInt;
    }

    public int getMyInt() {
        return this.myInt;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }
}

public class Main {

    // Creating ArrayList, looping and adding 10 values line 11
    public static ArrayList<String> stringList = new ArrayList<String>();

    // I cannot do like because int is not a Class ! so I am commenting it out, instead above
    // I created a IntClass and I can add class as int since we want out list to be integers :
    //  ArrayList<int> myIntList = new ArrayList<int>();

    public static ArrayList<IntClass> myIntList = new ArrayList<IntClass>();

    public static void main(String[] args) {

        for ( int i = 0; i<10; i++ ) {
            stringList.add("Index is " + i);
            myIntList.add(new IntClass(i+20));
        }

        // printing those values that was added
        printList(stringList);
        System.out.println("LINE HERE");
        printIntList(myIntList);
    }

    public static void printList(ArrayList someList) {
        for (int i = 0; i<someList.size(); i++ ) {
            System.out.println("Printing: " + someList.get(i));
        }
    }

    public static void printIntList(ArrayList oneList) {
        for ( int i = 0; i<oneList.size(); i++ ) {
            System.out.println("Int printing" + oneList.get(i));
        }
    }
}
