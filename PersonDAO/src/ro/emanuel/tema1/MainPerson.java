package ro.emanuel.tema1;


import java.util.List;

import ro.emanuel.tema1.dao.PersonDAO;
import ro.emanuel.tema1.pojo.Person;

public class MainPerson {

    public static void main(String[] args) throws Exception {

        
   
        PersonDAO personDAO = null;
		List<Person> persons = personDAO.getAllPersons();
        
    
        System.out.println("Lisa persoane");
        for(Person p : persons) {
            System.out.println(p);
        }
        System.out.println();
        
             Person personNoua = new Person(6, 28, "Maria", "Bucuresti");
        personDAO.addPerson(personNoua);
        System.out.println("Person INSERT: " + personNoua);
        System.out.println();
        
      
        Person personUpdate = new Person(2, 26, "Andreea", "Bucuresti"); 
        personDAO.updatePerson(personUpdate);
        System.out.println("Person UPDATE: " + personUpdate);
        System.out.println();
        
        // 5. DELETE BY ID
        boolean deleted = personDAO.deletePerson(6);
        if(deleted == true) {
            System.out.println("Person a fost ștearsă");
        } else {
            System.out.println("Person nu a fost găsită în DB");
        }
        System.out.println();
        
       
        Person personById = personDAO.getPersonById(2);
        if(personById != null) {
            System.out.println(" Person GET BY ID: " + personById);
        } else {
            System.out.println(" Person cu ID=2 nu a fost găsită");
        }
        System.out.println();
        
       
        System.out.println("Lista finala");
        for(Person p : personDAO.getAllPersons()) {
            System.out.println(p);
        }
    }
}