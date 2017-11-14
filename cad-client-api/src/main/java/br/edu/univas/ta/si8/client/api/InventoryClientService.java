package br.edu.univas.ta.si8.client.api;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/inventoryclient")
public interface InventoryClientService {

	@GET
	@Path("/client/names")
	@Produces(MediaType.APPLICATION_JSON)
	String[] listClientNames();
	
	@POST
	@Path("/client/{name}/{email}")
	@Produces(MediaType.APPLICATION_JSON)
	String saveNewClient(@PathParam("name") String name, @PathParam("email") String email);
	
}
