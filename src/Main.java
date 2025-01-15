public class Main {
    public static void main(String[] args) {
        // Create a school instance
        School school = new School();

        // Add students and teachers
        school.addPerson(new Student("Alice", 14, "8th Grade"));
        school.addPerson(new Student("Bob", 16, "10th Grade"));
        school.addPerson(new Teacher("Mr. Smith", 40, "Mathematics"));
        school.addPerson(new Teacher("Ms. Johnson", 35, "English"));

        // Display all people in the school
        System.out.println("All People in School ");
        school.displayAll();

        // Search by name
        System.out.println("Search Results for 'Alice' ");
        school.searchByName("Alice").forEach(System.out::println);

        // Filter by age
        System.out.println("People Aged 16 ");
        school.filterByAge(16).forEach(System.out::println);

        // Sort by name
        System.out.println("People Sorted by Name ");
        school.sortByName().forEach(System.out::println);

        // Compare two students
        System.out.println("Comparing Students ");
        Student student1 = new Student("Alice", 14, "8th Grade");
        Student student2 = new Student("Bob", 16, "10th Grade");
        System.out.println("Is student1 equal to student2? " + student1.equals(student2));
    }
}
