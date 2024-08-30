package resit.assignment.prog2;

import java.util.Scanner;

public class StudentOperation {
    private StudentCollection collection;

    public StudentOperation(StudentCollection collection) {
        this.collection = collection;
    }

    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student ID:");
        String studentID = scanner.nextLine();
        System.out.println("Enter student name:");
        String studentName = scanner.nextLine();
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter gender:");
        char gender = scanner.nextLine().charAt(0);
        System.out.println("Enter grade:");
        int grade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter year of admission:");
        String yearOfAdmission = scanner.nextLine();
        System.out.println("Enter year of graduation:");
        String yearOfGraduation = scanner.nextLine();
        collection.getStudents().add(new Student(studentID, studentName, age, gender, grade, yearOfAdmission, yearOfGraduation));
    }

    public void removeStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student ID to be removed:");
        String idToRemove = scanner.nextLine();
        boolean found = false;
        for (Student student : collection.getStudents()) {
            if (student.getStudentID().equals(idToRemove)) {
                found = true;
                collection.getStudents().remove(student);
                break;
            }
        }
        if (found) {
            System.out.println("Student with ID " + idToRemove + " removed.");
        } else {
            System.out.println("This ID does not exist.");
        }
    }

    public void updateStudentDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student ID whose details need to be updated:");
        String idToUpdate = scanner.nextLine();
        boolean found = false;
        for (Student student : collection.getStudents()) {
            if (student.getStudentID().equals(idToUpdate)) {
                found = true;
                scanner.nextLine();
                System.out.println("Enter new name (or null to keep current):");
                String newName = scanner.nextLine();
                if (!newName.equals("null")) {
                    student.setStudentName(newName);
                }
                System.out.println("Enter new age (or 0 to keep current):");
                int newAge = scanner.nextInt();
                if (newAge!= 0) {
                    student.setAge(newAge);
                }
                scanner.nextLine();
                System.out.println("Enter new gender (or null character to keep current):");
                char newGender = scanner.nextLine().charAt(0);
                if (newGender!= '\u0000') {
                    student.setGender(newGender);
                }
                System.out.println("Enter new grade (or 0 to keep current):");
                int newGrade = scanner.nextInt();
                if (newGrade!= 0) {
                    student.setGrade(newGrade);
                }
                scanner.nextLine();
                System.out.println("Enter new year of admission (or null to keep current):");
                String newYearOfAdmission = scanner.nextLine();
                if (!newYearOfAdmission.equals("null")) {
                    student.setYearOfAdmission(newYearOfAdmission);
                }
                System.out.println("Enter new year of graduation (or null to keep current):");
                String newYearOfGraduation = scanner.nextLine();
                if (!newYearOfGraduation.equals("null")) {
                    student.setYearOfGraduation(newYearOfGraduation);
                }
                break;
            }
        }
        if (!found) {
            System.out.println("This ID does not exist.");
        }
    }

    public void searchStudentByID() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student ID to search for:");
        String idToSearch = scanner.nextLine();
        boolean found = false;
        for (Student student : collection.getStudents()) {
            if (student.getStudentID().equals(idToSearch)) {
                found = true;
                System.out.println(student);
                break;
            }
        }
        if (!found) {
            System.out.println("This ID does not exist.");
        }
    }

    public void printGraduateStudents() {
        // This will be implemented later in Graduates class.
    }
}