package collections;

import java.util.Objects;

public class Usuario {
    String nome;
    String email;
    int idade;
    Usuario(String nome){
        this.nome = nome;
    }
    Usuario(){

    }

//vou definir o criterio que eu vou usar pra comparar 2 objetos do tipo usuario
    public boolean equals(Object objeto) {/*como eu to sobrescrevendo um metodo da classe mae OBJECT, a assinatura tem q ser a msm
        ou seja, o parametro passado tem q ser OBJECT e n USUARIO, daria varios erros e o java entenderia que eu criei um
        metodo equals novo apenas pq eu mudei a assinatura dele. O objeto passado continua sendo do tipo usuario,
        mas o java so ve que a variavel colocada no parametro é uma variavel do tipo objeto(sabe qual é a subclasse do objeto
        apenas nao vai afundo, mas sabe que pertence a classe ddos OBJECTS q sao objetos).
        entao pra ele ter acesso aos atributos do tipo Usuario eu faço o cast pra dizer ao java q ele é sim do tipo Usuario.*/
       
        if(objeto instanceof Usuario){ //o instanceof pergunta se o objeto digitado é um objeto/instancia do tipo Usuario
            /*se for, ele executa, se nao for, ele ja da false logo de cara, se nao tivesse ele, na hora da conversao(cast)
            se o usuario colocasse um tipo q nao da pra converter pra usuario(pq java n sabe transformar a classe(tipo) de 
            um objeto em outro que nao pertence a mesma hierarquia)
            daria um erro pq nao da pra converter, mas com ele o resultado so da false*/
            
            Usuario objetoDigitado = (Usuario) objeto;/*Basicamente eu to atribuindo a uma variavel do tipo usuario, a copia da referencia
            de memoria do obj digitado no parametro, mas agora convertido pro tipo USUARIO, pq antes o java so sabia q ele 
            era um objeto, mas nao sabia qual subclasse ele pertencia pra poder acessar os atributos.
            Por que é necessário: A variável que o java ve é um objeto pq tem o Object la, 
            mas não tem acesso aos campos nome e email. Fazendo o cast, você libera o acesso
             aos atributos da classe.
              */

        boolean nomeIgual = objetoDigitado.nome.equals(this.nome);/*o this é a referencia ao objeto onde o metodo ta sendo chamado(u1.equals(u2)) 
        this é o u1, e o objeto recebido no parametro é o 'objetoDigitado' */
        //esse aq é o equals da string, ent da pra usar ja q email e nome sao string

        return nomeIgual;/*esse é o meu criterio pra dizer se um usuario é igual ao outro, 
        ele vai comparar o atributo nome e o atributo email e se for igual, entao quer dizer q os usuarios sao iguais.
        operadores de tabela verdade so funcionam em valores booleanos */
    }
        else
           {return false;}
 }      /*como funciona esse codigo:
        quando eu defini que o objeto digitado seria atribuido a uma variavel eu passei tudo dql objeto pra
        ser guardado pela variavel, normal como se faz em qlqr canto, a difernça é que eu converti o tipo do objeto
        digitado para usuario pra que esse objeto agora tenha os mesmos atributos e metodos do tipo Usuario.
          boolean nomeIgual = a.nome.equals(this.nome); significa que como equals é uma comparação que retorna true or false 
          eu obrigatoriamente tenho que armazenar num boolean, nessa operação ai ele vai pegar o
          nome do objeto digitado e vai comparar ao nome do objeto em que eu chamei o equals(u1.equals= this.nome.equals)
          e objetoDigitado.nome seria tipo o u2.nome que eu digitei no parametro.*/
        
          @Override
          public String toString() {
              
              return this.nome;/*quando o system.out.print imprimir um usuario, pra ele nao imprimir o endereço de memoria dele
              eu defini q o valor a ser mostrado na impressao é o nome 
              e tanto faz colocar this.nome ou so nome, o toString sempre pega o valor de 1 objeto por vez,
              ent ele sempre pega o valor definido no toString sem precisar do this explicito(é como se o this fosse
              implicito, ele existe mas n precisa de forma explicita).*/
          }
          @Override
          public int hashCode() {
              
              return Objects.hash(nome);
          }
}

