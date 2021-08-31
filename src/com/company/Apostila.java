package com.company;

public class Apostila {
    private Conteudo sumario;


    public void setSumario(Conteudo sumario){
        this.sumario = sumario;
    }

    public String getSumario(){
        if(this.sumario == null){
            throw new NullPointerException("Apostila sem sumário");
        }
        return this.sumario.getConteudo();
    }
}
