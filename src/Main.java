import br.com.dio.challenge.domain.Activities;
import br.com.dio.challenge.domain.Bootcamp;
import br.com.dio.challenge.domain.Dev;
import br.com.dio.challenge.domain.Mentoring;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Activities activities1 = new Activities();
        activities1.setTitle("Curso Java");
        activities1.setDescription("Descrição do curso de Java");
        activities1.setWorkload(8);

        Activities activities2 = new Activities();
        activities2.setTitle("Curso JavaScript");
        activities2.setDescription("Descrição do curso de JavaScript");
        activities2.setWorkload(4);

        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("Mentoria de Java");
        mentoring.setDescription("Descrição do mentoria de Java");
        mentoring.setData(LocalDate.now());

        //System.out.println(activities1);
        //System.out.println(activities2);
        //System.out.println(mentoring);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Descrição Bootcamp Java Developer");
        bootcamp.getContents().add(activities1);
        bootcamp.getContents().add(activities2);
        bootcamp.getContents().add(mentoring);

        Dev devLucas = new Dev();
        devLucas.setName("Lucas");
        devLucas.subscribeBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Lucas: " + devLucas.getSubscribedContents());

        devLucas.progress();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Lucas: " + devLucas.getSubscribedContents());
        System.out.println("Conteúdos Concluídos Lucas: " + devLucas.getCompletedContent());
        System.out.println("XP :" + devLucas.calculateTotalXp());

        System.out.println("_____._____");

        Dev devAna = new Dev();
        devAna.setName("Ana");
        devAna.subscribeBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Ana: " + devAna.getSubscribedContents());

        devAna.progress();
        devAna.progress();
        devAna.progress();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Ana: " + devLucas.getSubscribedContents());
        System.out.println("Conteúdos Concluídos Ana: " + devAna.getCompletedContent());
        System.out.println("XP : " + devAna.calculateTotalXp());

    }
}
