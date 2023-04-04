package inClass;

public class Fibonancci {
    public static void main(String[] args) {
        int number = 0;
        int counter = 1;
        System.out.println(number);
        System.out.println(counter);
        for(int i = 0; i < 10; i++){
            int c = number + counter;
            System.out.println(c);
            number = counter;
            counter = c;
        }
    }
}
