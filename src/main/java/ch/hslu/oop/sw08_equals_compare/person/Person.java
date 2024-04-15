package ch.hslu.oop.sw08_equals_compare.person;

import java.time.LocalDate;
import java.util.Objects;

public class Person implements Comparable<Person> {
    private final long id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public Person(long id, String firstName, String lastName, LocalDate birthDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public long getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + this.id +
                ", firstName=\"" + this.firstName + "\"" +
                ", lastName=\"" + this.lastName + "\"" +
                ", birthDate=" + this.birthDate +
                '}';
    }

    @Override
    public final boolean equals(final Object object) {
        if (object == this) {
            return true;
        }
        return (object instanceof Person p)
                && (p.id == this.id)
                && Objects.equals(this.firstName, p.firstName)
                && Objects.equals(this.lastName, p.lastName)
                && Objects.equals(this.birthDate, p.birthDate);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(this.id, this.firstName, this.lastName, this.birthDate);
    }

    @Override
    public int compareTo(Person other) {
        return Long.compare(this.id, other.id);
    }
}
