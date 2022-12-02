import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//calcula sequencia Fibonate;
public class array {

    /*public static void main(String[] args) {
        int[] number = new int[]{10, 3, 5, 13, 56, 4, 8, 143,}; //criando um Array
        Arrays.sort(number); //ordena Array
        System.out.println(number);

        System.out.println(Arrays.toString(number)); //Tranforma Array em String para printar
    }

    public static void main(String[] args) {
        int[] numberA = new int[]{1, 2, 3};
        int[] numberB = new int[]{1, 2, 3};
        
        System.out.println(numberA == numberB);
        System.out.println(numberA.equals(numberB));
        System.out.println(Arrays.equals(numberA,numberB)); //compara Array
    }

    public static void main(String[] args) {
       String[] names = new String[10];
        System.out.println(Arrays.toString(names));
        Arrays.fill(names, "Qualquer"); //prenche altomaticamente todos os espacos de um Array com um unico elemento
        System.out.println(Arrays.toString(names)); 
    }*/

    public static void main(String[] args) {
        List <String> names = new ArrayList<>();
        names.add("nome qualquer 2"); //adiciona intem na lista
        names.add("nome qualquer 3");
        names.add("nome qualquer 1");
        names.add("nome qualquer 5");
        names.add("nome qualquer 4");

        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i)); //chama intem da lista pelo indice
        }
        

        //busca indice do elemento, retoena int
        int index = names.indexOf("nome qualquer3");
        System.out.println(index);

        //verifica se a lista e vazia, retorna booleano
        System.out.println(names.isEmpty());

        //verifica se contem determinado valor dentro da lista, retorna booleano
        System.out.println(names.contains("nome qualquer3"));

        //verifica tamanho da lista, retorna int
        System.out.println(names.size());
 
        //esvazia lista, sem retorno
        names.clear();
        System.out.println(names.isEmpty());
        
        Collections.sort(names);
        
        for(String name : names){
            System.out.println(name);
        }


    }
}