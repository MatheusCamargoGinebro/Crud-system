import java.util.LinkedList;
import java.util.List;

public class Lista {
    public static void main(String[] args) throws Exception {

        List <String> lista = new LinkedList<>();

        lista.add("Matheus");
        lista.add("Camargo");
        lista.add("Ginebro");

        String primeiroNome = lista.get(0);

        System.out.println("Primeiro nome: " + primeiroNome);

        System.out.println("\n");

        for (String nome : lista) {
            System.out.println("Nome: " + nome);
        }
    }
}
