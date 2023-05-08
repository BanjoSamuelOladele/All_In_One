package chapter5;

import java.util.Scanner;

public class StudentsGrades {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        int x = 5;
        System.out.println(x += x++ - 5);
//        System.out.println(studentGradeCounter());
    }
    public static String studentGradeCounter(){
        int gradeA = 0, gradeB = 0, gradeC =0, gradeD = 0;
        for (int index = 0; index < 5; index++){
            System.out.print("Enter Student name: ");
            String studentName = userInput.nextLine();
            System.out.print("Enter student Grade: ");
            String studentGrade = userInput.nextLine();
            switch (studentGrade.toUpperCase()) {
                case "A" -> gradeA++;
                case "B" -> gradeB++;
                case "C" -> gradeC++;
                case "D" -> gradeD++;
            }
        }
        return "Grade A = " + gradeA + " Grade B = "+ gradeB + " Grade C = "+ gradeC + " Grade D = " + gradeD;
    }
}
