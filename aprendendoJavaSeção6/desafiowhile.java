import java.util.Scanner;

public class desafiowhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual valor voce quer sacar: ");
        int valorSaque = entrada.nextInt();
        int notas50 = 0;
        int notas30 = 0;
        int notas20 = 0;
        int notas10 = 0;
        
        while(valorSaque > 0){
            if(valorSaque>=50){
                valorSaque-=50;
                ++notas50;
            }
            else if(valorSaque>=30){
                valorSaque-=30;
                ++notas30;
            }
            else if(valorSaque>=20){
                valorSaque-=20;
                ++notas20;
            }
            else if(valorSaque>=10){
                valorSaque-=10;
                ++notas10;
          }  }
            
        System.out.println("Total de notas de 50: " + notas50);
        System.out.println("Total de notas de 30: " + notas30);
        System.out.println("Total de notas de 20: " + notas20);
        System.out.println("Total de notas de 10: " + notas10);



























        entrada.close();
    
}
}