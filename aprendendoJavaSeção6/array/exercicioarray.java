package array;

import java.util.Arrays;

public class exercicioarray {

    public static void main(String[] args) {
    
        double[] notasAlunoA = new double[3];   
        
     System.out.println(Arrays.toString(notasAlunoA));
notasAlunoA[0] = 7.9;
notasAlunoA[1] = 8;
notasAlunoA[2] = 6.7;
System.out.println(notasAlunoA[0]);

System.out.println(notasAlunoA);
System.out.println(Arrays.toString(notasAlunoA));

double totalAlunoA = 0;//loop que vai percorrer o array
for(int i = 0; i<notasAlunoA.length; i++){
    totalAlunoA += notasAlunoA[i];
}
System.out.println(totalAlunoA / notasAlunoA.length);



double totalAlunoB = 0;
double nota = 5.6;//tbm posso atribuir uma variavel/constante no array(contato q seja do msm tipo)
double[] notasAlunoB = {6.9, 8.9, nota , 10};//maneira de criar um array definindo logo na criação os dados dele(N EH MT USADA)

for(int i = 0; i < notasAlunoB.length; i++){
    totalAlunoB += notasAlunoB[i];/*o loop vai rodar da seguinte maneira:
    o loop começa do 0 e vai ate o tamanho do array, ele vai pegando nos indices os valores
    e encrementando no total */
}

System.out.println(totalAlunoB / notasAlunoB.length);


String [] testando = new String[2];
testando[0] = "oi";
testando[1] = "oq foi";
System.out.println(testando);
System.out.println(testando.toString());
System.out.println(testando[1]);
System.out.println(Arrays.toString(testando));

double[][] sla = new double[2][3];
sla[0][0]= 234;
sla[0][1]= 453;
sla[0][2]= 787;
sla[1][0]= 345;
sla[1][1]= 459;
sla[1][2]= 2234;

for(int i = 0; i < sla.length; i++){//percorre os indices do array
    for(int j = 0; j < sla[i].length; j++){//entra no indice do array e percorre os elementos
        System.out.println(sla[i][j]);
        if(sla[i][j] == 459){  
         sla[i][j] = 800;
         System.out.println(sla[i][j]);
        }
    }
}

/*Oq aconteceu aqui?
Eu criei uma matriz, o i vai percorrer ate o limite total dos indices, e o j vai percorrer ate o limite dos elementos dentro
 dos indices(esse i e j nao entram do array, oq vai acessar é quando eu atribuir o [i] e [j], i representando o indice do array,
  e o j representando o indice do elemento dentro do array).
Rodada 1: [0][0] == 459? Se sim
[0][0] = 800; se nao, volta pro inicio do loop interno [0][1] == 459?
Nao? Encrementa no loop interno.
[0][2]==459? Nao? Como cheguei no limite desse array, vou pro loop de fora, encremento e agora percorro pelo array de indice 1:
[1][0] == 459? Nao? Encremento no loop interno e volto a testar.
[1][1] == 459? Sim?! Mudo o valor.
Como eu to num loop, mesmo depois de concluir a condicional, ele printou o ultimo valor pq esse if era apenas para mudar o valor,
e nao um if com um break, ent o loop continuou ate imprimir todos os valores do array do indice 1. */
/*Ent, ele imprimiu pq ele ta fora da condicional, era pra ele imprimir o valor de cada indice toda vez q rodasse, 
e como o loop tem o limite estabelecido la, ele so acaba qnd ele cumprir esse limite */


    }

}