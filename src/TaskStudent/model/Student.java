package TaskStudent.model;

import java.util.StringJoiner;

public class Student {
    private int StudentId;
    private String firstName;
    private String lastName;
    private String dateBirthday;
    private Faculty faculty;
    private Kurs kurs;
    private String group;

    public Student(int studentId, String firstName, String lastName, String dateBirthday, Faculty faculty, Kurs kurs, String group) {
        StudentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateBirthday = dateBirthday;
        this.faculty = faculty;
        this.kurs = kurs;
        this.group = group;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
                .add("StudentId=" + StudentId)
                .add("firstName='" + firstName + "'")
                .add("lastName='" + lastName + "'")
                .add("dateBirthday='" + dateBirthday + "'")
                .add("faculty=" + faculty)
                .add("kurs=" + kurs)
                .add("group='" + group + "'")
                .toString();
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateBirthday() {
        return dateBirthday;
    }

    public void setDateBirthday(String dateBirthday) {
        this.dateBirthday = dateBirthday;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Kurs getKurs() {
        return kurs;
    }

    public void setKurs(Kurs kurs) {
        this.kurs = kurs;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
