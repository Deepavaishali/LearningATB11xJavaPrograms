package ex_01_Java_Basic;

public class LAB010_Println_vs_print {
    public static void main(String[] args) {
        System.out.println("hello world1");
        System.out.println("hello world12");
        //println prints in the new line
        System.out.print("hello world3");
        System.out.print("hello world4");
        //println prints in the same line.it wont print in the next line

        /*output is,
        hello world1
hello world12
hello world3hello world4
         */


    }
}
