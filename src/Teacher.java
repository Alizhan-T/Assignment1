public class Teacher {
    private String name;
    private String subject;
    private int experience;

    public Teacher(String name, String subject, int experience) {
        this.name = name;
        this.subject = subject;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public int getExperience() {
        return experience;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Teacher(Name: " + name + ", Subject: " + subject + ", Experience: " + experience + " years)";
    }
}
