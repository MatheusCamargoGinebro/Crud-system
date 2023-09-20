import java.util.Stack;

public class Pilha {
    public static void main(String[] args) throws Exception {
            
        Stack <String> pilha = new Stack<>();

        pilha.push("Primeiro");
        pilha.push("Segundo");
        pilha.push("Terceiro");
        
        System.out.println("\n");

        System.out.println("Elemento no topo da pilha: " + pilha.peek());

        while (!pilha.isEmpty()) {
            System.out.println("Removendo o elemento: " + pilha.pop());
        }

        System.out.println("\n");
    }
}