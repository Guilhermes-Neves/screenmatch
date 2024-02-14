package br.com.alura.screenmatch.entities;

import br.com.alura.screenmatch.calc.Classifiable;

public class Movie extends Title implements Classifiable {

    private String director;

    public Movie() {
    }

    public Movie(String name, Integer releaseYear) {
        super(name, releaseYear);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) getMedia() / 2;
    }
}
