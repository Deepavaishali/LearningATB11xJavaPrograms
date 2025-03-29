package ex_06_ternary_operator;

public class LAB065_ternary {
    public static void main(String[] args) {
        //find the maximum between two numbers
        int x=10;
        int y = 20;
        //use math functions, which is inbuilt
        System.out.println(Math.max(x,y));
        //use it in ternary operator
        String maximum = x>y ? "x is max" : "y is max";
        System.out.println(maximum);
        //if you want the output is in interger ,then
        int maximum2 = x>y? x :y;
        System.out.println(maximum2);


    }
}
