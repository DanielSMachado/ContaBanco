import java.util.Scanner;

//Nesse desafio a gente vai precisar imprimir a conta do banco
// Desafio e importar  a class scanner
//Exibir a mensagens para os usuário
//obter pela scanner os valores digitador no terminal
//exibir a mensagem digitada
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite número da sua agência");
        int agencia = scanner.nextInt();

        System.out.println("Digite número da sua conta sem digito");
        int conta = scanner.nextInt();

        double saldo = 899.50;

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agênci" +
                "a é " + agencia + ", conta " + conta + " e seu saldo R$" + saldo + " já esta disponível para saque.");
    }
}