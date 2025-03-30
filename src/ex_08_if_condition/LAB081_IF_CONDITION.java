package ex_08_if_condition;

public class LAB081_IF_CONDITION {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if (age>18)
        {
            System.out.println("yes, you can vote");
        }
        else {
            System.out.println("no you cant vote");
        }
   }
}
