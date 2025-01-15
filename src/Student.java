public class Student extends Person {
    private String grade;

    // Constructor
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    // Getter and setter
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String getDetails() {
        return "Student: " + toString() + ", Grade: " + grade;
    }

    @Override
    public String toString() {
        return super.toString() + ", Grade: " + grade;
    }
}

