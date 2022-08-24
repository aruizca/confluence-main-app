package com.aruizca.confluence.mainapp.controller;

import com.aruizca.confluence.mainapp.api.MainSimpleService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/simple")
public class MainSimpleController {

    private final MainSimpleService mainSimpleService;

    public MainSimpleController(MainSimpleService mainSimpleService) {
        this.mainSimpleService = mainSimpleService;
    }

    @GET
    @Path("/hello")
    public Response sample() {
        return Response.ok("OK with message" + mainSimpleService.getMessage()).build();
    }
}
