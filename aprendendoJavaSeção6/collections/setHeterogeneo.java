package collections;

import java.util.HashSet;
import java.util.Set;

public class setHeterogeneo {//set com elementos de tipos diferentes
    /*collections nao suportam tipos primitivos, entao ele vai converter cada um automaticamente pra sua classe(wrappers) */
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();/*essas advertencias se dao pq eu n especifiquei o tipo do set usando<> */
        conjunto.add(1.2);//double-> Double
        conjunto.add(true);//boolean-> Boolean
        conjunto.add("Teste");//String ja é objeto ent n precisa
        conjunto.add(1);//int-> Integer
        conjunto.add('x');//cha-> Character
        

        System.out.println(conjunto.size());
       
       
        conjunto.add('x');//o conjunto ignora esse pq eu repeti um elemtento
        
        
        System.out.println(conjunto.size());
        

        conjunto.add("teste");//esse é adicionado ao conjunto pq foi escrito diferente(so o T)
   
         System.out.println(conjunto.size());

    System.out.println(conjunto.remove('c'));/*o remove vai retornar um valor booleano, caso ele consiga remover
    um elemento desse conjunto, ele retorna true, se nao, ele retorna false */
    
    System.out.println(conjunto.remove('x'));
    System.out.println(conjunto.size());
System.out.println(conjunto.contains("teste"));
System.out.println(conjunto.contains('x'));//contains serve pra verificar se determinado elemento ta ou nao contido dentro do conjunto
    
    
    Set nums = new HashSet();
    nums.add(1);
    nums.add(2);
    nums.add(3);
    System.out.println(nums);/*a collection ja implementa a forma de mostrar isso como string, diferente do array q vc chama o metodo */
    System.out.println(conjunto);

    conjunto.addAll(nums);/*fiz a UNIAO de nums e conjunto, peguei tudo oq tem dentro de nums e joguei dentro de conjunto
    de tal forma q o resultado agora é a uniao dos dois, e isso alterou o conjunto, alterou o conteudo dele */
    System.out.println(conjunto);/*na hora de imprimir, como n tem ordem ele ta todo misturado
    ele nao mantem nem a ordem de inclusao, nao mantem uma ordem pra que vc possa ta por exemplo tentando acessar elementos
    a partir de uma determinada ordem*/

    conjunto.addAll(conjunto);/*isso nao funciona pq sao os mesmos elementos repetidos, ele so ignora qnd vc tenta
    adicionar qlqr elemento repetido */
    System.out.println(conjunto);
    nums.addAll(nums);
    System.out.println(nums);

   
    
    conjunto.retainAll(nums);/*fiz a INTERSEÇÃO de dois conjuntos, o set conjunto vai reter agora apenas os valores
    que ele tem em comum com o set nums */
    System.out.println(conjunto);

    conjunto.add(nums);/*diferente da uniao, aqui eu so fiz adicionar o proprio conjunto/set nums dentro do set conjunto
    quando eu usei o addALL eu inseri todos os elementos dele */
    System.out.println(conjunto);
    
    conjunto.clear();//limpou o conjunto
    System.out.println(conjunto);

    
    Set<Usuario> u = new HashSet<>();
    u.add(new Usuario("nao"));
    Usuario xuxu = new Usuario("xuxux tb");
    u.add(xuxu);
    System.out.println(u);
    System.out.println(u.toString());
    
    
    
    
    
    
    }
}
