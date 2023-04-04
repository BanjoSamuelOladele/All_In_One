package inClass;

public class PyramidInverse {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            int j = 6;
            int k = 0;
            for (; j > i; j--) {
                System.out.print(" ");
            }
            for (; k < j; k++) {
                System.out.print("*");
            }
            for(int l = 1; l < i; l++ ){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}
