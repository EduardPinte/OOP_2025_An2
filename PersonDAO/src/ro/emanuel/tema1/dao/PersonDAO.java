package ro.emanuel.tema1.dao;

import java.util.ArrayList;
import java.util.List;

import ro.emanuel.tema1.pojo.Person;

public interface PersonDAO {
    void deletePersonByIds(int[] ids);
    void addPerson(Person person);
    void updateOrasById(int id, String oras);
    List<Person> getAllPerson();
    Person getPersonById(int id);
	static void update(Person x) {
		
		
	}
	static ArrayList<Person> getAll() {
		
		return null;
	}
}
