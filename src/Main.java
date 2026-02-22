import br.com.dio.challenge.domain.Activities;
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

        System.out.println(activities1);
        System.out.println(activities2);
        System.out.println(mentoring);
    }
}
