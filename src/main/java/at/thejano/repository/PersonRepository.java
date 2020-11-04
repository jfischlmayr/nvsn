package at.thejano.repository;

import at.thejano.entity.Person;

import javax.enterprise.context.ApplicationScoped;
import java.util.LinkedList;
import java.util.List;

@ApplicationScoped
public class PersonRepository {
    private int ID = 0;
    private List<Person> persons  = new LinkedList<Person>();

    public List<Person> getAll() {
        return this.persons;
    }

    public void add(Person person) {
        person.setId(ID);
        persons.add(person);
        ID++;
    }
}
