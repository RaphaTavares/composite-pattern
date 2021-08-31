package com.company;

public class Topico extends Conteudo{

    private int paginaInicial;

    public Topico(String descricao, int paginaInicial){
        super(descricao);
        this.paginaInicial = paginaInicial;
    }

    public int getPaginaInicial() {
        return paginaInicial;
    }

    public Topico setPaginaInicial(int paginaInicial) {
        this.paginaInicial = paginaInicial;
        return this;
    }

    @Override
    public String getConteudo() {
        return "\t * " + this.getdDescricao() + " - Pag " + paginaInicial + "\n";
    }
}
