package com.company.Question_4;

import jdk.internal.util.xml.impl.Input;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        1. In this main method initialize a List as an ArrayList.
        Add 6 values of your choosing to this ArrayList.
        2. Create a new method in this class called displayArray that takes a List parameter.
        3. Have this new method use a ForEach loop to iterate through the ArrayList and display each item to the user.
         */

        System.out.println("chose one of the following \n1. Print array list. \n2. Exit ");
        try {
            switch (input.nextInt()) {
                case 1:
                    System.out.println("Printing array list");
                //  arrayListThingy();
                    //i don't know how to get this this work.
                case 2:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
            }

        }catch(InputMismatchException ime){
            System.out.println("please input one of the following options\n1 or 2.");
        }
    }

    public void arrayListThingy() {

        int position = 1;
        List<String> arrayList = new ArrayList();
        arrayList.add("im");
        arrayList.add("very");
        arrayList.add("confused");
        arrayList.add("about");
        arrayList.add("this");
        arrayList.add("question");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(position + ". " + arrayList.get(i));
            position++;


        }
    }
}
