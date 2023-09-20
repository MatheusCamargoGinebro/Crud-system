import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Crud_system crud = new Crud_system("src/database.txt");

        Scanner input = new Scanner(System.in);
        String aux;

        // Testando o método create: Check!
        crud.create("1;João;joao@gmail;123456", false, true);
        crud.create("2;Maria;maria@gmail;123456", true, true);
        crud.create("3;José;jose@gmail;123456", true, true);
        crud.create("4;Ana;ana@gmail;123456", true, true);
        crud.create("5;Pedro;pedro@gmail;123456", true, true); 

        System.out.println("\n1/4 Criado!\n");
        aux  = input.nextLine();

        // Testando o método read: Check!
        System.out.println(crud.read("João", 1));    // Deve retornar os dados do joão                -> | 1;João;joao@gmail;123456
        System.out.println("----------------------------------\n");
        
        System.out.println(crud.read("3", 0));       // Deve retornar os dados da Ana                 -> | 1;João;joao@gmail;123456
        System.out.println("----------------------------------\n");

        System.out.println(crud.read("Maria", 1));   // Deve retornar os dados da maria               -> | 2;Maria;maria@gmail;123456
        System.out.println("----------------------------------\n");
        
        System.out.println(crud.read("Matheus", 1)); // Deve retornar null pois não existe o Matheus  -> | NULL
        System.out.println("----------------------------------\n");

        System.out.println("\n2/4 Lido!\n");

        aux  = input.nextLine();

        // Testando o método update: Check!
        crud.update("Maria", 1, "Marie");   // Atualizando o nome da Maria para Marie
        System.out.println(crud.read("Marie", 1));   // Exibe a alteração

        System.out.println("\n3/4 Atualizado!\n");

        aux  = input.nextLine();

        // Testando o método delete:
        System.out.println(crud.delete("José", 1));

        System.out.println("\n4/4 Deletado!\n");

        System.out.print("\nDigite um valor para atualizar o nome de Marie: ");
        aux  = input.nextLine();

        crud.update("Marie", 1, aux);
        System.out.println(crud.read(aux, 1));

        System.out.println("\nTeste bônus -> Atualizado!\n");

        input.close();
    }
}
