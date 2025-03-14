package ex_02_java_basic_part2;

public class LAB009_printF {
    public static void main(String[] args) {
        int a=10;
        System.out.printf("your value is %d",a);
        //%d= int, long, byte, short
        //%s = string values
        //%b= boolean
        //%f = float and double
        //jvm reads the statement, when it reads the perecntage, it matches with integer which is a here
        //output is your value is 10
        int b=20;
        System.out.println(" --- ");
        System.out.printf("%d +%d",a,b);
        System.out.println(" --- ");

    }
}
