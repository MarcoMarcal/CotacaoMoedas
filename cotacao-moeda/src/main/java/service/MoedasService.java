package service;

import enums.TipoMoedas;
import jakarta.inject.Singleton;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Singleton
public class MoedasService {
    public String getMoeda(String moeda) throws Exception {
        String url =  "https://economia.awesomeapi.com.br/json/last/" + moeda;
        HttpClient client = HttpClient.newBuilder().build();

        HttpRequest clientRequest = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(clientRequest, HttpResponse.BodyHandlers.ofString());
       return response.body();
    }
}
