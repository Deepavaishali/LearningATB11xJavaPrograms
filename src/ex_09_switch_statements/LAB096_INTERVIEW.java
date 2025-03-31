package ex_09_switch_statements;

public class LAB096_INTERVIEW {
    public static void main(String[] args) {
        char ch= 'C';
        switch (ch){
            default:
                System.out.println("default value");
                break;
            case 'A':
                System.out.println("65");
                break;
            case 'B':
                System.out.println("66");
            break;
            //default case runs, since case C is not present
        }
    }
}
