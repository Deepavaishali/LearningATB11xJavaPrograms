 package ex_05_typecasting;

public class LAB059_typecasting_narrowing {
    public static void main(String[] args) {
        int value = 200;
        //byte b = value;
        //above line is not valid
        //bcoz storing big size into smaller byte one ..
        //what happens -> overflows..so implicit casting in case of narrowing is not valid in type casting
        //still you want to do, do explicitly,which is allowed


        byte b = (byte)value;//valid , but data  loss
        //but can store explicitly
        //but in this case, data loss occurs
        //byte can store 128 only ..but how come 200 value in it..
        //frst 200 converts into binary value , which is 1010101000011
        //from that binary number, 8 bits alone taken
        //then this 8 bit binary number converted into decimal value
        //this decimal value will be different 
        //so output is = -56

        System.out.println(b);
    }
}
