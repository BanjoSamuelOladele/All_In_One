package PlayGround;

public class BarChat2 {
    public static void main(String[] args) {
        int[] array = {1,3,4,5,6, 1, 2, 4, 2, 1,2, 5, 6,7};
        System.out.printf("%s", "Grading Proportion: ");
        for (int index = 0; index < array.length; index++) {
            if (index == args.length - 1){
                System.out.printf("%5d", 100);
            }
            else {
                System.out.printf("%02d - %02d", index *10, index * 10 + 9);
            }
            for (int star = 0; star < array[index]; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
