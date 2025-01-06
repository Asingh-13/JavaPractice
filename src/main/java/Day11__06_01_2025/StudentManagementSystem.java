package Day11__06_01_2025;

import java.util.Scanner;

public class StudentManagementSystem {
    private static String[] studentNames = new String[100];
    private static int[] studentId = new int[100];
    private static int[] studentAges = new int[100];
    private static double[] studentGrades = new double[100];
    private static String[][] studentCourses = new String[100][]; // Jagged array for dynamic courses
    private static int studentCount = 1; // Keeps track of the total number of students

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Retrieve Student Information");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    updateStudent(scanner);
                    break;
                case 3:
                    retrieveStudent(scanner);
                    break;
                case 4:
                    displayAllStudents();
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }

    // Function to add a new student
    private static void addStudent(Scanner scanner) {
        if (studentCount >= studentNames.length) {
            System.out.println("Maximum student limit reached!");
            return;
        }

        System.out.print("Enter student name: ");
        scanner.nextLine(); // Consume the newline
        String name = scanner.nextLine();

        System.out.print("Enter student age: ");
        int age = scanner.nextInt();

        System.out.print("Enter student grade: ");
        double grade = scanner.nextDouble();

        System.out.print("Enter the number of courses: ");
        int numCourses = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        String[] courses = new String[numCourses];
        for (int i = 0; i < numCourses; i++) {
            System.out.print("Enter course " + (i + 1) + ": ");
            courses[i] = scanner.nextLine();
        }

        // Store student details
        studentNames[studentCount] = name;
        studentAges[studentCount] = age;
        studentGrades[studentCount] = grade;
        studentCourses[studentCount] = courses;
        studentId[studentCount] = studentCount ;

        studentCount++;
        System.out.println("Student added successfully!");
    }

    // Function to update student information
    private static void updateStudent(Scanner scanner) {
        System.out.print("Enter the studentId (1 to " + (studentCount) + ") to update: ");
        int index = scanner.nextInt();

        if (index < 1 || index >= studentCount) {
            System.out.println("Invalid student index!");
            return;
        }

        System.out.print("Enter new student name (leave blank to keep current): ");
        scanner.nextLine(); // Consume the newline
        String name = scanner.nextLine();
        if (!name.isEmpty()) {
            studentNames[index] = name;
        }

        System.out.print("Enter new age (or -1 to keep current): ");
        int age = scanner.nextInt();
        if (age != -1) {
            studentAges[index] = age;
        }

        System.out.print("Enter new grade (or -1 to keep current): ");
        double grade = scanner.nextDouble();
        if (grade != -1) {
            studentGrades[index] = grade;
        }

        System.out.print("Do you want to update courses? (yes/no): ");
        scanner.nextLine(); // Consume the newline
        String updateCourses = scanner.nextLine();

        if (updateCourses.equalsIgnoreCase("yes")) {
            System.out.print("Enter the number of new courses: ");
            int numCourses = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            String[] courses = new String[numCourses];
            for (int i = 0; i < numCourses; i++) {
                System.out.print("Enter course " + (i + 1) + ": ");
                courses[i] = scanner.nextLine();
            }
            studentCourses[index] = courses;
        }

        System.out.println("Student information updated successfully!");
    }

    // Function to retrieve student information
    private static void retrieveStudent(Scanner scanner) {
        System.out.print("Enter the student Id (0 to " + (studentCount - 1) + ") to retrieve: ");
        int index = scanner.nextInt();

        if (index < 1 || index >= studentCount) {
            System.out.println("Invalid student index!");
            return;
        }

        System.out.println("\n--- Student Information ---");
        System.out.println("Name: " + studentNames[index]);
        System.out.println("Age: " + studentAges[index]);
        System.out.println("Grade: " + studentGrades[index]);
        System.out.println("Student Id: " + studentId[index]);
        System.out.print("Courses: ");
        for (String course : studentCourses[index]) {
            System.out.print(course + " ");
        }
        System.out.println();
    }

    // Function to display all students
    private static void displayAllStudents() {
        if (studentCount == 1) {
            System.out.println("No students to display!");
            return;
        }

        System.out.println("\n--- All Students ---");
        for (int i = 1; i < studentCount; i++) {
            System.out.println("Student " + i + ":");
            System.out.println("  Name: " + studentNames[i]);
            System.out.println("  Age: " + studentAges[i]);
            System.out.println("  Grade: " + studentGrades[i]);
            System.out.print("  Courses: ");
            for (String course : studentCourses[i]) {
                System.out.print(course + " ");
            }
            System.out.println();
        }
    }
}
