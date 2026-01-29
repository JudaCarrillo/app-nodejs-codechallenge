package com.yape.services;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 * A simple REST endpoint that returns a greeting message.
 */
@Path("/hello")
public class GreetingResource {

  /**
   * Handles HTTP GET requests to the /hello endpoint.
   *
   * @return A plain text greeting message.
   */
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String hello() {
    return "Hello from Quarkus REST";
  }
}
