package org.academiadecodigo.escritorio;

import java.io.IOException;
import java.util.Iterator;

/**
 * Created by codecadet on 08/06/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        Secretaria ester = new Secretaria();
        Iterator<TarefaTelefonica> iteradorDaEster = ester.iteradorDeTarefas();

//        ester.agendar("ZE", Prioridade.ALTA);
//        ester.agendar("Zé", Prioridade.BAIXA);
//        ester.agendar("To", Prioridade.BAIXA);
//        ester.agendar("To", Prioridade.MEDIA);
//        ester.agendar("MaeEster", Prioridade.MEDIA);

        System.out.println(ester.adicionar("Gervasio da esquina" ,"95455244"));
        System.out.println(ester.removerContacto("maeEster"));
        System.out.println(ester.removerContacto("maria"));

        System.out.println(ester.adicionar("ZE","981232499"));

        System.out.println(ester.adicionar("To","1"));
        System.out.println(ester.adicionar("Zé do alho","2423442423"));
        System.out.println(ester.adicionar("To","3456767534657"));
       System.out.println(ester.adicionar("maria","345768"));
        System.out.println(ester.removerContacto("To"));
        System.out.println(ester.adicionar("maeEster","543245"));

      /* while (iteradorDaEster.hasNext()) {
            ester.ligar();
        }
*/

    }
}
