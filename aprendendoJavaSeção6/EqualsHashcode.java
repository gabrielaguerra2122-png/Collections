import collections.Usuario;

public class EqualsHashcode {
    /*contextualizando:
    equals quando definido, vai verificar se os objetos sao iguais por meio dos atributos que eu
    definir. Se eu nao mexer no equals e acessar ele, ele vai ter a mesma funcionalidade do ==(nao vai dar certo)
    o hashcode vai buscar dentro de um conjunto quais elementos tem o mesmo hashcode daquele elemento
    que eu quero. */
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        System.out.println(a==b);
        int d = (int) 12.2;

        Usuario u1 = new Usuario();
        u1.nome = "Pedro Silva";
        u1.email = "pedrinho.silvao@gmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Pedro Silva";
        u2.email = "pedrinho.silvao@gmail.com";
        System.out.println(u1==u2);/*vai dar falso pq aqui ele ta comparando o valor da variavel em si,
         que é a referencia da memoria de onde o objeto ta, nao ta comparando o valor literal dos atributos ou do obj
*/



System.out.println(u1.equals(u2));









    }
}
