package ex_09_switch_statements;

public class LAB095_INTERVIEW {
    public static void main(String[] args) {
        int a=11;
        switch(-1){
            default:
                System.out.println("default");
                break;
            case 1:
                System.out.println("print 1");
                break;
            case -1:
                System.out.println("print -1");
                break;
                //is this a right program?if yes, what is the answer
            //switch will exute the -1 case alone
        }
    }
}
