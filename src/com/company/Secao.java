package com.company;

import java.util.ArrayList;
import java.util.List;

public class Secao extends Conteudo{

    private List<Conteudo> conteudos;
    private int paginaInicial;

    public Secao(String descricao, int paginaInicial){
        super(descricao);
        this.conteudos = new ArrayList<Conteudo>();
        this.paginaInicial = paginaInicial;
    }

    public void addConteudo(Conteudo conteudo){
        this.conteudos.add(conteudo);
    }

    @Override
    public String getConteudo() {
        String saida = "";
        saida = "Secao: " + this.getdDescricao() + " - Pag " + paginaInicial + "\n";
        for(Conteudo conteudo : conteudos)
        {
            saida += conteudo.getConteudo();
        }
        return saida;
    }
}
