package RecorridoCarro;
import java.util.Scanner;

public class RecorridoCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la velocidad del carro (en km/h): ");
        double velocidad = scanner.nextDouble();

        System.out.print("Ingresa la distancia a recorrer (en kilómetros): ");
        double distancia = scanner.nextDouble();

        double tiempoEnHoras = distancia / velocidad;

        double tiempoEnMinutos = tiempoEnHoras * 60;

        System.out.println("El carro tomaría aproximadamente " + tiempoEnMinutos + " minutos en recorrer la distancia.");

        scanner.close();
	}

}
