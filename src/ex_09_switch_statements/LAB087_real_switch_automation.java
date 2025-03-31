package ex_09_switch_statements;
import java.util.Scanner;

public class LAB087_real_switch_automation {
    public static void main(String[] args) {

      //  String browser = args[0];
        //System.out.println(browser);


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the browser name:");
        String browser=scanner.next();

        switch(browser){
                case "chrome":
                System.out.println("do automation work in chrome");
                break;
            case "firfox":
                    System.out.println("do in firefox");
                    break;
            case "edge":
                System.out.println("edge");
                break;

            default:
                System.out.println("worng browser");
                break;


        }
    }
}
