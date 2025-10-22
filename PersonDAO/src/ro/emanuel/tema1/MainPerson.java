package ro.emanuel.tema1;

import java.util.ArrayList;

import ro.emanuel.tema1.dao.PersonDAO;
import ro.emanuel.tema1.pojo.Person;

public class MainPerson {

	public static void main(String[] args) throws Exception {
		
		ArrayList<Person> person = PersonDAO.getAll();
		
		
		for(Person p: person) {
			System.out.println(p);
			
		}
		
		
		
		Person x = new Person(3, 21  ,"Sandi", "Sighetu Marmatiei");
		PersonDAO.update(x);

	}
}
