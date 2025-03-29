package ex_05_typecasting;

public class LAB061_TYPECASTING_USED {
    public static void main(String[] args) {
        int course = 100;
         float  GST = 18.45F;
       // int total = course +GST; //we cant store both values in int type
        //this is narrow - implicit
        //so we have to vonvert
        int total1= course +(int)GST;
        System.out.println(total1);

        //OUTPUT IS 118 , WITHOUT FLOATING VALUE(WHICH IS DATA LOSS)
        float total2= course +GST;//WIDENING - auto - implicit
        float total3 = (float)course + GST;
        System.out.println(total2);
                //output is 118.45
        System.out.println(total3);
        //output = 118.45

    }
}
