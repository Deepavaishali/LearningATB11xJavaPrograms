package ex_04_operators;

public class LAB033_unary_operator {
    public static void main(String[] args) {
        int a= +10;
        int b= -200;
        int result = a+b;

        System.out.println(result);

        int b1=-1;
        b1 = b1+1;
        System.out.println(b1);

        /*output is
        -190
         0
         */

    }
}
