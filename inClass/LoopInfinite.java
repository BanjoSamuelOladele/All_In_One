package inClass;
import java.sql.SQLOutput;
import java.util.Scanner;
public class LoopInfinite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grade = 0;
        int totalGrade = 0;
        System.out.print("Enter grade or -1 to terminate: ");
        grade = input.nextInt();

        while (grade != -1) {
            totalGrade = totalGrade + grade;
            System.out.print("Enter grade or -1 to terminate: ");
            grade = input.nextInt();
        }
        System.out.println("Total grade is: " + totalGrade);

        System.out.println( );
        System.out.println( );
        System.out.println( );

        int totalScore = 0;
        int counter = 0;
        for (; counter < 5; counter++){
            System.out.print("Enter grade: ");
            int score = input.nextInt();
            totalScore = totalScore + score;


        }
        System.out.println("Average grade is: " + totalScore/counter);
    }
}
