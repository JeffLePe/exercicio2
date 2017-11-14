package br.edu.univas.ta.si8.client.ejb.beans;

import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.edu.univas.ta.si8.client.ejb.dao.ClientDAO;
import br.edu.univas.ta.si8.client.ejb.entities.Client;
import br.edu.univas.ta.si8.client.ejb.interfaces.InventoryClientLocal;
import br.edu.univas.ta.si8.client.ejb.interfaces.InventoryClientRemote;

@Stateless
@Local(InventoryClientLocal.class)
@Remote(InventoryClientRemote.class)
public class InventoryClientBean implements InventoryClientLocal, InventoryClientRemote{
	
	@EJB
	private ClientDAO dao;

	@Override
	public void createNewClient(String name, String email) {
		
		Client client = new Client();
		client.setName(name);
		client.setEmail(email);
		dao.insert(client);
		
	}

	@Override
	public String[] listClientNames() {
		
		return dao.listAll()
				.stream()
				.map(Client::getName)
				.collect(Collectors.toList())
				.toArray(new String[0]);
		
	}
	

}
