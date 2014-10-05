package org.bitler.rest.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Controller;

@Controller
@Path("start")
public class WelcomePageController {

	@GET
	@Path("1")
	public Response getStatus () {
		return Response.ok("Passed").build();
	}
}
