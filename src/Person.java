import java.util.Objects;

public class Person {
    private String lastName;
    private String firstName;
    private char gender;
    private boolean married;
    private int age;

    public Person() {
        this("Unnamed", "Unamed", 'U', false, 0);
    }

    public Person(String lastName, String firstName, char gender, boolean married, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.married = married;
        this.age = age;
    }

    public Person(Person other) {
        this(other.lastName, other.firstName, other.gender, other.married, other.age);
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

    @Override
    public int hashCode() {
        return Objects.hash(this.lastName, this.firstName, this.gender, this.married, this.age);
    }

    @Override
    public boolean equals(final Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        final Person person = (Person) o;
        return this.gender == person.gender && this.married == person.married && this.age == person.age && Objects.equals(
                this.lastName, person.lastName) && Objects.equals(this.firstName, person.firstName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + this.lastName + '\'' +
                ", firstName='" + this.firstName + '\'' +
                ", gender=" + this.gender +
                ", married=" + this.married +
                ", age=" + this.age +
                '}';
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = this.formatName(lastName);
    }

    private String formatName(final String lastName) {
        String temp = "";
        if ((lastName != null) && (!lastName.isEmpty()) && (lastName.matches("[a-zA-Z]+"))) {
            temp = lastName.substring(0, 1).toUpperCase()
                    + lastName.substring(1);
        }
        return temp;
    }

    public void setFirstName(String firstName) {
        this.firstName = this.formatName(firstName);
    }

    public void setAge(int age) {
        this.age = Math.min(150, Math.max(0, age));
    }
}
