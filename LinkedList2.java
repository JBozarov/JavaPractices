package com.company;

import javax.swing.text.Style;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> foods = new LinkedList<String>();
        addInOrder(foods,"Banana");
        addInOrder(foods,"Apple");
        addInOrder(foods,"Orange");
        addInOrder(foods,"Chocolate");
        addInOrder(foods,"Nok");

        printer(foods);
        addInOrder(foods, "Amazon");
        printer(foods);
//        Array list is Amazon
//        Array list is Apple
//        Array list is Banana
//        Array list is Chocolate
//        Array list is Nok
//        Array list is Orange

        visit(foods);


    }


    public static void printer(LinkedList someList){
        for ( int i = 0; i<someList.size(); i++ ) {
            System.out.println("Array list is " + someList.get(i) );
        }
    }


//    public static void iterator(LinkedList linkList) {
//        Iterator<String> j = linkList.iterator();
//        while (j.hasNext()) {
//            System.out.println("Now visitig " + j.next());
//        }
//        System.out.println("----------------------");
//    }

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
                return true;
            } else if (comparison<0) {
                // move to next food
                System.out.println("Moved to next food");
            }
        }
        stringListIterator.add(newFood);
        return true;
    }

    private static void visit(LinkedList foods){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = foods.listIterator();

        if (foods.getFirst() == "") {
            System.out.println("No food in the inventory");
            return;
        } else {
            System.out.println("Now eating" + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = Integer.parseInt(scanner.nextLine());
            switch (action) {
                case 0 :
                    System.out.println("Quitting I am full ");
                    quit = true;
                    break;
                case 1 :
                    if (!goingForward) {
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Next food is " + listIterator.next());
                    }else {
                        System.out.println("All food are eaten");
                    }
                case 2 :
                    if(goingForward) {
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Previous food is " + listIterator.previous());
                    } else {
                        System.out.println("At the start ");
                    }
                case 3 :
                    printMenu();
                    break;
            }
        }


    }

    public static void printMenu(){
        System.out.println("Press 0 for quitting");
        System.out.println("Press 1 to go to next food ");
        System.out.println("Press 2 to go to previous food");
        System.out.println("Press 3 to see Menu");
    }
}
