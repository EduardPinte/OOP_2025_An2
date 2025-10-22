package ro.emanuel.tema2.dao;

import java.util.List;

import ro.emanuel.tema2.pojo.Produs;

public interface ProdusDAO {
    void createProdus(Produs produs);
    List<Produs> readProduse();
    void updateProdus(String produs, double pretNou);
    void deleteProdus(String produs);
    Produs getProdusByNume(String produs);
}
