package ch.hslu.oop.sw08_equals_compare.person;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testGetId() {
        Person person = new Person(1L, "Joe", "Mama", LocalDate.of(1990, 1, 1));
        assertEquals(1L, person.getId());
    }

    @Test
    void testGetFirstName() {
        Person person = new Person(2L, "Hans", "Muster", LocalDate.of(1992, 2, 2));
        assertEquals("Hans", person.getFirstName());
    }

    @Test
    void testGetLastName() {
        Person person = new Person(3L, "Peter", "Meier", LocalDate.of(1993, 3, 3));
        assertEquals("Meier", person.getLastName());
    }

    @Test
    void testGetBirthDate() {
        LocalDate birthDate = LocalDate.of(1994, 4, 4);
        Person person = new Person(4L, "John", "Cena", birthDate);
        assertEquals(birthDate, person.getBirthDate());
    }

    @Test
    void testSetFirstName() {
        Person person = new Person(5L, "InitialFirstName", "Kohlkopf", LocalDate.of(1995, 5, 5));
        person.setFirstName("UpdatedFirstName");
        assertEquals("UpdatedFirstName", person.getFirstName());
    }

    @Test
    void testSetLastName() {
        Person person = new Person(6L, "Elle", "InitialLastName", LocalDate.of(1996, 6, 6));
        person.setLastName("UpdatedLastName");
        assertEquals("UpdatedLastName", person.getLastName());
    }

    @Test
    void testSetBirthDate() {
        LocalDate initialDate = LocalDate.of(1997, 7, 7);
        LocalDate updatedDate = LocalDate.of(2000, 1, 1);
        Person person = new Person(7L, "Jolanda", "Treier", initialDate);
        person.setBirthDate(updatedDate);
        assertEquals(updatedDate, person.getBirthDate());
    }

    @Test
    void testToString() {
        LocalDate birthDate = LocalDate.of(1998, 8, 8);
        Person person = new Person(8L, "Bob", "Baumeister", birthDate);
        String expectedToString = "Person{id=8, firstName=\"Bob\", lastName=\"Baumeister\", birthDate=" + birthDate + "}";
        assertEquals(expectedToString, person.toString());
    }

    @Test
    void testEqualsTrue() {
        Person person1 = new Person(1L, "John", "Doe", LocalDate.of(1980, 1, 1));
        Person person2 = new Person(1L, "John", "Doe", LocalDate.of(1980, 1, 1));
        assertTrue(person1.equals(person2));
    }

    @Test
    void testEqualsFalse() {
        Person person1 = new Person(1L, "John", "Doe", LocalDate.of(1980, 1, 1));
        Person person2 = new Person(2L, "John", "Doe", LocalDate.of(1980, 1, 1));
        assertFalse(person1.equals(person2));
    }

    @Test
    void testHashCodeEqualTrue() {
        Person person1 = new Person(1L, "John", "Doe", LocalDate.of(1980, 1, 1));
        Person person2 = new Person(1L, "John", "Doe", LocalDate.of(1980, 1, 1));
        assertEquals(person1.hashCode(), person2.hashCode());
    }

    @Test
    void testHashCodeEqualFalse() {
        Person person1 = new Person(1L, "John", "Doe", LocalDate.of(1980, 1, 1));
        Person person2 = new Person(2L, "John", "Doe", LocalDate.of(1981, 2, 2));
        assertNotEquals(person1.hashCode(), person2.hashCode());
    }
    @Test
    public void testEqualsWithVerifier() {
        EqualsVerifier.forClass(Person.class)
                .suppress(Warning.NONFINAL_FIELDS)
                .verify();
    }

    @Test
    void testCompareToLessThan() {
        Person person1 = new Person(1L, "John", "Doe", LocalDate.of(1980, 1, 1));
        Person person2 = new Person(2L, "John", "Smith", LocalDate.of(1980, 1, 1));
        assertTrue(person1.compareTo(person2) < 0);
    }

    @Test
    void testCompareToGreaterThan() {
        Person person1 = new Person(1L, "John", "Doe", LocalDate.of(1980, 1, 1));
        Person person2 = new Person(2L, "John", "Smith", LocalDate.of(1980, 1, 1));
        assertTrue(person2.compareTo(person1) > 0);
    }

    @Test
    void testCompareToEqualTo() {
        Person person1 = new Person(1L, "John", "Doe", LocalDate.of(1980, 1, 1));
        Person person2 = new Person(1L, "John", "Doe", LocalDate.of(1980, 1, 1));
        assertEquals(0, person1.compareTo(person2));
    }

    @Test
    void testPersonSorting() {
        List<Person> people = new ArrayList<>();
        people.add(new Person(1, "Xavier", "Klemens", LocalDate.of(1990, 1, 1)));
        people.add(new Person(2, "Anabel", "Belmonté", LocalDate.of(1991, 2, 2)));
        people.add(new Person(3, "Anabel", "Huber", LocalDate.of(1992, 3, 3)));

        // Sort the list using PersonNameComparator
        Collections.sort(people, new PersonNameComparator());

        // Assert the order is as expected
        assertEquals(2L, people.get(0).getId());
        assertEquals(3L, people.get(1).getId());
        assertEquals(1L, people.get(2).getId());

        //Println
        for (Person p : people) {
            System.out.println(p);
        }
    }
}
