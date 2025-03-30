package TASKS;

public class INCREMENT_DECREMENT {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        //A +B + C
        //++a ->exp A  --->11, a= 11
        //+
        //a++ ->exp B  --->11, a=12
        //+
        //a++ ->exp B --->12, a= 13

        //A+B+C= 11+11+12== 34
        //a= 13
    }
}
