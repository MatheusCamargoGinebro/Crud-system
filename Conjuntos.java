import java.util.HashSet;
import java.util.Set;

public class Conjuntos {
    public static void main(String[] args) throws Exception {
        Set <Integer> conjuntoDeNumeros = new HashSet<>();   
        
        conjuntoDeNumeros.add(5);
        conjuntoDeNumeros.add(10);
        conjuntoDeNumeros.add(15);
        conjuntoDeNumeros.add(10); // Não será adcionado, pois já existe o número 10 no conjunto

        boolean contemDez = conjuntoDeNumeros.contains(10);
        System.out.println(contemDez);

        for (Integer numero : conjuntoDeNumeros) {
            System.out.println(numero);
        }
    }
}
