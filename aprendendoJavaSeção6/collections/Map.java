package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class Map {
    public static void main(String[] args) {
        java.util.Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto");//adicionei
        usuarios.put(1, "Kevin");//substitui, pq no map a chave de acesso ao valor n pode repetir
        usuarios.put(2, "Moana");
        usuarios.put(3, "Rapunzel");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());
        System.out.println(usuarios.keySet());//retorna o conjunto das chaves de acesso
        //detalhe: ele nao mantem uma ordem nas chaves
        System.out.println(usuarios.values());//retorna apenas os valores
        System.out.println(usuarios);//retorna as chaves de acesso e os valores usando {} do dicionario
        System.out.println(usuarios.entrySet());//tbm retorna as chaves de acesso e os valores, mas no formato de conjunto usando []

        System.out.println(usuarios.containsKey(30));//verifica se tem essa chave(key) no map
        System.out.println(usuarios.containsValue("Moana"));//verifica se tem esse valor no map

        System.out.println(usuarios.get(3));/*aqui ele pega o valor pela chave, no caso da lista era pelo indice
        mas aq é por chave e n por indice */

        for(int chave: usuarios.keySet()){//percorri so as chaves
            System.out.println(chave);
        }
        System.out.println();
        for(String valores: usuarios.values()){//percorri so os valores
            System.out.println(valores);
        }
        System.out.println();




        
        for(Entry<Integer, String> mapJunto: usuarios.entrySet() ){
           /*  System.out.println(usuarios); */
           /*  System.out.println(usuarios.entrySet()); */
/*se eu colocasse qlqr um dos dois acima, ele ia imprimir o dicionario  inteiro 3 vezes, pq?
pq o foreach percorre a lista e o conjunto por inteiro(ou seja, o limite é a quantidade de elementos,
se eu tenho 3 elementos(nesse caso 3 pares de chave-valor) o foreach promete rodar 3 vezes ate chegar no ultimo elemento(o 3)
e sair).
E no dicionario o par de chave-valor formam um unico elemento, por mais q sejam tipos diferentes, eles sao 
um par q se relacionam (como se a chave fosse o acesso aquele valor, como se a chave fosse o indice daquele valor)
e sao separados por virgula, ent funciona como 1 elemento so {1:"julia"(elemento 1), 2:"john"(elemento 2), 3:"anna"(elemento 3)}.
obs: dps de formatar pra conjunto,  par chave-valor continua sendo um elemento so, pq na vdd ele so formata
os elementos do dicionario pra um formato de conjunto. */


/*nesses 2 prints, eles vao imprimir na ordem e de forma separada os keys e os values, enquanto o for percorre o dicionario */
System.out.println(mapJunto.getKey());

System.out.println(mapJunto.getValue());


/*getKey e getValue sao metodos exclusivos da interface Entry(o java cria uma classe interna q implementa o Entry como interface
pra que vc possa nql momento instanciar um obj Entry e usar ele APENAS pro foreach, alem disso vc nao pode
pq esse obj so vai armazenar os pares do dicionario q estao disfarçados de conjunto, alem disso ele n faz mais nada), 
pq como ele foi criado pra ajudar o map
tbm a percorrer no foreach, esse getKey e getValue pegam o key e o value da rodada atual do for(1 rodada, 1 key e 1 value,
for percorreu o dicionario, encontrou o 2 key e 2 value... e assim por diante)
se eu tentasse colocar usuarios.get(chave) pra ele imprimir 1 de cada ate que daria mas n seria otimizador
(ele so acessa um valor por vez assim, pela chave, n tem outro jeito, e tbm
nao tem como acessar 1 chave por vez, ou ele coloca todas as chaves juntas, ou todos os valores juntos, ou ele
usa a key especifica daquele valor pra eu imprimir aquele valor). */

           System.out.println(mapJunto);//aq le imprime os pares chave-valor de forma isolada
        }
        
        /*O foreach tem uma regra rigida de so aceitar passar por listas e conjunto,  e map é um dicionario, 
        ele guarda 2 tipos de valores um relacionado ao outro.
        o Entry é uma interface criada apenas para o MAP que é um dicionario. Em java nao existe um generics que guarde 2 valores ao 
        mesmo tempo, 2 valores que seriam um obj tipo da chave e o obj tipo de valor. Entao o Entry é uma interface criada exatamente
        pra corrigir esse problema pro map(q precisa de 2 valores), ele basicamente agrupa um par de 2 valores diferentes pro MAP
        (o entry é uma interface implicita, ele ja ta dentro do map qnd eu instancio algum map).
        Como o foreach so percorre listas e conjuntos, o entry tem uma outra função, ele FANTASIA um MAP em um SET(conjunto), 
        pra que o foreach percorra o MAP pegando cada par de chave e valor e imprimindo(OU SEJA, continua sendo um dicionario
        mas agora disfarçado de conjunto, tanto q se eu imprimir o map dps sozinho ele volta pq so modificou aql hora pro loop, nesse caso).
        Eu tenho que criar um objeto Entry(tem q ser entry, nao pode ser outro pq qnd eu uso o metodo entrySet, eu to formatando
        num formato de conjunto(Set) sim, mas em um que so o Entry "suporta", e alem disso é o entry q permite eu colocar o tipo da chave
        e o tipo do valor, nenhum mais faz isso) e colocar os tipos de chave e valor daquele MAP, 
        pq é pra onde eu vou aribuir os pares que o foreach vai pegar que vao ser impressos, nisso eu chamo meu map.entrySet(),
         OBRIGATORIAMENTE faço isso.. pq? 
        Pq esse metodo(q pertence apenas ao MAP) atribuido ao proprio map formata o map(que tem uma estrutura dicionario {...,...,...})
        e pega todos as chaves e valores(que sao pares, cada um com sua chave e valor junto) e
         coloca em um formato de conjunto([...,...,...]), ele nao faz par por par, 
        ele faz a estrutura inteira({1:"julia", 2:"john", 3:"anna"}.entrySet()->>
        [1:"julia", 2:"john", 3:"anna"]), agoraaaa que ele foi formatado e atribuido pra variavel entry, o foreach percorre pegando
        cada par(porque aqui ele ve como se fosse um unico valor, por ser separado por virgula), e imprime.
        Se eu colocar pra imprimir usuarios ou usuarios.entrySet eles imprimem o dicionario INTEIRO(usuarios imprime no formato original
        de dicionario, e usuarios.entrySet imprime em formato de conjunto) e nao cada par de forma isolada, o unico
        jeito de imprimir 1 par de cada vez é usando o foreach e formatando o map(o map nao tem nenhum metodo
        alem desse pra imprimir um par de forma isolada, ou ele imprime tudo, ou so os valores ou so as chaves).
        E nao, nao da pra fazer cast, essa é a unica forma.

*/











        System.out.println(usuarios.remove(1));/*ele retorna o valor(a string) como no remove pelo indice da lista q retorna
        o proprio objeto */
        System.out.println(usuarios.remove(2, "Moana"));/*se o valor e a chave forem iguais, ele conssegue remover
        e da true, se for diferente do q ta no map, ele nao consegue e devolve false */
       















    }
}
