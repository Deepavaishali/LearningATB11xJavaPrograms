package ex_04_operators;

public class LAB043_interview_question {
    public static void main(String[] args) {
        int deepa_salary =12;
        boolean b= (!(deepa_salary>10 || deepa_salary<5));
        System.out.println(b);

        //use divide and conquer method
        //deepa_salary>10 = 12>10 = true
        //deepa_salalry<5 = 12<5 = false
        //true || false = true
        //!true = false

        //output is false

    }
}
