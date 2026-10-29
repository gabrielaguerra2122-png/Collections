package array;


import java.util.Arrays;
import java.util.Scanner;

public class desafioArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
       System.out.print("Quantas notas voce quer informar?: ");

        int quantidade = entrada.nextInt();//essa variavel vai guardar a quantidade(numero) q o usuario digitar

        double[] notas = new double[quantidade];//eu defini que o tamanho do array vai depender do numero q o usuario colocar
        //se ele digitar 5, o aray tera 5 elementos e assim vai
        //e por padrao o java ja iniciou os elementos com seus valores padroes
        
        double soma1=0;
        for(int i = 0; i<quantidade; i++){//ele começa do indice zero e vai ate o total de elementos q tem no array -1, pq o indice
            //é sempre 1 valor a menos q o tamanho, e nesse caso tanto faz colocar a variavel q armazena a quantidade
            //como o notas.length
            System.out.printf("Informe a %d nota: ", i+1);/*toda vez q o loop rodar de acordo com a quantidade q o usuario digitou
            ele vai imprimir isso */
            double a = entrada.nextDouble();/*essa variavel vai guardar as notas digitadas, mas ela sempre vai
            atualizar toda vez q o loop rodar(1 rodada ela vale a 1 nota, 2 rodada ela vale a 2 nota...) */
            notas[i] = a;/*aqui eu chamei o array e defini que assim q o loop começar a rodar com o 0, as notas digitadas
            vao ser atribuidas para os respectivos indice, para cada indice, ou seja, primeiro indice é 0, 
            entao a 1 nota digitada vai ser atribuida ao indice 0, segundo indice é 1, 2 nota agora é atribuida ao indice 1... */
    soma1+=notas[i];
            
        }
        System.out.println(soma1);
        System.out.println(Arrays.toString(notas));//imprimi eles de forma organizada
        double soma = 0;
        for(double percorrendo: notas){//foreach foi usado como loop otimizado pra percorrer o array criado e somar as notas
            soma+=percorrendo;
        }
        
        System.out.println("A soma é: " + soma);
        System.out.println("A media é: " + soma / notas.length);




        entrada.close();
    }
}
