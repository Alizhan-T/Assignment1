import java.util.ArrayList;

public class School {
    private String name;
    private String address;
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;

    public School(String name, String address) {
        this.name = name;
        this.address = address;
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public String toString() {
        return "School(Name: " + name + ", Address: " + address + ", Students: " + students.size() + ", Teachers: " + teachers.size() + ")";
    }
}
