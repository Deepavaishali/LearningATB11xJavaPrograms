package ex_02_java_basic_part2;

public class LAB014_multiple_variables {
    public static void main(String[] args) {
        int a=10,b=20,c=30;
        int local;
        local=30;
        local=40;
        local=50;

        System.out.println(local);//it will throw error.
        //bcoz value should be initialised to local .
        //nxt line write as local = 30;

        //you can change the value unlimited times.
        //NOTE: if the variable is final variable, youcannot change the value

    }
}
