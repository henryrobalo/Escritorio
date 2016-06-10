package org.academiadecodigo.escritorio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by codecadet on 08/06/16.
 */
public class ListaTelefonica {

    private Map<String, String> lista;

    public ListaTelefonica() throws FileNotFoundException {
        this.lista = new HashMap<>();
        carregarContactos();
    }

    public void adicionar(String nome, String numero) throws IOException {

        lista.put(nome, numero);
        arquivar();
    }

    public boolean remover(String nome) throws IOException {

        boolean removed= lista.remove(nome, lista.get(nome));
        arquivar();
        return removed;
    }

    public boolean contem(String nome) {
        return lista.containsKey(nome);
    }

    private void arquivar() throws IOException {

        FileManager.save(this.toString());
    }

    private void carregarContactos() throws FileNotFoundException {

        FileManager f = new FileManager();
        String line = "";

        while ((line = f.readLine()) != null) {
            lista.put(line.split(":")[0],
                    line.split(":")[1]);
        }

    }

    @Override
    public String toString() {

        String str = "";

        for (String s:lista.keySet()) {

            str+= s+":"+lista.get(s)+"\n";
        }
        return str;

     /* while (lista.keySet().iterator().hasNext()) {

            str += lista.keySet().iterator().next() + ":" + lista.get(lista.keySet().iterator().next())+ "\n";
        }
        return str;*/
    }
}
