package br.com.alura.screenmatch.utils;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class OmdbApi {
    public static HttpResponse<String> searchMovieByTitle(String movie) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        String baseUrl = "https://www.omdbapi.com/";
        String apiKey = "d8270438";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl + "?t=" + movie + "&apikey=" + apiKey))
                .build();

        return client.send(request, HttpResponse.BodyHandlers.ofString());
    }

}
