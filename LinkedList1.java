package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> foods = new LinkedList<String>();
        foods.add("Banana");
        foods.add("Apple");
        foods.add("Orange");
        foods.add("Chocolate");

        printer(foods);
        iterator(foods);
        //  Array list is Banana
        //  Array list is Apple
        //  Array list is Orange
        //  Array list is Chocolate
        //  Now visitig Banana
        //  Now visitig Apple
        //  Now visitig Orange
        //  Now visitig Chocolate

        foods.add(1, "Somsa");
        iterator(foods);
//        Now visitig Banana
//        Now visitig Somsa
//        Now visitig Apple
//        Now visitig Orange
//        Now visitig Chocolate
    }


    public static void printer(LinkedList someList){
        for ( int i = 0; i<someList.size(); i++ ) {
            System.out.println("Array list is " + someList.get(i) );
        }
    }


    public static void iterator(LinkedList linkList) {
        Iterator<String> j = linkList.iterator();
        while (j.hasNext()) {
            System.out.println("Now visitig " + j.next());
        }
        System.out.println("----------------------");
    }

    private static boolean addInOrder(LinkedList<String> foods, String newFood) {
        ListIterator<String> stringListIterator = foods.listIterator();

        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newFood);
            System.out.println("comparison is " + comparison);
            if ( comparison == 0 ) {
                // equal, do not add
                System.out.println(newFood + " is alrady there");
            } else if (comparison>0) {
                // new food should appear before this one
                // if comparison > 0 means alphabetical order of newFood is before than next
                stringListIterator.previous();
                stringListIterator.add(newFood);
                return true
            } else if (comparison<0) {
                // move to next food
                System.out.println("Moved to next food");
            }
        }
        stringListIterator.add(newFood);
        return true;
    }
}
