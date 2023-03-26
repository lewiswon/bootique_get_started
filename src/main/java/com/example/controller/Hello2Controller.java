package com.example.controller;


import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/hello2")
public class Hello2Controller {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String get() {

        return "1231312";
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public Hello delete() {

        return new Hello("name");
    }

    public static class Hello {
        public Hello(String name) {
            this.name = name;
        }

        String name;

        public String getName() {
            return name;
        }
    }
}
