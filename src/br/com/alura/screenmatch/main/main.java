package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.entities.OmdbTitle;
import br.com.alura.screenmatch.entities.Title;
import br.com.alura.screenmatch.exception.ErrorInYearConversionException;
import br.com.alura.screenmatch.utils.BuilderGson;
import br.com.alura.screenmatch.utils.OmdbApi;
import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        String movieName = "";
        List<Title> titles = new ArrayList<>();

        while (!movieName.equalsIgnoreCase("sair")) {
            System.out.print("Digite o nome do filme que deseja buscar: ");
            movieName = scanner.nextLine();

            if (movieName.equalsIgnoreCase("sair")) break;

            HttpResponse<String> response = OmdbApi.searchMovieByTitle(movieName.replace(" ", "%20"));

            Gson gson = BuilderGson.createGson();
            OmdbTitle omdbTitle = gson.fromJson(response.body(), OmdbTitle.class);

            try {
                Title myTitle = new Title(omdbTitle);
                titles.add(myTitle);
            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
            } catch (ErrorInYearConversionException e) {
                System.out.println(e.getMessage());
            }

            FileWriter fileWriter = new FileWriter("movies.json");
            fileWriter.write(gson.toJson(titles));
            fileWriter.close();
        }
    }
}