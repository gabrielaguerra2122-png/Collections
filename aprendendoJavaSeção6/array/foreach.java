package array;

public class foreach {
    public static void main(String[] args) {
        double[] notas = {1.2, 3.5, 9.9, 8.7};

//for convencional
/*1 rodada: i = 0;
2: i = 1;
3: i = 2
4: i = 3; */
        for(int i = 0; i < notas.length; i++){

            System.out.printf( "[%f] ", notas[i] );/*o loop vai acessar e imprimir cada nota pq eu to acessando
             o indice toda vez que o i é encrementado.
            nesse caso o i ta servindo tanto como oq defini o tamanho, como o indice q o loop vai printar.
            Como o i ta se referindo ao indice atual, o loop tem q rodar o tamanho - 1, pq o array tem 4 elementos, mas o indice
            vai do 0 ate o 3.*/
        }

        System.out.println();
//foreach
double soma = 0;/*
em todo loop, se eu quiser acumular/somar e mostrar o total, eu tenho que criar a variavel fora dele
(qlqr loop, seja for, foreach, while, do while), pq se eu criar dentro, toda vez q o loop 
rodar ele vai seguir a instrução de criar a variavel soma, e acumular so 1 valor dentro dela(
por conta q eh um loop e ele segue as mesmas instruções toda vez q da uma volta) */

/*1 rodada: variavel nota = 1.2;
2: nota = 3.5;
3: nota = 9.9;
4: nota = 8.7 */

for(double nota: notas){/*for(para cada elemento no array notas, esse elemento
    vai ser atribuido para a variavel nota ) 
    no foreach ele acessa diretamente os elementos do array e o tipo dele, e nao o indice, entao diferente do  for convencional, 
    a variavel do foreach que vai acessar o array tem q ser do mesmo tipo dos elementos do array(pq ele vai ter o 
    elemento atribuido a ele toda rodada), e nao
    do tipo do indice(int), como foi no for convencional em q eu declarei q o i eh do tipo int pq ele ta
    se referindo ao indice*/
    soma += nota;
   System.out.printf( "[%f] ", nota);/* */
   
}
System.out.println();
System.out.println(soma);//eh uma forma otimizada de percorrer um array ou collection

    }
    
}
