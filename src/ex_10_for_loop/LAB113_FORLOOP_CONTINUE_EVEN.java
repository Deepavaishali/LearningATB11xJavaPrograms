package ex_10_for_loop;

public class LAB113_FORLOOP_CONTINUE_EVEN {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {//you can not equal to also
                // if(i!=0) continue
                System.out.println("even ->" + i);

                continue;//skip the cose and move to top
            }
            System.out.println("odd ->" +i);
        }
    }
}
