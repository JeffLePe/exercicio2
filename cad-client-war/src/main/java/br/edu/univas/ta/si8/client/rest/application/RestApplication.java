package br.edu.univas.ta.si8.client.rest.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.edu.univas.ta.si8.client.impl.InventoryClientImpl;

@ApplicationPath("/rest")
public class RestApplication extends Application{

	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<>();
		classes.add(InventoryClientImpl.class);
		return classes;
	}
	
}
