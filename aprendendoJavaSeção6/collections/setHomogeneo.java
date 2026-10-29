package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class setHomogeneo {//set com elementos do mesmo tipo
    public static void main(String[] args) {
        Set<String> lista = new HashSet<String>();/*com < > e colocando dentro dele um tipo, eu acabei de definir q esse conjunto(set) vai
        ser do tipo q eu coloquei dentro do < > */
        /*o set nao respeita a ordem de inserção(a ordem em q eu inseri os elementos), ele nao tem ordenação 
        so sets como treeset e linkedhashset q tem ordenação, cada um diferente*/
        
               lista.add("Annelyse");
        lista.add("Elizabeth");
        lista.add("Eleonor");
        lista.add("Emmeline");
        lista.add("Annabella");

        for(String nomes: lista){
            System.out.println(nomes);
        }
      
    NavigableSet<Integer> listaOrdenada = new TreeSet<>();/*Diferente do Hashset, o TreeSet aceita e garante ordenação com base
    na ordem natural(alfabetica ou crescente).
    o SortedSet é um set mas é um conjunto que aceita ordenação, ele tem algum criterio de ordenação q pode ser a ordem de inseção
    ou um criterio q vc pode definir(falaremos mais dps)
 */ listaOrdenada.add(1);
  listaOrdenada.add(10);
  listaOrdenada.add(56);
  listaOrdenada.add(34);
  listaOrdenada.add(156);
  for(int nums: listaOrdenada){/*aqui ele faz um autobox(converte automaticamente um tipo primitivo pra sua classe, ou ao contrario
    que foi o caso, coloquei int e qnd ele o for, for na lista, ele pega e converte o valor guardado no objeto
    pra um int) */
    System.out.println(nums);
  }

Set<Integer> conjuntoOrdemInsercao= new LinkedHashSet<>();

conjuntoOrdemInsercao.add(1);
conjuntoOrdemInsercao.add(10);
conjuntoOrdemInsercao.add(2);
conjuntoOrdemInsercao.add(20);
for(int nums: conjuntoOrdemInsercao){
    System.out.println(nums);
}

    }
}
