package ex_07_increment_decrement_operator;

public class LAB071_POST_INC {
    public static void main(String[] args) {
        int a =10;
        System.out.println(++a);
        System.out.println(a);
        //line no |a |expression
        // 5 | 10 NA
        //6 |11 |11

        //POST INCREMENT
        int post_inc= 10;
        System.out.println(post_inc++); //-> FIRST PRINT THEN INCREMENT
        //WHICH IS, 10. POST_IC = 11
        System.out.println(post_inc);

        //line no | post_inc | exp
        //13  | 10 |NA
        //14 |1NA |10
        //15 | NA | 11
    }

}
