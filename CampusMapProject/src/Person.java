public class Person {
    private String name;
    private Dorm dorm;

    public Person(String name, Dorm dorm) {
        this.name = name;
        this.dorm = dorm;
    }

    public String getName() { return name; }
    public Dorm getDorm() { return dorm; }
}