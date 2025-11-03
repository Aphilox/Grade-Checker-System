import java.util.InputMismatchException;
import java.util.Scanner;

public class GradecheckSystem {
    public static void main(String[] args) {
     //scanner for reading console input  
        Scanner scanner = new Scanner(System.in);
        int sentinel = 0;
      //repeat until sentinel value is entered
        while (sentinel != -1) {
            float grade;
            int numberOfGrades = 0;
            int gradeAPlus = 0;
            int gradeA = 0;
            int gradeBPlus = 0;
            int gradeB = 0;
            int gradeCPlus = 0;
            int gradeC = 0;
            int gradeDPlus = 0;
            int gradeD = 0;
            grade = 0;

            System.out.println("Hello User, welcome to Group 11's grade check system");
        //comfirm number of grade input
            while (true) {
                System.out.println("How many Grades would you like to enter? ");
                try {
                    numberOfGrades = scanner.nextInt();
                    if (numberOfGrades <= 0) {
                        System.out.println("Please enter a positive number.");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Enter a valid integer.");
                    scanner.next(); // clear invalid input
                }
            }
            //read exact number of grades

            while (numberOfGrades > 0) {
                //comfirm grade input
                while (true) {
                    System.out.println("Enter grade: ");
                    String gradeInput = scanner.next();
                    try {
                        grade = Float.parseFloat(gradeInput.trim());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid grade entered. Please enter a valid number.");
                    }
                }
               //decision statements section
                if ((grade >= 0) && (grade < 45)) {
                    gradeD++;
                    numberOfGrades--;
                } else if ((grade >= 45) && (grade < 50)) {
                    gradeDPlus++;
                    numberOfGrades--;
                } else if ((grade >= 50) && (grade < 56)) {
                    gradeC++;
                    numberOfGrades--;
                } else if ((grade >= 56) && (grade < 60)) {
                    gradeCPlus++;
                    numberOfGrades--;
                } else if ((grade >= 60) && (grade < 66)) {
                    gradeB++;
                    numberOfGrades--;
                } else if ((grade >= 66) && (grade < 76)) {
                    gradeBPlus++;
                    numberOfGrades--;
                } else if ((grade >= 76) && (grade < 86)) {
                    gradeA++;
                    numberOfGrades--;
                } else if ((grade >= 86) && (grade <= 100)) {
                    gradeAPlus++;
                    numberOfGrades--;
                } else {
                    //any grade outside 0-100 is invalid
                    System.out.println("The Grade entered was invalid and will not be counted.");
                }
                //discrement the grade counter
            }

            System.out.println("Number of A+: " + gradeAPlus);
            System.out.println("Number of A: " + gradeA);
            System.out.println("Number of B+: " + gradeBPlus);
            System.out.println("Number of B: " + gradeB);
            System.out.println("Number of C+: " + gradeCPlus);
            System.out.println("Number of C: " + gradeC);
            System.out.println("Number of D+: " + gradeDPlus);
            System.out.println("Number of D: " + gradeD);
           //comfirm sentinel input
            while (true) {
                System.out.println("Enter any number to continue or -1 to quit");
                try {
                    sentinel = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Enter a valid integer.");
                    scanner.next(); // does not cosider invalid inputs for example negative integers and letters
                }
            }
        }
        //close the scanner
        scanner.close();
    }
}