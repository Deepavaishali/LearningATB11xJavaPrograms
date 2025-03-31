package ex_09_switch_statements;
import java.util.Scanner;

public class LAB085_SWITCH_without_break {
    public static void main(String[] args) {
        //get the use input to find the day which they told
        //1->7, 1=  mon, 2= tues
        //8 = invalid or throw error

        //from user cli options
       // int day = Integer.parseInt(args[0]);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day from 1 to 7 ");
        int day= scanner.nextInt();

        switch (day){
            case 1:
                System.out.println("monday");

            case 2:
                System.out.println("tuesday");

            case 3:
                System.out.println("wednesday");

            case 4:
                System.out.println("thursday");

            case 5:
                System.out.println("friday");

            case 6:
                System.out.println("saturday");

            case 7:
                System.out.println("sunday");

            default:
                System.out.println("invalid day ");

                //without break means, it will contnue inside the loop
                //example i gave number 3-->output is wed, thurs, fri etc till last

                //NOTE:
                ////in console it ask for number 1 to 7
                //and if  you type "deepa"
                //it throw input mismatch exception error

                //NOTE:
                //apart from values 1 to 7 , if you type anything like -1, 1000, 800,
                //output is invalid day


        }



    }
}
