package com.sanctionco.jmail;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/validate")
public class JmailResource {

  @GET
  public Response validateEmail(@QueryParam("address") String email) {
    if (!JMail.isValid(email)) {
      return Response.status(Response.Status.BAD_REQUEST).build();
    }

    return Response.ok().build();
  }
}
