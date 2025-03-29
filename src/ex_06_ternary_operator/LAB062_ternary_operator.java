package ex_06_ternary_operator;

public class LAB062_ternary_operator {

    public static void main(String[] args) {
        int age = 10;
        String canIVote = age>=18? "yes, you can vote" : "no, you can't vote";
        //jvm replaces

        System.out.println(canIVote);
        //syntax->   result = condition ? expression1 : expression2;

    }
}
