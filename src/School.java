import java.util.*;
import java.util.stream.Collectors;

// Class representing a school
public class School {
    private List<Person> people;

    // Constructor to initialize the list
    public School() {
        this.people = new ArrayList<>();
    }

    // Add a person to the school
    public void addPerson(Person person) {
        people.add(person);
    }

    // Remove a person from the school
    public void removePerson(Person person) {
        people.remove(person);
    }

    // Search people by name
    public List<Person> searchByName(String name) {
        return people.stream()
                .filter(person -> person.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    // Filter people by age
    public List<Person> filterByAge(int age) {
        return people.stream()
                .filter(person -> person.getAge() == age)
                .collect(Collectors.toList());
    }

    // Sort people by name
    public List<Person> sortByName() {
        return people.stream()
                .sorted(Comparator.comparing(Person::getName))
                .collect(Collectors.toList());
    }

    // Display all people in the school
    public void displayAll() {
        if (people.isEmpty()) {
            System.out.println("No people in the school.");
        } else {
            people.forEach(person -> System.out.println(person.getDetails()));
        }
    }
}
