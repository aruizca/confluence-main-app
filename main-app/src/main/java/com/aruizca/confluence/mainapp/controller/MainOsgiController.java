package com.aruizca.confluence.mainapp.controller;

import com.aruizca.confluence.mainapp.api.MainService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public class MainOsgiController {

    private final MainService mainService;

    public MainOsgiController(MainService mainService) {
        this.mainService = mainService;
    }

    @GET
    @Path("osgi")
    public Response sample() {
        return Response.ok("OK with message" + mainService.getMessage()).build();
    }
}
