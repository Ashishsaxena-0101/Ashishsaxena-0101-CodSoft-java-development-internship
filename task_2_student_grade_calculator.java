
    import java.util.Scanner;
    public class task_2_student_grade_calculator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the total number of subjects: ");
            int numOfSubjects = scanner.nextInt();

            int total_Marks = 0;
            for (int i = 1; i <= numOfSubjects; i++) {
                System.out.print("Enterthe marks obtained in subject-" + i + " out of 100: ");
                int marks = scanner.nextInt();
                total_Marks += marks;
            }

            double avg_Percentage = (double) total_Marks / numOfSubjects;

            String grade;
            if (avg_Percentage >= 95) {
                grade = "A+";
            } else if (avg_Percentage >= 85) {
                grade = "A";
            } else if (avg_Percentage >= 75) {
                grade = "B";
            } else if (avg_Percentage >= 60) {
                grade = "C";
            } else if (avg_Percentage >= 45) {
                grade = "D";
            } else if (avg_Percentage >= 35) {
                grade = "E";
            } else {
                grade = "Fail";
            }

            System.out.println("\nTotal Marks: " + total_Marks);
            System.out.println("Average Percentage: " + avg_Percentage + "%");
            System.out.println("Grade: " + grade);

            scanner.close();
        }
    }

