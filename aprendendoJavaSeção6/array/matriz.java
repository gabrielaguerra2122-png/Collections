package array;

import java.util.Arrays;
import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

System.out.print("Quantos alunos tem na turma?: ");
int alunos = entrada.nextInt();

System.out.print("Quantas notas cada aluno tem?: ");
int quantidadeNotas = entrada.nextInt();

double[][] notas = new double [alunos][quantidadeNotas];/*na matriz o 1 [] define a quantidade de arrays que eu vou ter
e suas respectivas posições, o 2 [] define quantos elementos cada array vai ter.
int[2][3] a matriz tem 2 elementos(q sao 2 arrays com 0 e 1 de indice), dentro de cada array dessa matriz eu tenho 3 elementos.
 */
double soma = 0;

for(int a = 0; a < notas.length; a++){/*quando eu chamo o notas.length eu to me referindo a quantidade de elementos
    na matriz, se eu digot que tem 4 alunos, esse é o tamanho da matriz*/
  for(int n = 0; n < notas[a].length; n++){/*quando eu chamo o notas[aluno].length eu me refiro a quantidade de 
    notas que cada aluno tem */
    System.out.printf("Informe a %d nota do aluno %d: ", n+1, a);
    double not = entrada.nextDouble();
    notas[a][n] = not;/*ele so acessa realmente o array do indice atual(se a for 0 ent o array é o 0)
    e a posição dele(n que começa com 0 e roda ate o ultimo indice desse array 0) aqui! no parametro dos for
    oq foi definido foi apenas que o a(loop externo) vai rodar ate ter o valor do ultimo indice dos elementos da matriz
    que sao arrays, e no loop interno(O n) vai percorrer ate o ultimo indice dos elementos desse array(o a no
    notas[a].length ta fazendo referencia exatamente ao tamanho desse array, se for 0 o limite agr do for interno começa
    do 0 e vai ate o ultimo indice q faz referencia ao ultimo elemento do array 0, quando a for 1, agora o limite começa
     do 0 e vai ate o indice do ultimo elemento do array1) */
    soma+=not;
  }
}
/*COMO O LOOP FUNCIONA?
O primeiro loop começa no 0, e entra no proximo loop, que tambem se incializa no 0, diferente do loop interno
o externo tem o limite da matriz inteira, ou seja, quantos arrays tem na matriz?AH, 3! ent o loop
percorre do 0 ate o 2(que sao 3 elementos, mas começando do 0 pq eu vou usar isso a meu favor dps), enquanto
no loop interno o limite estabelecido é o tamanho do array atual, ou seja, o loop externo começou com 0,
entao ja que o notas[a].length usa o a como referencia do array atual, ele vai pegar o tamanho DESSE array do indice 0.
Lembrando que o loop so ta definindo a quantidade de vezes que ele vai rodar, e nao atribuindo nada.
Entrando no loop interno a gnt se depara com a pergunta, ao responder, como estamos na 1 rodada do loop externo
e tbm do interno, o a e n valem 0, ou seja, quando eu digitei a nota, armazenei na variavel not, e dps atribui o valor atual dela
para notas[a][n], oq rolou foi, notas[0][0]= agora a nota digitada ta guardada no array 0, com a posição 0.
O loop interno rodou de novo, pq o loop interno so acaba quando ele chegar no limite dos indices do array atual.
2 rodada o array continua sendo o 0 mas agora que encrementou no n, e eu atribui esse n para se referir a posicao
 da nota atual: notas[0][1]= nota digitada agora ta armazenada na posição 1 do array 0.
 encremenou dnv e agora chegou na ultima rodada notas[0][2]=notas armazenada na posicao de indice 2 no array 0.
 Agora que cheguei no limite dos elementos do array 0, eu saio do for interno e encremento o externo, agora como
 o a faz referencia a qual array eu to incrementando notas[a], o a passa a ser 1, entao agora essa linha de codigo
 notas[1][0] faz referencia ao array da matriz do indice 1, e ai eu entro dnv no loop interno, vejo quantos elementos
 tem esse array do indice 1, e começo a rodar ate chegar no limite dele.
 notas[1][0] = nota; encremento no loop interno, 1 é igual ao limite do array atual? nao? ent roda, adiciona a nota a respectiva posição
 notas[1][1]=nota; encremento no loop interno, 2 é igual? ent quer dizer q esse array armazenou so 2 notas(de indice 0 e 1),
 vou pro loop externo e encremento, ele viu que agora o a se iguala a quantidade de elemento da matriz? sim? entao ele para, isso
 significa q nesse exemplo da explicação, ele so tem 2 arrays, um do indice 0 e o outro do indice 1,
 e o array 0 tem 3 elementos(indice 0, 1, 2) e o array 1 tem 2 elementos(indice 0, 1).
 O loop em si so vai percorrer uma n quantidade de vezes, mas o a e n foram usados como referencia para atribuir
 a nota em alguma posicao de algum array da matriz notas[2][3]= to no array do indice 2 pq o a é 2, e to na nota de indice 3 pq
 o n nessa rodade é 3(nesse mini exemplo o array é o 3 elemento da matriz, e ele tem 4 elementos pq vai do 0, 1, 2, 3)*/



for(double[] imprimirNotas: notas){/*como o foreach percorre os elementos de um array/matriz/collection, e eu coloquei 
    que o ele vai percorrer é uma matriz, o tipo da variavel tem que ser um array pq o q a matriz guarda sao varios arrays
    e ai essa variavel vai pegar o 1 elemento da matriz que é um array, vai guardar ele e vai rodar, rodou e imprimiu?
    vai pro segundo elemento, armazena esse novo valor, roda e imprime ate chegar no ultimo elemento da matriz.
    se eu tentasse imrimir de cara arrays.tostring(notas) como a matriz guarda objetos do tipo array, ele ia imprimir
    as referencias desses array e nao eles em si.Se a posição guarda um valor literal (como um número double ou int), ele pega esse valor e transforma em texto.
    ​Se a posição guarda um objeto/array (que é uma referência de memória), ele executa o método de conversão padrão para imprimir,
     mas Como o Java não sabe que você queria ver os elementos do array interno, ele só converte para string pra imprimir a referência 
     do endereço daquele objeto para texto. E a matriz n guarda uma copia da referência, ele guarda a referência original dele pq
      foi atribuido a ele esses arrays.*/
    System.out.println(Arrays.toString(imprimirNotas));
}

System.out.println("A quantidade de alunos é: " + alunos);

System.out.println("A soma das notas é: " + soma);
System.out.println("A media das notas é: " + soma / (quantidadeNotas * alunos) );/*se eu colocar notas.length ele so vai pegar a quantidade 
de alunos q tem pra dividir, oq daria errado pq se eu to somando todas as nots d todos os alunos, se eu tenho 3
alunos com 3 notas, a soma vai ser de 9 notas, se eu dividir por 3 a media vai ser mt grande e n é assim,
ent a gnt multiplica a quantidade de alunos pela quantidade de notas, pq ai eu somo todas as notas e divido pega quantidade
de notas q tem no total */



 








        entrada.close();
    }
}
