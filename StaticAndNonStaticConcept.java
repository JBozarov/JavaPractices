package com.companyTwo;

public class StaticAndNonStaticConcept {

    String name = "Tom";
    static int age = 25;

    public static void main(String[] args) {

        // how to call static variables and methods
        // 1. Directly
        System.out.println(age); // 25
//        System.out.println(name); error
        sum(); // sum method

        // 2. using class name
        System.out.println(StaticAndNonStaticConcept.age); // 25
        StaticAndNonStaticConcept.sum(); // sum method


        // How to call non static methods and variables
        StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
        // so instance which is obj will immedietly be given non static methods and variables:
        System.out.println(obj.name); // Tom
        obj.sendMe(); // send mail method

        // but what if I try to access static methods / vars ?
        System.out.println(obj.age); // 25
        obj.sum(); // still working why ? Because they use common shared memory that is why but static methods / var are not directly given to obj instances
        


    }


    public void sendMe(){
        System.out.println("send mail method");
    }

    public static void sum(){
        System.out.println("sum method ");
    }
}
