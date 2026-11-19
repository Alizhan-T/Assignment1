# School Management Model (Java OOP)

A concise Java Object-Oriented Programming project modeling a school directory with inheritance, polymorphism, encapsulation, input validation, and Java Streams.

## Architecture

- **`Person`** — Abstract base class with validated `name` and `age`, `equals`/`hashCode`, and abstract `getDetails()`.
- **`Student` & `Teacher`** — Concrete subclasses adding `grade` and `subject` fields with value-based equality and polymorphic details formatting.
- **`School`** — Directory container supporting add/remove, case-insensitive name search, age filtering, alphabetical sorting, and read-only views via Java Streams.
- **`Main`** — Console demonstration of all domain operations.

## Build & Run

```bash
javac -d out src/*.java
java -cp out Main
```
