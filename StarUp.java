package inClass;

public class StarUp {
    public static void main(String[] args) {
        for(int i = 10; i >= 0; i--){
            int k = 11;
            for(; k > i; k--){
                System.out.print(' ');
            }
            for(int j = 0; j <= k; j++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}
