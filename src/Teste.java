import java.util.Scanner;

public class Teste {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo! O sistema solicitará alguns dados.");

        System.out.println("Por favor, informe o seu nome completo:");
        String nome = scanner.nextLine();

        System.out.println("Por favor, informe o seu CPF:");
        String CPF = scanner.nextLine();

        System.out.println("Por favor, digite a sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Por favor, digite o seu peso:");
        double peso = scanner.nextDouble();

        System.out.println("Por favor, digite a sua altura:");
        double altura = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Por favor, informe o seu estado civil:");
        String civil = scanner.nextLine();


        System.out.println("Seu nome é " + nome + ", o seu CPF é " + CPF + ", a sua idade é " + idade + ", o seu peso é " + peso + ", a sua altura é " + altura + " e o seu estado civil é " + civil);


        scanner.close();




    }

}
