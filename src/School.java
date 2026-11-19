import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Container managing students and teachers with search, filter, and sort operations.
 */
public class School {
    private final List<Person> people;

    public School() {
        this.people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        Objects.requireNonNull(person, "Person cannot be null");
        people.add(person);
    }

    public boolean removePerson(Person person) {
        return people.remove(person);
    }

    public List<Person> getPeople() {
        return Collections.unmodifiableList(people);
    }

    public List<Person> searchByName(String query) {
        if (query == null || query.trim().isEmpty()) {
            return Collections.emptyList();
        }
        String normalized = query.trim().toLowerCase();
        return people.stream()
                .filter(person -> person.getName().toLowerCase().contains(normalized))
                .collect(Collectors.toList());
    }

    public List<Person> filterByAge(int age) {
        return people.stream()
                .filter(person -> person.getAge() == age)
                .collect(Collectors.toList());
    }

    public List<Person> sortByName() {
        return people.stream()
                .sorted(Comparator.comparing(Person::getName, String.CASE_INSENSITIVE_ORDER))
                .collect(Collectors.toList());
    }

    public void displayAll() {
        if (people.isEmpty()) {
            System.out.println("No people in the school.");
            return;
        }
        people.forEach(person -> System.out.println("  " + person.getDetails()));
    }
}
