package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class testeStack {
    public static void main(String[] args) {
        Deque<String> chamadas = new ArrayDeque<>();
        chamadas.push("Chamada #3: Sem acesso ao Sistema!");//1 adicionado no final da pilha(ele era o 1)
        chamadas.push("Chamada #2: Erro no Login");//adicionado no meio normal(dps o 3 ficou em ultimo e esse em 1)
        chamadas.push("Chamada #1: Trocar Senha");//ultimo adicionado e colocado como 1 da pilha(dps o 2 ficou no meio,
        //  3 como ultimo e 1 em 1)

        while(!chamadas.isEmpty()){//enquanto a pilha tiver diferente de vazia(isEmpty), ele imprime, quando ela tiver igual
            //(vazia), ela para
            System.out.println(chamadas.pop());
        }
    }
}
