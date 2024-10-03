package grading_system;

import java.util.Scanner;

public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        String[] names = new String[numStudents];
        double[] grades = new double[numStudents];
        
        // Input loop
        for (int i = 0; i < numStudents; i++) {
            scanner.nextLine(); // Consume newline
            System.out.println("Enter name for student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
            
            System.out.println("Enter grade for " + names[i] + ": ");
            grades[i] = scanner.nextDouble();
        }
        
        // Calculate average
        double sum = 0;
        for (int i = 0; i < numStudents; i++) {
            sum += grades[i];
        }
        double average = sum / numStudents;
        
        // Output results
        System.out.println("\nStudent Grades:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println(names[i] + ": " + grades[i]);
        }
        System.out.printf("Class average: %.2f\n", average);
        
        scanner.close();
    }
}