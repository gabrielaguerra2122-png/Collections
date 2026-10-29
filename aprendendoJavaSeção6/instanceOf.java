import collections.Usuario;

public class instanceOf {
    public static void main(String[] args) {
        /*o instanceof nada mais é que um operador binario em que vc coloca um objeto antes dele e depois
        alguma classe(como é binario ent ele sempre tem q ter 2 operandos)
        nisso ele vai verificar se o objeto digitado pertence a essa classe que vc digitou dps, se sim
        ele retorna true, se n, ele retorna false. 
        E ele é um operador apenas para OBJETOS pq ele verifica instancias*/

        Usuario u1 = new Usuario();
        System.out.println(u1 instanceof Usuario);
    }
    
}
