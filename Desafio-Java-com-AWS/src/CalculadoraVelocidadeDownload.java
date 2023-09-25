import java.util.Scanner;

public class CalculadoraVelocidadeDownload {

		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Solicitar a entrada do usuário para a distância física e a velocidade do plano de internet
	        double distanciaServidores = scanner.nextDouble();
	        double velocidadePlano = scanner.nextDouble();

	        // Calcula a velocidade de download estimada
	        double velocidadeDownloadEstimada = calcularVelocidadeDownload(distanciaServidores, velocidadePlano);

	        // Apresentar o resultado
	        System.out.println("\nVelocidade de Download Estimada: " + String.format("%.2f", velocidadeDownloadEstimada) + " Mbps");

	        scanner.close();
	    }

	    public static double calcularVelocidadeDownload(double distanciaServidores, double velocidadePlano) {
	        // Implemente a fórmula de cálculo para a velocidade de download estimada
	        double velocidadeDownloadEstimada = velocidadePlano / (1 + (distanciaServidores / 100));

	        // Verifique se a velocidade estimada não excede a velocidade do plano contratado
	        if (velocidadeDownloadEstimada > velocidadePlano) {
	            return velocidadePlano;
	        } else {
	            return velocidadeDownloadEstimada;
	        }
	}

}
