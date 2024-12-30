public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 14, "8th Grade");
        Student student2 = new Student("Bob", 15, "9th Grade");

        Teacher teacher1 = new Teacher("Mr. Smith", "Mathematics", 10);
        Teacher teacher2 = new Teacher("Ms. Johnson", "History", 8);

        School school = new School("Greenwood High", "123 Main St");

        school.addStudent(student1);
        school.addStudent(student2);
        school.addTeacher(teacher1);
        school.addTeacher(teacher2);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(teacher1);
        System.out.println(teacher2);
        System.out.println(school);

        if (student1.getAge() > student2.getAge()) {
            System.out.println(student1.getName() + " is older than " + student2.getName());
        } else {
            System.out.println(student2.getName() + " is older than " + student1.getName());
        }
    }
}
