package collections;

import java.util.ArrayList;

public class list {
    public static void main(String[] args) {
      ArrayList<Usuario> lista = new ArrayList<>();

      /*instanciei um objeto do tipo usuario, e atribui uma copia da referencia dele pro objeto lista, usando
      a variavel dele como parametro(a variavel guarda a referencia do objeto ent qnd eu passei ela pra lista,
      eu na vdd passei uma copia da referencia) */
      Usuario u1 = new Usuario();
      u1.nome = "xuxu beleza";
      u1.idade = 13;
      lista.add(u1);

/*aqui eu instanciei usuarios diretamente no parametro da lista, oq acontece? sao objetos anonimos, ou seja,
elas nao tem variaveis de referencia, a lista seria a propria "variavel" pq nesse caso ela guarda as referencias
de memoria desses objetos e seus proprios atributos, referencia da copia passada pra ele.
basicamente como eles nao tem variavel de referencia, a lista pega essa referencia copiada(por mais q eu tenha criado o obj ja
na lista, de toda forma ele foi armazenado na memoria e oq foi passado pra lista foi a referencia de onde o objeto ta),
mas como ele n tem variavel que guarda esse endereço, o unico que guarda é a propria lista, e o indice que vc guardou ele,
ou seja, se eu acesso o indice 1 eu to acessando o endereço do objeto insaanciado aq dentro, se eu remover um desses objs anonimos
como eles nao tem referencia eles sao apagados. */
      
      lista.add(new Usuario("Eleonor"));
      lista.add(new Usuario("Bettany"));
      /*lista.add(new Usuario("Britney").idade = 12);
      Ah, ele ve o numero inteiro primitivo e ignora o objeto, como a lista e de objetos usuarios ele
       nem cria o objeto dessa linha pra adicionar logo de cara na lista,  ele so tenta adicionar o numero inteiro.
      Se eu criasse ele por fora e atribuisse o valor, nesse caso seria armazenado o valor q eu dei, mas como nesse
       caso eu não posso nem passar assim pq ele ignora o objeto, e nem no construtor pq eu n defini a unica maneira de não deixar
        com que esse atributo tenha o valor padrao dele(0), é pegar a lista q é a unica variavel q guarda eles, 
        e fazer um lista.get(indice desejado).idade = atribuo a idade.
      */
     lista.add(new Usuario());//vai aparecer o valor padrao dele pq eu n atribui valor ao nome

      lista.get(0).idade = 12;
      System.out.println(lista.get(0).idade);
      System.out.println(lista.get(2).idade);//0 por padrao
      System.out.println(lista.get(0).equals(lista.get(0)));


for(Usuario listando: lista){
    System.out.println(listando.nome);
}
System.out.println(lista.get(0).nome);


System.out.println(lista);

      
   
    ArrayList<Double> listanum = new ArrayList<>();
    listanum.add(1.2);
    listanum.add(1.3);
    listanum.add(1.2);
    System.out.println(listanum);
    System.out.println(listanum.toString());/*chamei o toString explicitamente de forma desnecessaria pq o syso ja faz isso 
    por padrao de forma implicita */
    System.out.println(listanum.get(1));
    listanum.remove(1.2);/*quando eu faço um remove pra um item repetido, o remove para no primeiro
    que ele encontrar */


    ArrayList<Usuario> removePorObjd = new ArrayList<>();
  Usuario u11 = new Usuario("jonas");
  Usuario u12 = new Usuario("aghata");
  Usuario u13 = new Usuario("jennyffer");
  Usuario u14 = new Usuario("jonas");
  removePorObjd.add(u11);
  removePorObjd.add(u12);
  removePorObjd.add(u13);
  removePorObjd.add(u14);
System.out.println(removePorObjd.remove(u14));/*ele copiou a referencia do obj u14, foi ate ele e viu q o valor q eu defini no equals se é
igual ou nao, no obj usuario, é o nome, e como o remove usa o equals do objeto passado por parametro
 viu q o nome dele é jonas, qnd ele entra na lista e faz a comparação,
pra saber quaal objeto tem o mesmo valor que esse passado por parametro, o 1 objeto tbm tem o nome
jonas, ent deu igual, e ele removeu o u11, */

    
  }   
}
