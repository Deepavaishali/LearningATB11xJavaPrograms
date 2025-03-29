package ex_06_ternary_operator;

public class LAB066_even_or_odd {
    public static void main(String[] args) {
        int number = 10;
        String result = (number%2==0)? "even":"odd";//bracket is important
        System.out.println(result);
    }
}
