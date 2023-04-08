public class NUmberOfDays {
    public static void main(String[] args) {
        int dayOfTheWeek, hours, minutes;
        dayOfTheWeek = 1;
        while(dayOfTheWeek <= 7){
            switch (dayOfTheWeek) {
                case 1 -> System.out.print("Monday");
                case 2 -> System.out.print("Tuesday");
                case 3 -> System.out.print("Wednessday");
                case 4 -> System.out.print("Thursday");
                case 5 -> System.out.print("Friday");
                case 6 -> System.out.print("Saturday");
                case 7 -> System.out.print("Sunday");
            }
            System.out.println(" ");
            hours = 0;
            while (hours < 24){
                System.out.print(" "+ hours+ " hour(s).");
                minutes = 0;
                while (minutes < 60){
                    System.out.print(" " + minutes + " min(s)");
                    minutes++;
                }
                System.out.println(" ");
                hours++;
            }
            System.out.println(" ");
            dayOfTheWeek++;
        }
    }
}
