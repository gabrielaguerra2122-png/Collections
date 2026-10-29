package array;

import java.util.Arrays;

public class exercicioForEach {
    public static void main(String[] args) {
        
        double[] notasAlunoA = new double[3];   
        
     System.out.println(Arrays.toString(notasAlunoA));
notasAlunoA[0] = 7.9;
notasAlunoA[1] = 8;
notasAlunoA[2] = 6.7;


System.out.println(Arrays.toString(notasAlunoA));

double somaA = 0;
for(double notaPercorrida: notasAlunoA){
    System.out.println(notaPercorrida);
    somaA+=notaPercorrida;
}
System.out.println("A soma das notas A: " + somaA);
System.out.println();

double somaB = 0;
double[] notasAlunoB = {6.9, 8.9, 6.6 ,10};
/*para cada vez que o loop rodar, notaPercorrida vai apontar pra um dos elementos do array(e novamente, nao o indice)*/
for(double notaPercorrida: notasAlunoB){
    System.out.println(notaPercorrida);
    somaB+=notaPercorrida;
}

System.out.println("A soma das notas B: " + somaB);

}
}



