public class DayRoutine {
    public static void main(String[] args) {
        int daysOfWeek, betweenHours;
        daysOfWeek = 1;
        while (daysOfWeek <= 5){
            switch (daysOfWeek){
                case 1 -> System.out.print("Monday");
                case 2 -> System.out.print("Tuesday");
                case 3 -> System.out.print("Wednessday");
                case 4 -> System.out.print("Thursday");
                case 5 -> System.out.print("Friday");
            }
            System.out.println();
            betweenHours = 1;
            while (betweenHours <= 9){
                 System.out.println((betweenHours + 8) + " - " + (betweenHours + 9));
                betweenHours++;
            }
            System.out.println();
            daysOfWeek++;
        }
    }
}
