package com.txn.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/sender")
public class SenderResource {
    private static final Logger LOGGER = LoggerFactory.getLogger(SenderResource.class);

    @GET
    @Path("getInfo")
    public Response sendMessage() {
        LOGGER.info("receive a msg.");
        return Response.ok("hi").build();
    }

}
