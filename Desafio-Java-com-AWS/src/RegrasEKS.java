import java.util.Scanner;

public class RegrasEKS {
    public static void main(String[] args) {
        // Definindo as regras básicas
        int podsPorNode = 10;
        int podsPorServidor = 4;

        // Criando um objeto Scanner para receber as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Recebendo as informações do usuário
        int numeroTotalPods = scanner.nextInt();

       // Calculando o número mínimo de nodes e servidores necessários
        int numeroMinimoNodes = (int) Math.ceil((double) numeroTotalPods / podsPorNode);
        int numeroMinimoServidores = (int) Math.ceil((double) numeroTotalPods / podsPorServidor);

        // Exibindo o resultado com as recomendações de quantidades de servidores e nodes
        if (numeroMinimoNodes <= 1) {
            System.out.println("1.Recomendamos usar um unico node");
        }else{
         System.out.println("1.Numero minimo de nodes:" + numeroMinimoNodes);
        }
        
        System.out.println("2.Numero minimo de servidores:" + numeroMinimoServidores);

        // Fornecendo recomendações com base nos resultados
       
        // Fechando o Scanner
        scanner.close();
    }
}

