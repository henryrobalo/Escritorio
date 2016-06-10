package org.academiadecodigo.escritorio;

/**
 * Created by codecadet on 08/06/16.
 */
public class TarefaTelefonica implements Comparable<TarefaTelefonica>{

    private String name;
    private Prioridade prioridade;

    public TarefaTelefonica(String name, Prioridade prioridade) {
        this.name = name;
        this.prioridade = prioridade;
    }


    @Override
    public int compareTo(TarefaTelefonica tarefaTelefonica) {
        if (this.prioridade.ordinal() == tarefaTelefonica.prioridade.ordinal()){
            return 0;

        } else if(this.prioridade.ordinal() > tarefaTelefonica.prioridade.ordinal()){
            return 1;

        }
        return -1;
    }

    @Override
    public String toString() {




        return "Nome: " + name;
    }

    public String getName() {
        return name;
    }
}
