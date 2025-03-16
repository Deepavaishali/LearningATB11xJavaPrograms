package ex_03_literals;

public class LAB029_character_literals {
    public static void main(String[] args) {
        char c= 'A';//character from A TO Z and a to z
        //char c1= "A";
        // if you put inside double quotes, it is not a character, it is a string
        //and other special characters are !@#$%^&*()_+
        char c2= ' ';//character can have space also as a character(blank space)

        //escape char
        char new_line = '\n';
        char tab_line='\t';
        char back_space='\b';
        char carriage_return='\r';
        System.out.println("deepavaishali");
        System.out.println("deepa" +new_line+"vaishali");
        System.out.println("deepa" +tab_line+"vaishali");
        System.out.println("deepa" +back_space+"vaishali");
        System.out.println("deepa" +carriage_return+"vaishali");

        //instead of using new_line, tab_line, you can use directly \n
        System.out.println("deepa\nvaishali\nall good");

        /*output is,
        deepavaishali
deepa
vaishali
deepa	vaishali
deepvaishali
vaishali
deepa
vaishali
all good
         */

        char c4= 'A';
        //ASCII code has limited values, bcoz of maerican standars
        //but we can use unicode which is unlimited
        char smiley = '\u1f60';//unicode value of smiley
        System.out.println(smiley);//in unicode, smiley is also one of the character


    }
}
