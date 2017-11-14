package br.edu.univas.ta.si8.client.impl;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import br.edu.univas.ta.si8.client.api.InventoryClientService;
import br.edu.univas.ta.si8.client.ejb.interfaces.InventoryClient;

@RequestScoped
public class InventoryClientImpl implements InventoryClientService{
	
	@EJB(mappedName = "java:app/cad-client-ejb-0.1-SNAPSHOT/InventoryClientBean!br.edu.univas.ta.si8.client.ejb.interfaces.InventoryClientRemote")
	private InventoryClient inventoryClient;

	@Override
	public String[] listClientNames() {
		
		return inventoryClient.listClientNames();
		
	}

	@Override
	public String saveNewClient(String name, String email) {
		
		inventoryClient.createNewClient(name, email);
		return "{\"message\": \"Success\"}";
	}

}
