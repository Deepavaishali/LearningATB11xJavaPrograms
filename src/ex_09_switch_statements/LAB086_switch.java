package ex_09_switch_statements;

import java.util.Scanner;

public class LAB086_switch {
    public static void main(String[] args) {
        //get the use input to find the day which they told
        //1->7, 1=  mon, 2= tues
        //8 = invalid or throw error

        //from user cli options
        // int day = Integer.parseInt(args[0]);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day from 1 to 7 ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
                //NOTE: here no default case is typed
            //that time, if you give input as number 6
            //code wont executed and shows none in the output
            //simply it comes out of the loop



        }
    }

}
