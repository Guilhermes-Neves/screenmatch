package br.com.alura.screenmatch.entities;

import br.com.alura.screenmatch.exception.ErrorInYearConversionException;
import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title>{
    private String name;
    private Integer releaseYear;
    private Boolean includedInThePlan;
    private double sumRating = 0.0;
    private double totalRating = 0.0;
    protected Integer durationInMinutes;

    public Title() {

    }

    public Title(String name, Integer releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public Title(OmdbTitle omdbTitle) {
        this.name = omdbTitle.title();

        if (omdbTitle.year().length() > 4) {
            throw new ErrorInYearConversionException("Não foi possível converter o ano com mais de 4 caracteres");
        }
        this.releaseYear = Integer.valueOf(omdbTitle.year());
        this.durationInMinutes = Integer.valueOf(omdbTitle.runtime().substring(0,2));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Boolean getIncludedInThePlan() {
        return includedInThePlan;
    }

    public void setIncludedInThePlan(Boolean includedInThePlan) {
        this.includedInThePlan = includedInThePlan;
    }

    public Double getSumRating() {
        return sumRating;
    }

    public Double getTotalRating() {
        return totalRating;
    }

    public Integer getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(Integer durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    public String toString() {
        return "Nome: " + getName() +
                " (lançamento: " + getReleaseYear() + ") " +
                "Duração em minutos: " + getDurationInMinutes();
    }

    public void displayTechincalSheet() {
        System.out.println(this);
    }

    public void evaluate(double rate) {
        sumRating += rate;
        totalRating++;
    }

    public double getMedia() {
        return sumRating / totalRating;
    }


    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }
}
