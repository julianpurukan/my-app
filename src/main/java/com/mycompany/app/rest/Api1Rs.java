package com.mycompany.app.rest;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.POST;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.PathParam;

@Path("/api1Rs")
public class Api1Rs {

	@GET
	@Produces("text/plain")
	public Response doGet() {
		return Response.ok("method doGet invoked").build();
	}

	@POST
	@Consumes({"text/plain", "application/json"})
	public Response doPost(java.lang.String entity) {
		return Response.created(UriBuilder.fromResource(Api1Rs.class).build())
				.build();
	}

	@PUT
	@Consumes({"text/plain", "application/json"})
	public Response doPut(java.lang.String entity) {
		return Response.created(UriBuilder.fromResource(Api1Rs.class).build())
				.build();
	}

	@DELETE
	@Path("/{id}")
	public Response doDelete(@PathParam("id") java.lang.Long id) {
		return Response.noContent().build();
	}
}