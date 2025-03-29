package ex_06_ternary_operator;

public class LAB_64_interview_question {
    public static void main(String[] args) {
        int number = 25;

       // nested ternary operator
        //result = condition1? expression1: (condition2? expresion2 :expression3)
        String result= number >10? "A":"B";//ternary operator
        String result2= number >10? (number >20 ? "Yes, number greater than 20" : "number less than 20"):"B";//nested ternary operator

        System.out.println(result);
        System.out.println(result2);
    }
}
