
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lucas
 */
public class Room {

    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        if (!persons.contains(person)) {
            persons.add(person);
        }
    }

    public boolean isEmpty() {
        return persons.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public Person shortest() {
        if (persons.isEmpty()) {
            return null;
        }

        int shortestPerson = getPersons().get(0).getHeight();
        Person person = getPersons().get(0);

        for (Person p : persons) {
            if (p.getHeight() < shortestPerson) {
                shortestPerson = p.getHeight();
                person = p;
            }
        }

        return person;
    }

    public Person take() {
        if (persons.isEmpty()) {
            return null;
        }

        String name = shortest().getName();
        int height = shortest().getHeight();
        
        Person shortPerson = new Person(name, height);

        persons.remove(shortest());
        
        return shortPerson;
    }
}
