import java.util.Scanner;

public class Cachorro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cadastro de Cachorro ===");
        System.out.print("Nome do cachorro: ");
        String nome = scanner.nextLine();

        System.out.print("Raça: ");
        String raca = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        System.out.println("\n🐾 Cachorro cadastrado com sucesso!");
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Idade: " + idade + " anos");

        scanner.close();
    }
}