package ex_06_ternary_operator;

public class LAB067_TERNARY_FIND_THREE_MAX {
    public static void main(String[] args) {
        //find maximum between three numbers
        int n1=2;
        int n2= 9;
        int n3= -11;

        //use logic building formula
        //step 1 - find the inpurts and outpputs
        //inputs ->n1,n2,n3
        //outputs -> get from user that is whether to rpint in string or integer
        //o/p = String ->maximum number

        //step 2- rough logic explaination
        //n1>n2 and n1>n3 - o/p n1
        //n2>n1 and n2>n3 - o/p n2
        //if above both statements false, then output is n3
        int maximum = (n1>n2)? (n1>n3)? n1:n3  :   ((n2>n3)?n2:n3);
        System.out.println("maximum is" +maximum);

        //output is 9

        //A - >(n1>n3)? n1:n3
        //B ->((n2>n3)?n2:n3);
    }
}
