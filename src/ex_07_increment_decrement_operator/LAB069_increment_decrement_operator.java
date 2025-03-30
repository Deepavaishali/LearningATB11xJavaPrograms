package ex_07_increment_decrement_operator;

public class LAB069_increment_decrement_operator {
    //inc - pre inc-> ++a and post inc ->a++
    //dec -> pre dec-> --a and post dec->a--
    public static void main(String[] args) {


        String age = args[0];
        String age1 = args[1];
        String age2 = args[2];
        String age3 = args[3];
        String age4 = args[4];//you havent passed any argument for number 4
        //it throws exception in result says, array index out of bounds exception
        //in edit config, all the values taken as string only, and then you need to convert to integer
        int result= Integer.parseInt(age);
        System.out.println(result);
        System.out.println(age1);
        System.out.println(age2);
        System.out.println(age3);

        //this creates empty arguments , which is you havent get any value from edit config


    }
}
