package PlayGround;

public class BarChart {
    public static void main(String[] args) {
        int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
        System.out.printf("%s", "Grade Distribution: ");

        for (int index = 0; index < array.length; index++) {

            if (index == array.length-1) {
                System.out.printf("%5d", 100);
            }
            else {
                System.out.printf("%02d - %02d", index *10, index * 10 + 9);
            }
            System.out.printf("%s%5d","index = ", index);
            for (int star = 0; star < array[index]; star++) {
                //
                //System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
