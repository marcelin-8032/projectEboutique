package fr.spring.eBoutique.project.dao;


import fr.spring.eBoutique.project.model.CartePaiement;

import java.util.List;

public interface ICartePaiementDAO {

	public CartePaiement getCartePaiment(Integer id);
	public List<CartePaiement> getCartesPaiment (Integer idUtilisateur);
	public CartePaiement addCartePaiement (CartePaiement cartePaiement);
	public void removeCartePaiement(Integer id);

	
}
