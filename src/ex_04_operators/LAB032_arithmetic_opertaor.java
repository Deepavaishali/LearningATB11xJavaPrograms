package ex_04_operators;

public class LAB032_arithmetic_opertaor {
    public static void main(String[] args) {
        //  + addition
        //  - subtraction
        //  * multipication
        //  / division
        //  % modulus
         int  a= 20;
         int b = 3;
          float c= 3f;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);//this value returns only interger part , which is 6 (20/3)

        System.out.println(a/c); //this returns exact value with decimal
        //if you want in deciaml , give in float data type
        System.out.println("a+b");//output is a+b
        System.out.println(a+b);//if you want to fetch the value , a+b without quotes
    }
}
