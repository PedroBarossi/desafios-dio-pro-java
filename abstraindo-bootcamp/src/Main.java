import dominio.*;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        //Criação dos conteúdos
        Curso logicaDeProgramacao = new Curso();
        logicaDeProgramacao.setTitulo("Lógica de Programação");
        logicaDeProgramacao.setDescricao("Curso básico de lógica de programação");
        logicaDeProgramacao.setCargaHoraria(3);

        Mentoria boasVindas = new Mentoria();
        boasVindas.setTitulo("Boas Vindas");
        boasVindas.setDescricao("Abertura do bootcamp");

        Curso javaPoo = new Curso();
        javaPoo.setTitulo("Java Orientado a Objetos");
        javaPoo.setDescricao("Curso de Java direcionado à programação orientada a objetos");
        javaPoo.setCargaHoraria(10);

        //Criação do bootcamp
        Bootcamp javaBasico = new Bootcamp();
        javaBasico.setNome("Java Básico 2022");
        javaBasico.setDescricao("Bootcamp para iniciantes em Java");
        Set<Conteudo> conteudoSet = new LinkedHashSet<>();
        conteudoSet.add(boasVindas);
        conteudoSet.add(logicaDeProgramacao);
        conteudoSet.add(javaPoo);
        javaBasico.setConteudos(conteudoSet);

        //Criação dos devs
        Dev pedro = new Dev();
        pedro.setNome("Pedro");
        Dev duda = new Dev();
        duda.setNome("Eduarda");

        //Interação com o bootcamp
        pedro.inscreverBootcamp(javaBasico);
        System.out.println(pedro.getConteudosInscritos());
        System.out.println(pedro.getConteudosConcluidos());
        duda.inscreverBootcamp(javaBasico);
        System.out.println(duda.getConteudosInscritos());
        System.out.println(duda.getConteudosConcluidos());

        pedro.progredir();
        duda.progredir();
        pedro.progredir();
        pedro.progredir();
        System.out.println(pedro.calcularTotalXp());
        System.out.println(pedro.getConteudosInscritos());
        System.out.println(pedro.getConteudosConcluidos());
        System.out.println(duda.calcularTotalXp());
        System.out.println(duda.getConteudosInscritos());
        System.out.println(duda.getConteudosConcluidos());



    }
}
