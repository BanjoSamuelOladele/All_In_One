package inClass;

public class NumberConcatenate {
    public static void main(String[] args) {
        for(int i = 5; i > 0; i--){
            int numb = 1;
            for(int j = 6; j > i; j--) {
                System.out.print(numb++);
            }
            System.out.println( );
        }
    }
}
