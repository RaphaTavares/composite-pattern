package com.company.tests;

import com.company.Apostila;
import com.company.Secao;
import com.company.Topico;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ApostilaTest {

    @Test
    void deveRetornarApostila1Secao2Topicos1Secao1Topico(){
        Apostila apostila = new Apostila();

        Secao secao1 = new Secao("ReactJS", 3);
        Topico topico11 = new Topico("Controle de estados", 5);
        Topico topico12 = new Topico("Redux", 10);

        secao1.addConteudo(topico11);
        secao1.addConteudo(topico12);

        Secao secao2 = new Secao("NodeJS", 15);
        Topico topico21 = new Topico("Criacao do servidor", 18);
        Topico topico22 = new Topico("Conectando no banco com mongoose", 25);
        Topico topico23 = new Topico("Hasheando senha com bcrypt", 34);

        secao2.addConteudo(topico21);
        secao2.addConteudo(topico22);
        secao2.addConteudo(topico23);

        Secao sumario = new Secao("Javascript", 1);
        sumario.addConteudo(secao1);
        sumario.addConteudo(secao2);
        apostila.setSumario(sumario);

        assertEquals("Secao: Javascript - Pag 1\n" +
                "Secao: ReactJS - Pag 3\n" +
                "\t * Controle de estados - Pag 5\n" +
                "\t * Redux - Pag 10\n" +
                "Secao: NodeJS - Pag 15\n" +
                "\t * Criacao do servidor - Pag 18\n" +
                "\t * Conectando no banco com mongoose - Pag 25\n" +
                "\t * Hasheando senha com bcrypt - Pag 34\n", apostila.getSumario());
    }

    @Test
    void deveRetornarExcecaoApostilaSemConteudo(){
        try{
            Apostila apostila = new Apostila();
            apostila.getSumario();
            fail();
        }
        catch(NullPointerException e){
            assertEquals("Apostila sem sumário", e.getMessage());
        }
    }
}
