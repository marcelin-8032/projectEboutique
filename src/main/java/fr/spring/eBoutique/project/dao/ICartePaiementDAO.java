package fr.spring.eBoutique.project.dao;


import fr.spring.eBoutique.project.model.CartePaiement;

import java.io.IOException;
import java.util.List;

public interface ICartePaiementDAO {

    CartePaiement getCartePaiment(Integer id);

    List<CartePaiement> getCartesPaiment(Integer idUtilisateur);

    CartePaiement addCartePaiement(CartePaiement cartePaiement);

    void removeCartePaiement(Integer id);

    CartePaiement validate(String cartId) throws IOException;

}
