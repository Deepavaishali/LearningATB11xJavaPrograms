package ex_10_for_loop;

public class LAB109_FOR_LOPP_CONDITION {
    public static void main(String[] args) {
        int i =10;
        //initialising outside the loop is possibel in for loop
        //but condition and updation should be inside the loop
        for (;i>0;i--){
            System.out.println(i);
        }
        //output ->10, 9, 8, ....till 1

    }
}
