import java.util.Scanner;

public class IT24100463Lab9Q4 {

    // a) 30% assignment + 70% exam
    public static double calcFinalMark(double assignment, double exam) {
        return assignment * 0.30 + exam * 0.70;
    }

    // b) grade for a final mark
    public static char findGrades(double mark) {
        if (mark >= 75) {
            return 'A';
        } else if (mark >= 60) {
            return 'B';
        } else if (mark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    // c) print one student's row
    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-15s%-12.2f%c%n", name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;

        String[] names = new String[n];
        double[] finalMarks = new double[n];

        // d) read data
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter Name of Student " + (i + 1) + ": ");
            names[i] = sc.nextLine();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double assignment = Double.parseDouble(sc.nextLine());

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double exam = Double.parseDouble(sc.nextLine());

            finalMarks[i] = calcFinalMark(assignment, exam);
        }

        // display results
        System.out.println();
        System.out.printf("%-15s%-12s%s%n", "Name", "Final Mark", "Grade");
        for (int i = 0; i < n; i++) {
            printDetails(names[i], finalMarks[i], findGrades(finalMarks[i]));
        }
    }
}