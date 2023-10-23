package TaskStudent.creator;

import TaskStudent.model.Faculty;
import TaskStudent.model.Kurs;
import TaskStudent.model.Student;
import java.util.Random;
public class IntArrayStudents {
    public static int[] createArray(int size){
        Student[] students = new Student[size];
        Random random = new Random();
        Faculty[] faculties = Faculty.values();
        int FacultyBorder = faculties.length;
        Kurs[] kurs = Kurs.values();
        int KursBorder = kurs.length;
        for (int i = 0; i < size; i++) {
            Student student = new Student();
            int StudentIdRandom = random.nextInt(10000, 99999);
            Student.setId(StudentIdRandom);
            int FacultyRandom = random.nextInt(FacultyBorder);
            Faculty currentFaculty = faculties[FacultyRandom];
            Student.setFaculty(currentFaculty);
            int KursRandom = random.nextInt(KursBorder);
            Kurs currentKurs = kurs[KursRandom];
            Student.setKurs(currentKurs);

        }
    }
