import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Cliente {

    /*
    *
    Crie uma classe cliente que crie 3 objetos conta e forneça informações aos seus
    atributos.

    * Realize as seguintes operações:
    adicione os objetos criados em uma lista;
    ordene as contas bancárias pelo número - essa será a forma natural de
    ordenação;
    ordene as contas bancárias pelo nome do titular da conta - essa seria uma outra
    forma de ordenação.
    * */

    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();

        Conta conta1 = new Conta(3,"railan",2000.0,200.0);
        Conta conta2 = new Conta(5,"joao",200.0,20.0);
        Conta conta3 = new Conta(1,"maria",7350.0,5200.0);

        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);

        System.out.println("Ordem inserção");

        for(Conta c : contas){
            System.out.println(c);
        }

        System.out.println("\nOrdem natural\n");
        Collections.sort(contas);
        for(Conta c : contas){
            System.out.println(c);
        }

        System.out.println("\nOrdem artificial/secundaria\n");
        TitularOrdenacao titularOrdenacao = new TitularOrdenacao();

        Collections.sort(contas, titularOrdenacao);
        for(Conta c : contas){
            System.out.println(c);
        }
    }



}
