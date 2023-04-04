package inClass;

public class FizzBuzz {
    public static void main(String[] args){

        int counter = 0;
            while(counter <= 100){
                int get = counter %3;
                int geet = counter % 5;

                if(get == 0 && geet == 0) System.out.println("FizzBuzz");
               else if(counter % 3 == 0) System.out.println("Fizz");
                else if (counter % 5 == 0) System.out.println("Buzz");
                else System.out.println(counter);
                counter++;
            }

        System.out.println( );
        System.out.println( );

            for(int count = 200; count <= 300; count++){
                if((count % 3 == 0) && (count % 5 == 0)) System.out.println("FizzBuzz");
                else if (count%3 == 0) System.out.println("Fizz");
                else if (count%5 == 0) System.out.println("Buzz");
                else System.out.println(count);
                }
            }

    }
