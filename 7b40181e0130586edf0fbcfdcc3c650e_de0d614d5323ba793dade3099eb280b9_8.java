package resit.assignment.prog2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StudentCollection {
    private ArrayList<Student> students = new ArrayList<>();

    public ArrayList<Student> getStudents() {
        return students;
    }

    public StudentCollection() {
    }

    public void addStudents(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine())!= null) {
                String[] parts = line.split(",");
                String studentID = parts[0];
                String studentName = parts[1];
                int age = Integer.parseInt(parts[2]);
                char gender = parts[3].charAt(0);
                int grade = Integer.parseInt(parts[4]);
                String yearOfAdmission = parts[5];
                String yearOfGraduation = parts[6];
                students.add(new Student(studentID, studentName, age, gender, grade, yearOfAdmission, yearOfGraduation));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return students.toString();
    }
}