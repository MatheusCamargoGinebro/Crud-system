import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) throws Exception {

        Queue <String> fila = new LinkedList<>();

        fila.offer("Primeiro");
        fila.offer("Segundo");
        fila.offer("Terceiro");
        
        System.out.println("\n");

        System.out.println("Elemento no inicio da fila: " + fila.peek());

        while (!fila.isEmpty()) {
            System.out.println("Removendo o elemento: " + fila.poll());
        }

        System.out.println("\n");
    }
}
