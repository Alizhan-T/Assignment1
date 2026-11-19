public class Main {
    public static void main(String[] args) {
        School school = new School();

        school.addPerson(new Student("Alice", 14, "8th Grade"));
        school.addPerson(new Student("Bob", 16, "10th Grade"));
        school.addPerson(new Teacher("Mr. Smith", 40, "Mathematics"));
        school.addPerson(new Teacher("Ms. Johnson", 35, "English"));

        System.out.println("=== All People in School ===");
        school.displayAll();

        System.out.println("\n=== Search Results for 'Alice' ===");
        school.searchByName("Alice").forEach(p -> System.out.println("  " + p.getDetails()));

        System.out.println("\n=== People Aged 16 ===");
        school.filterByAge(16).forEach(p -> System.out.println("  " + p.getDetails()));

        System.out.println("\n=== People Sorted by Name ===");
        school.sortByName().forEach(p -> System.out.println("  " + p.getDetails()));

        System.out.println("\n=== Comparing Students ===");
        Student student1 = new Student("Alice", 14, "8th Grade");
        Student student2 = new Student("Bob", 16, "10th Grade");
        Student student1Copy = new Student("Alice", 14, "8th Grade");
        System.out.println("  student1 == student2     : " + student1.equals(student2));
        System.out.println("  student1 == student1Copy : " + student1.equals(student1Copy));
    }
}
