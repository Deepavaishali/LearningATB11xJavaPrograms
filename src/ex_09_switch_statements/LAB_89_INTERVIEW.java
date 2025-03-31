package ex_09_switch_statements;

public class LAB_89_INTERVIEW {

    public static void main(String[] args) {
        char ch ='A';
        switch(ch){
            //is it a vlid syntax?
            //YES- because, char ch is also an integer
            case 65:
                System.out.println("is 65 matching with A - ASCII VALUE MACTHED");
                break;
            default:
                System.out.println("no match");
                break;


        }
    }
}
