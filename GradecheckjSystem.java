import javax.swing.JOptionPane;

public class GradecheckjSystem {
    public static void main(String[] args) {
        int sentinel = 0;
        
        // Repeat until sentinel value is entered
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

            JOptionPane.showMessageDialog(null, "Hello User, welcome to Group 11's grade check system");
            
            // Confirm number of grade input
            while (true) {
                String input = JOptionPane.showInputDialog("How many Grades would you like to enter?");
                if (input == null) {
                    // User clicked cancel or closed the dialog
                    System.exit(0);
                }
                try {
                    numberOfGrades = Integer.parseInt(input.trim());
                    if (numberOfGrades <= 0) {
                        JOptionPane.showMessageDialog(null, "Please enter a positive number.");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Enter a valid integer.");
                }
            }
            
            // Read exact number of grades
            while (numberOfGrades > 0) {
                // Confirm grade input
                while (true) {
                    String gradeInput = JOptionPane.showInputDialog("Enter grade:");
                    if (gradeInput == null) {
                        // User clicked cancel or closed the dialog
                        System.exit(0);
                    }
                    try {
                        grade = Float.parseFloat(gradeInput.trim());
                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Invalid grade entered. Please enter a valid number.");
                    }
                }
                
                // Decision statements section
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
                    // Any grade outside 0-100 is invalid
                    JOptionPane.showMessageDialog(null, "The Grade entered was invalid and will not be counted.");
                }
            }

            // Display results in a single message dialog
            StringBuilder results = new StringBuilder();
            results.append("Grade Distribution:\n");
            results.append("Number of A+: ").append(gradeAPlus).append("\n");
            results.append("Number of A: ").append(gradeA).append("\n");
            results.append("Number of B+: ").append(gradeBPlus).append("\n");
            results.append("Number of B: ").append(gradeB).append("\n");
            results.append("Number of C+: ").append(gradeCPlus).append("\n");
            results.append("Number of C: ").append(gradeC).append("\n");
            results.append("Number of D+: ").append(gradeDPlus).append("\n");
            results.append("Number of D: ").append(gradeD);
            
            JOptionPane.showMessageDialog(null, results.toString());
            
            // Confirm sentinel input
            while (true) {
                String input = JOptionPane.showInputDialog("Enter any number to continue or -1 to quit");
                if (input == null) {
                    // User clicked cancel or closed the dialog
                    System.exit(0);
                }
                try {
                    sentinel = Integer.parseInt(input.trim());
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Enter a valid integer.");
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, "Thank you for using Group 11's grade check system!");
        System.exit(0);
    }

}// the end
