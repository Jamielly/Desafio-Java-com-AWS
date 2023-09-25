import java.util.Scanner;

public class CalculandoCustosAWS {
    public static void main(String[] args) {
        // Definindo as taxas
        double custoPorHoraServidor = 0.15;
        double custoPorHoraBancoDados = 0.05;

        // Criando um objeto Scanner para receber as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Recebendo as informações do usuário
        int quantidadeServidores = scanner.nextInt();
        int quantidadeBancosDados = scanner.nextInt();

        // Calculando os custos
        double custoServidores = quantidadeServidores * custoPorHoraServidor;
        double custoBancosDados = quantidadeBancosDados * custoPorHoraBancoDados;
        double custoTotal = custoServidores + custoBancosDados;

        // Exibindo o resultado
        System.out.printf("Custo total de uso da AWS por hora: R$ %.2f%n", custoTotal);

        // Fechando o Scanner
        scanner.close();
    }
}
