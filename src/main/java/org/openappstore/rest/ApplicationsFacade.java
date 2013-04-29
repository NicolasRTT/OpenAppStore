package org.openappstore.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import org.openappstore.entities.Application;

@Path("/applications")
public class ApplicationsFacade {

    @GET
    @Produces("application/json")
    public Application getAll() {
        Application application = new Application("Hello");
        return application;
    }

    @GET
    @Produces("application/json")
    @Path("/{param}")
    public Application sayHello(@PathParam("param") String name) {
        return new Application(name);
    }
}
