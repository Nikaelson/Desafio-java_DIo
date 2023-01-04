package br.com.dio.dominio;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Curso cursojava = new Curso();
        cursojava.setTitulo("Curso de java");
        cursojava.setDescricao("Curso de java para quem gosta de desafios!");
        cursojava.setCargaHoraria(40);

        Curso cursojs = new Curso();
        cursojs.setTitulo("Curso de javascript");
        cursojs.setDescricao("Curso de javascript para quem gosta de desafios!");
        cursojs.setCargaHoraria(70);

        Mentoria mentoriajs = new Mentoria();
        mentoriajs.setTitulo("Mentoria javascript");
        mentoriajs.setDescricao("Curso de javascript como absorver");
        mentoriajs.setData(LocalDate.now());

        Bootcamp bootJAVA = new Bootcamp();
        bootJAVA.setNome("Java expert");
        bootJAVA.setDescricao("Java para se apaixonar");
        bootJAVA.setConteudos(cursojava);
        bootJAVA.setConteudos(cursojs);
        bootJAVA.setConteudos(mentoriajs);

        Dev devKael = new Dev();
        devKael.setNome("Kael");
        devKael.increverBootcamp(bootJAVA);

        System.out.println(bootJAVA.getConteudos());
        System.out.println(devKael.getConteudosInscrito());
        devKael.progredir(cursojava);
        System.out.println(devKael.getConteudosInscrito());
        System.out.println(devKael.getConteudosConcluido());
    }
}
