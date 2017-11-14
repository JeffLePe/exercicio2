package br.edu.univas.ta.si8.client.ejb.interfaces;

public interface InventoryClient {
	
	void createNewClient(String name, String email);
	
	String[] listClientNames(); 

}
