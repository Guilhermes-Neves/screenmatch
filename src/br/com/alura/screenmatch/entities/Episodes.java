package br.com.alura.screenmatch.entities;

import br.com.alura.screenmatch.calc.Classifiable;

public class Episodes implements Classifiable {
    private int number;
    private String name;
    private Serie serie;
    private int totalViews;

    public Episodes() {}

    public Episodes(int number, String name, Serie serie) {
        this.number = number;
        this.name = name;
        this.serie = serie;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    @Override
    public int getClassification() {
        if (totalViews > 100) {
            return 4;
        }
        return 2;
    }
}
