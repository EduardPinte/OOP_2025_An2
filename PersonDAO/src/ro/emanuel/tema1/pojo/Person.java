package ro.emanuel.tema1.pojo;

public class Person {
    private int id;
    private int varsta;
    private String nume;
    private String oras;

    
    public Person() {}

   
    public Person(int id, int varsta, String nume, String oras) {
        this.id = id;
        this.varsta = varsta;
        this.nume = nume;
        this.oras = oras;
    }

    
    public Person(int varsta, String nume, String oras) {
        this.varsta = varsta;
        this.nume = nume;
        this.oras = oras;
    }

   
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getVarsta() { return varsta; }
    public void setVarsta(int varsta) { this.varsta = varsta; }

    public String getNume() { return nume; }
    public void setNume(String nume) { this.nume = nume; }

    public String getOras() { return oras; }
    public void setOras(String oras) { this.oras = oras; }

    
    public String toString() {
        return String.format("ID: %d | %s, %d ani, %s", id, nume, varsta, oras);
    }
}
