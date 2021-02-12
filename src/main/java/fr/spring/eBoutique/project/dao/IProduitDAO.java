package fr.spring.eBoutique.project.dao;


import fr.spring.eBoutique.project.model.Produit;

import java.util.List;

public interface IProduitDAO {

    Produit getProduit(Integer id);

    List<Produit> getProduitsByCategorie(String categorie);

    Produit addProduit(Produit produit);

    void updateProduit(Produit produit);

    void removeProduit(Integer id);

}
