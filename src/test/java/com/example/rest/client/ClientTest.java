package com.example.rest.client;


import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.junit.jupiter.api.Test;

public class ClientTest {
    @Test
    public void testPlanText() {
        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target("http://ec2-54-85-129-223.compute-1.amazonaws.com:8080/JaxRSDemo-1.0-SNAPSHOT/helloworld");
        Response response = webTarget.request(MediaType.TEXT_PLAIN).get(); // Invoke a GET request
        System.out.println(response.readEntity(String.class));
    }
}
