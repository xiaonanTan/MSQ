package com.txn.config;

import javax.ws.rs.ApplicationPath;

import com.txn.rest.SenderResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
@ApplicationPath("api")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(SenderResource.class);
    }
}