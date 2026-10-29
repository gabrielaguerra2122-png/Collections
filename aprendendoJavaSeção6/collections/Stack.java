package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();
/*NA PRATICA O PUSH E POP SAO MELHORES PARA PILHA(se eu quero uma pilha com comportamento de pilha e NAO de fila).
Push pra adicionar no topo da pilha e pop pra tirar esse elemento q ta no topo da pilha */
/*Exemplo: to adicionando o ultimo elemento na minha pilha, usando o push, esse ultimo elemento fica em 1.
se eu usasse o add, ele ia colocar esse ultimo, em ultimo.
*/






        //Metodos de adicionar:
        /*Nesses casos eu tambem posso ter o caso de definir um tamanho pra pilha, e se ela tiver cheia e eu chamar o push
        ele retorna uma exceção
        ja o add retorna false se ele nao conseguir */

        livros.push("O pequeno principe");//se conseguir adicionar ele retorna um true e se nao um false.
        livros.push("Orgulho e Preconceito");//nao retorna nada e como é void n da pra imprimir
        livros.push("Razão e Sensibilidade");
        /*uma diferença crucial é que o push adiciona elementos no topo da pilha
        e o add ao final.
        Por isso quando eu trabalhar com pilhas, eu uso especificamente o PUSH
        Enquanto na fila é o ADD ou OFFER */


        /*Mesmos metodos de pegar um elemento, a diferença é que na pilha, o ultimo a entrar é o 1 
        a sair(LIFO), ent ele pega o ultimo adicionado, na fila o 1 a entrar é o 1 a sair(FIFO) */
        System.out.println(">>"+livros.peek());
        System.out.println(">>"+livros.element());
System.out.println();

        for(String livrança: livros){//começou do 1 da pilha, que foi o ultimo adicionado
        System.out.println(livrança);
        }
System.out.println();

        /*Mesmo metodo que pega e ja remove pra ir pro proximo */
       // System.out.println(livros.poll());lança nulo se a pilha tiver vazia
       // System.out.println(livros.remove());lança exceção
        System.out.println(livros.pop());/*tambem remove o proximo elemento, mas ele tb lança uma exceção assim como
        O REMOVE.
        VALE RESSALTAR QUE: o POP é o mais adequado pra pilha pq ele remove o elemento do topo(ultimo adicionado)*/
        System.out.println(livros.pop());
        System.out.println(livros.pop());
        //remove o primeiro da pilha, que é o ultimo adicionado

    /*  livros.size();
        livros.clear();
        livros.contains();
        livros.isEmpty(); */
    
        
}
}