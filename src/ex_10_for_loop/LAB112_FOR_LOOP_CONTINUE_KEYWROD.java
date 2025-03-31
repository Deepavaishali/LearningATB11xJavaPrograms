package ex_10_for_loop;

public class LAB112_FOR_LOOP_CONTINUE_KEYWROD {
    public static void main(String[] args) {
        for(int i=0;i<50;i++){
            if(i==5){
                continue;//skip the cose and move to top
            }
            System.out.println(i);
            //output is 0, 1, 2, 3, 4,skiping number 5, 6, 7 .....till 49
        }
    }
}
