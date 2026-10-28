package model;

public class GraduateStudent extends Student {

    public GraduateStudent(
            String studentId, String name, String course, int age, double marks) {
        super(studentId, name, course, age, marks);
    }

    @Override
    public String getGrade() {
        if (getMarks() >= 95) return "A+";
        if (getMarks() >= 90) return "A";
        if (getMarks() >= 85) return "B";
        if (getMarks() >= 80) return "C";
        if (getMarks() >= 70) return "D";
        return "F";
    }
}
