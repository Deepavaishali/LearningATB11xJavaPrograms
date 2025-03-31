package TASKS;

public class task_CLI_option {
    public static void main(String[] args) {
        String name = args[0];
        int age = Integer.parseInt(args[1]);
       int salary= Integer.parseInt(args[2]);
       //if you want give salary value in double
        // double salary = Integer.parseDouble(args[2]);


        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);

    }
}
