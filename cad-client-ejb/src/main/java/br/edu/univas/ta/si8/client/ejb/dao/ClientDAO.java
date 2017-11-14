package br.edu.univas.ta.si8.client.ejb.dao;


import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.univas.ta.si8.client.ejb.entities.Client;

@Stateless
public class ClientDAO {

	@PersistenceContext(unitName = "client")
	private EntityManager em;
	
	public void insert(Client client) {
		em.persist(client);
	}
	
	public List<Client> listAll() {
		return em.createQuery("from Client c", Client.class).getResultList();
	}
	
	
}
