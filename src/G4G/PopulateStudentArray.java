package G4G;

import java.util.Arrays;

public class PopulateStudentArray {

    public static void main(String[] args) {
        StudentArray[] arraysOfStudent;
//        arraysOfStudent = new StudentArray[5];
//        arraysOfStudent[0] = new StudentArray(1, "aman");
//        arraysOfStudent[1] = new StudentArray(2, "vaibhav");
//        arraysOfStudent[2] = new StudentArray(3, "shikar");
//        arraysOfStudent[3] = new StudentArray(4, "dharmesh");
//        arraysOfStudent[4] = new StudentArray(5, "mohit");
//
//        for (int index = 0; index < arraysOfStudent.length; index++) {
//            System.out.println("Element at "+ index + " is " + arraysOfStudent[index].roll_Number + " : " + arraysOfStudent[index].studentName);
//        }
        arraysOfStudent = new StudentArray[]{new StudentArray(20, "Dele"), new StudentArray(21, "Femi")};
        for (StudentArray element : arraysOfStudent){
            System.out.println(element.roll_Number + " : " + element.studentName);
        }
        int[][] arrayOfNumbers = new int[3][5];
        int[] arrayIn = new int[0];
        for (int index = 0; index < arrayOfNumbers.length; index++){
            for (int j = 0; j < arrayOfNumbers[index].length; j++){
                 arrayOfNumbers[index][j] += arrayOfNumbers[index][j];
            }
        }
        System.out.println(Arrays.deepToString(arrayOfNumbers));
    }
}
