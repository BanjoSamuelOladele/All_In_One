package inClass;

public class IncrementLoop {
    public static void main(String[] args) {

  //  int counter = 1;
  //  int count = 5;
    int desk = 5;
//    String starKey = "*";

  /*  while(counter< 10)
    {
        if (counter == 1) System.out.println("*");
        if (counter == 2) System.out.println("**");
        if (counter == 3) System.out.println("***");
        if (counter == 4) System.out.println("****");
        if (counter == 5) System.out.println("*****");
        if (counter == 6) System.out.println("******");
        if (counter == 7) System.out.println("*******");
        if (counter == 8) System.out.println("********");
        if (counter == 9) System.out.println("*********");
        counter++;
    }

    while(count > 1){
        if(count == 5) System.out.println(starKey);
        if(count == 4) System.out.println(starKey + starKey);
        if(count == 3) System.out.println(starKey + starKey + starKey);
        if (count == 2) System.out.println(starKey + starKey + starKey + starKey);

        count--;
    }
*//*
        int deck = 0;
    while(deck < 10){
        int coun = 0;
        while (coun <= deck){
            System.out.print("*");
            coun++;
        }
        System.out.println( );
        deck++;
    }
    while(desk > 0){
        int table = 5;
        while(table >= desk){
            System.out.print("#");
            table--;
        }
        System.out.println( );
        desk--;
    }
    */

    for(int trial = 0; trial < 10;){
        int test = 0;
        for (; test <= trial;){
            System.out.print("#");
            test++;
        }
        System.out.println( );
        trial++;
    }

        for(int trial = 0; trial < 10;){
            int test = 0;
            while(test <= trial){
                System.out.print("**");
                test++;
            }
            System.out.println( );
            trial++;
        }
        int i = 2;
        do{
            System.out.println(i);
            i++;
        } while(i <= 5);
}
}
