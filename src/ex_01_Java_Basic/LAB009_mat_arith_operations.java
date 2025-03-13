package ex_01_Java_Basic;

public class LAB009_mat_arith_operations {
    public static void main(String[] args) {
        System.out.println(10/0);
        //java will throw arithmentic exceptional error, because, its not valid mathematical operation
        //below is the exact error
        /*Exception in thread "main" java.lang.ArithmeticException: / by zero
	at ex_01_Java_Basic.LAB009_mat_arith_operations.main(LAB009_mat_arith_operations.java:5)*/
    }
}
