package TASKS;
import java.util.Scanner;

public class task_even_odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        int number =scanner.nextInt();
        System.out.println(number);

        if (number % 2==0)
        {
            System.out.println("number is even");

        }
        else{
            System.out.println("number is odd");
        }

    }
}
