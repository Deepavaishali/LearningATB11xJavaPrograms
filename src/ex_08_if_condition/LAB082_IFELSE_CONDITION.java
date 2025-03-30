package ex_08_if_condition;

import java.util.Scanner;

public class LAB082_IFELSE_CONDITION {
    public static void main(String[] args) {
        //cli options
        //int age = Integer.parseInt(args[0]);

        //scanner option
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.println(age);

        if(age>18)
        {
            System.out.println("please vote");
        }
else{
            System.out.println("dont vote");
        }

    }
}
