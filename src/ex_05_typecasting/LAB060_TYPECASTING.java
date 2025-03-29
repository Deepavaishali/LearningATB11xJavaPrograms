package ex_05_typecasting;

public class LAB060_TYPECASTING {
    public static void main(String[] args) {
        long a=987654321l;
        //convert into short
        //can we do directly , which is implicit?
        //NO...
        short s = (short)a;
        //you cant convert into int and store into short like below
        //short s = (int)a;
        // above line is  invalid
        //both ata types should be same


    }
}
