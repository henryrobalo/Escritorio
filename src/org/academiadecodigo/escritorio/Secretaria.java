package org.academiadecodigo.escritorio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by codecadet on 08/06/16.
 */
public class Secretaria {

    private Queue<TarefaTelefonica> tarefaTelefonicas;
    private ListaTelefonica listaTelefonica;

    public Secretaria() throws FileNotFoundException {
        this.tarefaTelefonicas = new PriorityQueue<>();
        this.listaTelefonica = new ListaTelefonica();
    }

    public boolean adicionar(String nome, String numero) throws IOException {

        if (!listaTelefonica.contem(nome)) {
            listaTelefonica.adicionar(nome, numero);
            return true;
        }
        return false;
    }

    public void agendar(String nome, Prioridade p) {

        tarefaTelefonicas.offer(new TarefaTelefonica(nome, p));

    }

    public void ligar() {

        TarefaTelefonica tarefa = tarefaTelefonicas.poll();

        if (listaTelefonica.contem(tarefa.getName())) {
            System.out.println("Estou a ligar para " + tarefa.getName());
        } else {
            System.out.println("Não existe " + tarefa.getName() + " na lista telefonica");
        }
    }

    public boolean removerContacto(String nome) throws IOException {

        if (listaTelefonica.contem(nome)) {

            return listaTelefonica.remover(nome);
        }
        return false;

    }

    public Iterator<TarefaTelefonica> iteradorDeTarefas() {
        return tarefaTelefonicas.iterator();
    }

   }
