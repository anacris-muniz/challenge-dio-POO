package br.com.dio.challenge.domain;

import java.time.LocalDate;

public class Mentoring extends Content{

    private LocalDate data;

    //metodo calcular XP
    @Override
    public double calculateXp() {
        return XP_STANDARD + 20d;
    }

    public Mentoring() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", data=" + data +
                '}';
    }


}
