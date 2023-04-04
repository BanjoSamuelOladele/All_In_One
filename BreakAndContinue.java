package inClass;

public class BreakAndContinue {
    public static void main(String[] args) {

        for (int i = 0;i < 7;i++) {
            if(i == 5){
                continue;
            }
            System.out.println(i);
        }
        System.out.println( );
        System.out.println( );
        int j = 0;
        while( j < 5){
            if(j == 4){
                break;
            }
            System.out.println(j);
            j++;
        }
        System.out.println();
        System.out.println();
        int k = 0;
        while(k < 10){
            k++;
            if(k ==3){
                continue;
            }
            System.out.println(k);
        }
    }
}
