package ro.emanuel.tema2;

import java.util.List;

import ro.emanuel.tema2.dao.ProdusDAO;
import ro.emanuel.tema2.pojo.Produs;

public class MainProdus {

    public static void main(String[] args) throws Exception {

    	
        ProdusDAO produsDAO = null;
        
      
        List<Produs> produse = produsDAO.readProduse();
        
      
        System.out.println("Lista produse");
        for(Produs p : produse) {
            System.out.println(p);
        }
        System.out.println();
        
    
        Produs produsNou = new Produs( 25.0, "briceag", "Germania");
        produsDAO.createProdus(produsNou);
        System.out.println("Produs INSERT: " + produsNou);
        System.out.println();
        
      
        produsDAO.updateProdus("briceag", 35.0);
        System.out.println("Produs UPDATE: briceag 35.0");
        System.out.println();
        
       
        produsDAO.deleteProdus("briceag");
        System.out.println("Produs a fost șters");
        System.out.println();
        
      
        Produs produsByName = produsDAO.getProdusByNume("briceag");
        if(produsByName != null) {
            System.out.println(" Produs GET BY NAME: " + produsByName);
        } else {
            System.out.println(" Produs briceag nu a fost găsit");
        }
        System.out.println();
        
     
        System.out.println("Lista finala");
        for(Produs p : produsDAO.readProduse()) {
            System.out.println(p);
        }
    }
}