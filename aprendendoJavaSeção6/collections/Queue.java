package collections;

import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {
        java.util.Queue<String> fila = new LinkedList<>();
/*NA PRATICA:
OFFER E POLL sao melhores. Offer pra adicionar e Poll para tirar 
E lembrando que em FILA, o ultimo adicionado fica em ultimo por causa dos metodos da propria fila, ja em pilha,
o ultimo adicionado é colocado em 1.*/







        //Metodos que adicionam
        /*quando voce tem filas que tem uma restrinção de tamanho(é possivel dizer q uma fila tem por 
        exemplo, um tamanho de max 100, e a partir dali ele nao permite nehnum elemento de ser adicionado
        a menos que voce tire um elemento da fila).
        Quando o offer tenta adicionar um elemento e uma fila cheia, ele retorna false caso n consiga adicionar(retornaria true se 
        conseguisse).
        O add retorna um erro qnd vc tenta adicionar um elemento q n cabe mais na fila.*/
        fila.add("Ana");
        fila.offer("Jennifer");
        fila.offer("Ravi");
        fila.offer("Richard");

        //Metodos que pegam o proximo elemento da fila sem remover(ent sempre pega o msm elemento se eu n remover nada)
        //"Quem é o proximo? Jennifer! Espera q n é sua vez"
        /*A diferença deles é que se eu chamar um desses metodos quando a fila ta vazia, o PEEK retorna um valor padrao
        nulo(pq collections so pegam objeto), e ELEMENT retorna um erro */

        System.out.println(">>" + fila.peek());//ele pega o 1 elemento da fila que é o 1 adicionado
        System.out.println(">>" + fila.peek());//ele pega o msm elemento, pq a função dele(e do element)
        // é so pegar e nao pegar e remover pra ir pro 
        //proximo elemento(q seria a jennifer)
        System.out.println(">>" + fila.element());
        System.out.println(">>" + fila.element());

        
        //fila.size(); ve o tamanho da fila
        //fila.clear(); limpa a fila(exlcloi os elementos dela)
        //fila.isEmpty(); verifica se a fila ta ou n vazia
        //fila.contains(); ve se um elemento ta ou n contido na fila
        System.out.println();
        for(String filaenormee: fila){//pegou o 1 da fila, que foi o 1 adicionado
            System.out.println(filaenormee);
        }
    System.out.println();
       //Metodo que pega o proximo elemento da fila e remove ele(por ordem do FiFo) 
       //"Quem é o proximo? Jennifer! Agora pode vir!"
        System.out.println(fila.poll());//pegou a ana(1 a chegar, querido FIFO), e removeu
        System.out.println(fila.poll());//pegou o proximo, a jennifer e removeu
        System.out.println(fila.remove());//pegou o prox, o ravi e removeu
        System.out.println(fila.remove());//chegou no ultimo, e removeu
        System.out.println(fila.isEmpty());
        //se eu chamar o poll de novo, por mais q ele n tenha mais nada pra tirar ele retorna um nulo e n uma exceção
        //agora se eu chamar o remove pra remover um elemento de uma lista vazia, ele retorna uma exceção
        
    
    
    
    
    
    
    
    }
}
