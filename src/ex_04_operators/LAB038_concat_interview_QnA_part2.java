package ex_04_operators;

public class LAB038_concat_interview_QnA_part2 {
    public static void main(String[] args) {
        String first_name ="deepa";
        String second_name= "vaishali";
         int a = 10;
         int b = 10;

        System.out.println(first_name + second_name +a+b);
        //basically the operator checks the first one and second one for concatination, which is string .
        //since first two are string , it treats others also as a string
        System.out.println(a+b+first_name + second_name);
        //it checks first two. which is integer , so it do the math operation
        //when it checks for the third one, it is string..
        //for string, it cant do math opertaion
        //so it concat the string fully

        System.out.println(first_name + second_name +(a+b));
        //if you want to add the integer and concat the  string means
        //you need to use the BODMAS rule
        //bracket of division, multi, add, sub

        /*
        deepavaishali1010
        20deepavaishali
        deepavaishali20
         */

    }
}
