import java.util.Objects;

public class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        setGrade(grade);
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        if (grade == null || grade.trim().isEmpty()) {
            throw new IllegalArgumentException("Grade cannot be null or blank");
        }
        this.grade = grade.trim();
    }

    @Override
    public String getDetails() {
        return "Student -> " + toString();
    }

    @Override
    public String toString() {
        return super.toString() + ", Grade: " + grade;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Student student = (Student) obj;
        return Objects.equals(grade, student.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), grade);
    }
}
