package resit.assignment.prog2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentCollection collection = new StudentCollection();
        collection.addStudents("StudentDetails.csv");
        StudentOperation operation = new StudentOperation(collection);

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Type 1 to view all the students’ details.");
            System.out.println("Type 2 to add new student to the list.");
            System.out.println("Type 3 to search student details.");
            System.out.println("Type 4 to update a student’s details.");
            System.out.println("Type 5 to remove a student.");
            System.out.println("Type 6 to print graduate students.");
            System.out.println("Type 7 to QUIT.");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println(collection);
                    break;
                case 2:
                    operation.addStudent();
                    break;
                case 3:
                    operation.searchStudentByID();
                    break;
                case 4:
                    operation.updateStudentDetails();
                    break;
                case 5:
                    operation.removeStudent();
                    break;
                case 6:
                    operation.printGraduateStudents();
                    Graduates.printGraduates(collection.getStudents());
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice!= 7);
    }
}