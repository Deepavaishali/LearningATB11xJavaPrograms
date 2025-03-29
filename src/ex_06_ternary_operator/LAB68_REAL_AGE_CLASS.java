package ex_06_ternary_operator;

public class LAB68_REAL_AGE_CLASS {
    public static void main(String[] args) {
        //age = 23
        //classify if it is adult = age>18, minor=age<18, senior =age >65

        //get the inpput from users using multiple ways
        //CLI - COMMAND LINE
        //SCANNER
        //BUFFER READER
        //FILES

        //WE CAN give user input in string type
        String age1 = args[0];//getting inpput from CLI
        //this args [0] is , taking the first value from edit configuration
        //[0] means, it can have lot of values
        System.out.println(age1);
        //if you want to check is age is actually a string or not?
        //then use instance of string
        System.out.println(age1 instanceof String);//output is true

        //convert this string into integer means
        int age =Integer.parseInt(age1);//this is called type conversion

        String result = (age<18)?"minor" : (age <65)?"adult" :"senior";
        System.out.println(result);

        //output

        //66 - which is given inpout in edit config
        //true - which is instance of string or not
        //senior - based on input

    }
}
