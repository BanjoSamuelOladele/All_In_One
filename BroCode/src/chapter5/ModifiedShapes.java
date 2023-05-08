package chapter5;

public class ModifiedShapes {
    public static void main(String[] args) {
        for (int index = 0; index < 10; index++){
            for (int time = 0; time <= index; time++){
                System.out.print("*");
            }
            System.out.println();
//            for (int get = 10; get > 0; get--) {
                int get = 10;
                for (int time = 10; time > 0; time--) {
                    System.out.print(" ");
                }
                for (int time = 0; time < get; time++) {
                    System.out.print("*");
                }
                System.out.println();
//            }

        }
    }
}
