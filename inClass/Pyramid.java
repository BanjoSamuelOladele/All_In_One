package inClass;

public class Pyramid {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            int j = 1;
            int k = 6;
            for (; j < i; j++) {
                System.out.print(" ");
            }
            for (; k > i; k--) {
                System.out.print("*");
            }
            for(int l = 5; l > k; l-- ){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}
