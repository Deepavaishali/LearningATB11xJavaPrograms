package ex_05_typecasting;

public class LAB058_typecasting_widening {
    public static void main(String[] args) {
        byte b= 10;
        int a = b;//implicit widening
        int a1 = (int)b; //explicit widening (doesnt require)
        //this is not necessary to mention explicitly
        //already JVM knows that storing the byte value into int type..then why to mention (int)again?
        //this is called explicit casting in case of widening
        //even if you type (int ), it wont throw errors /..simply unnessary

    }
}
