package com.company.Question_3;
import com.company.Question_2.Cat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Switch {
        /*
        1. Create a switch statement in its own method in the Switch class in this package.
        This switch statement should take a string and have 4 cases it could match.
        The default class should inform the user they have not selected an option that is valid and ask them to try again.
        2. Recursion should be used if they hit the default.
        3. Instantiate the switch class in this main method and run the method you created.
         */
        private Scanner input = new Scanner(System.in);

        protected void qestionaire(){
            System.out.println("what is your most liked animal from this selection?");
            System.out.println("1. Cat \n" +
                                "2. Dog \n" +
                                 "3. bird \n" +
                                  "4. fish \n" +
                                   "5. none of the above.");

            try{
                switch(input.nextInt()){
                    case 1:
                        System.out.println("you have picked cat");
                        break;
                    case 2:
                        System.out.println("you have picked dog");
                        break;
                    case 3:
                        System.out.println("you have picked bird");
                        break;
                    case 4:
                        System.out.println("you have picked fish");
                        break;
                    case 5:
                        System.out.println("you have chosen none of the above, dont you like animals?");
                        break;
                }

            }catch(InputMismatchException ime){
                input.nextLine();
                System.out.println("please enter a number of one of the above. ");
                qestionaire();

            }

    }


}
