package ro.emanuel.tema1.dao;

import java.util.List;

import ro.emanuel.tema1.pojo.Person;

public interface PersonDAO {
    void deletePersoaneByIds(int[] ids);
    void addPerson(Person person);
    void updateOrasById(int id, String oras);
    List<Person> getAllPersons();
    Person getPersonById(int id);
    boolean deletePerson(int id);
    void updatePerson(Person person);
}
