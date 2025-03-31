package ex_10_for_loop;

public class LAB110_off_even_from_top50 {
    public static void main(String[] args) {
        //to find even numbers 0 to 50
        //number%2==0
        for(int number=0;number<=50;number++){
            if(number%2==0){
                System.out.println("even" +number);
            }
            else{
                System.out.println("odd" +number);
            }
        }
    }
}
