package br.com.dio.challenge.domain;

public class Activities  extends  Content{

    //Atributos

    // carga horaria
    private int workload;

    @Override
    public double calculateXp() {
        return XP_STANDARD * workload;
    }
    //(xp padrão * cargahoraria)

    //construtor sem argumento

    public Activities() {
    }


    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Activities{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", workload=" + workload +
                '}';
    }


}
