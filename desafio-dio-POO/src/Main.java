import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("descrição java bootcamp developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devThiago = new Dev();
        devThiago.setNome("Thiago");
        devThiago.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: "+devThiago.getConteudosInscritos());
        devThiago.progredir();
        devThiago.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos: "+devThiago.getConteudosConcluidos());
        System.out.println("XP :"+devThiago.calcularTotalXp());
        System.out.println("==========");

        Dev devFulano = new Dev();
        devFulano.inscreverBootcamp(bootcamp);
        devFulano.setNome("Fulano");
        System.out.println("Conteúdos Inscritos: "+devFulano.getConteudosInscritos());
        devFulano.progredir();
        devFulano.progredir();
        devFulano.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos: "+devFulano.getConteudosConcluidos());
        System.out.println("XP: "+ devFulano.calcularTotalXp());
    }
}