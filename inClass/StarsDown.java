package inClass;

public class StarsDown {
    public static void main(String[] args) {
        for(int i = 10; i > 0; i--){
            int j = 0;
            for(; j<i;j++){
                System.out.print(' ');
            }
            int k = 10;
            for(; k > j; k--){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}
