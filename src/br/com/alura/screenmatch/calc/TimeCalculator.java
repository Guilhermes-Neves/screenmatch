package br.com.alura.screenmatch.calc;

import br.com.alura.screenmatch.entities.Title;

public class TimeCalculator {
    private int totalTime;

    public TimeCalculator() {

    }

    public Integer getTotalTime() {
        return totalTime;
    }

//    public void setTime(Movie m) {
//        totalTime += m.getDurationInMinutes();
//    }

    // Os parametros dos métodos também podem ser referenciados a classe mãe para aplicar polimorfismo
    public void setTime(Title t) {
        totalTime += t.getDurationInMinutes();
    }
}
