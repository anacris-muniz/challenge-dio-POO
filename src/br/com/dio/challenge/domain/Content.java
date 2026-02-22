package br.com.dio.challenge.domain;

//conteúdo = mentorias e cursos
public abstract class Content {

  protected static final double XP_STANDARD = 10d;

    //título
    private String title;
    //descrição
    private String description;


    public abstract double calculateXp();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
