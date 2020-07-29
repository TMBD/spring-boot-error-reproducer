package org.acme.getting.started;

import com.util.MyConfig;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {
    @Inject
    @Named("connectors")
    MyConfig myConfig;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String properties() {
        return myConfig.getName();
    }
}