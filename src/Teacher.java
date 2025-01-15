public class Teacher extends Person {
    private String subject;

    // Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Getter and setter
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String getDetails() {
        return "Teacher: " + toString() + ", Subject: " + subject;
    }

    @Override
    public String toString() {
        return super.toString() + ", Subject: " + subject;
    }
}
