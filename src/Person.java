import java.util.Objects;

public class Person {
    private String lastName;
    private String firstName;
    private char gender;
    private boolean married;

    public Person() {
        this("Unnamed", "Unamed", 'U', false);
    }

    public Person(String lastName, String firstName, char gender, boolean married) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.married = married;
    }

    public Person(Person other) {
        this(other.lastName, other.firstName, other.gender, other.married);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.lastName, this.firstName, this.gender);
    }

    @Override
    public boolean equals(final Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        final Person person = (Person) o;
        return this.gender == person.gender && Objects.equals(this.lastName, person.lastName) && Objects.equals(
                this.firstName, person.firstName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + this.lastName + '\'' +
                ", firstName='" + this.firstName + '\'' +
                ", gender=" + this.gender +
                '}';
    }

    public void marry(Person other) {
        if (this.equals(other)) {
            System.out.println(
                    "Cannot marry " + this.firstName + " " + this.lastName + " because they are the same person.");
        } else if (other.married) {
            System.out.println(
                    "Cannot marry " + other.firstName + " " + other.lastName + " because they are already married.");
        } else if (this.married) {
            System.out.println(
                    "Cannot marry " + other.firstName + " " + other.lastName + " because " + this.firstName + " " + this.lastName + " is already married.");
        } else {
            other.married = true;
            this.married = true;
            System.out.println(
                    this.firstName + " " + this.lastName + " and " + other.firstName + " " + other.lastName + " are now married.");
        }
    }
}
