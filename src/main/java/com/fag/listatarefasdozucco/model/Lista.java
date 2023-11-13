package com.fag.listatarefasdozucco.model;


public class Lista {
    private String tarefa;
    private boolean completado;

    public Lista(){

    }

    public Lista(String tarefa, boolean completado){
        this.tarefa = tarefa;
        this.completado = completado;
    }

    public Long getId(Long id){
        return id;
    }

    public void setID(Long id){
    }

    public String getTarefa(){
        return tarefa;
    }

    public void setTaretfa(String tarefa){
        this.tarefa = tarefa;
    }

    public boolean taCompletado(){
        return completado;
    }

    public void setCompletado(boolean completado){
        this.completado = completado;
    }
}
