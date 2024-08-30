package resit.assignment.prog2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Graduates {
    public static void printGraduates(ArrayList<Student> students) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("GraduateStudents.txt"))) {
            writer.write("Following students have graduated so far.\n");
            writer.write("| Student ID | Student Name | Age | Gender | Year of Admission | Year of Graduation |\n");
            for (Student student : students) {
                if (!student.getYearOfGraduation().equals("")) {
                    writer.write("| " + student.getStudentID() + " | " + student.getStudentName() + " | " + student.getAge() + " | " + student.getGender() + " | " + student.getYearOfAdmission() + " | " + student.getYearOfGraduation() + " |\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}