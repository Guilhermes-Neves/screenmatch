package br.com.alura.screenmatch.calc;

import br.com.alura.screenmatch.entities.Title;

public class RecommendationFilter {
    public void filter(Classifiable classifiable) {
        if (classifiable.getClassification() >= 4) {
            System.out.println("Está entre os preferidos do momento");
        } else if (classifiable.getClassification() >= 2) {
            System.out.println("Muito bem avaliado");
        }
        System.out.println("Coloque na sua lista para assistir depois");
    }
}
