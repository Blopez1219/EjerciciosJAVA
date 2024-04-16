package LeerNombre;
import java.util.Scanner;

public class LeerNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("¡Hola, " + nombre + "!");

        scanner.close();
	}

}
