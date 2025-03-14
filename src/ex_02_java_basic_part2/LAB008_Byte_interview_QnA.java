package ex_02_java_basic_part2;

public class LAB008_Byte_interview_QnA {
    public static void main(String[] args) {
        int age =80;
        //above statement is valid
        /*but consider in full way, age limit is 123
        byte stores values -128 to 127
        so this value can be stored in byte itself.
        so why do you waste memory by storing it in int data type?*/
        byte age1 = 90;
        System.out.println(age);
        //note:values will be stores during run time



    }
}
