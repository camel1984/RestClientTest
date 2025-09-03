package com.example.rest.client;


import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.example.model.Product;
import org.junit.jupiter.api.Test;

public class ClientTest {
    @Test
    public void testPlanText() {
        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target("http://ec2-54-85-129-223.compute-1.amazonaws.com:8080/JaxRSDemo-1.0-SNAPSHOT/helloworld");
        Response response = webTarget.request(MediaType.TEXT_PLAIN).get(); // Invoke a GET request
        System.out.println(response.readEntity(String.class));
    }

    @Test
    public void testJSON() {
        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target("http://ec2-54-85-129-223.compute-1.amazonaws.com:8080/JaxRSDemo-1.0-SNAPSHOT/helloworld/product10");
        Response response = webTarget.request(MediaType.APPLICATION_JSON).get(); // Invoke a GET request
        Product ret = response.readEntity(Product.class);
        System.out.println(ret.getName());
        System.out.println(ret.getPrice());
    }
}
