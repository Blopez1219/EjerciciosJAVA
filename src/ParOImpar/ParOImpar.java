package ParOImpar;
import java.util.Scanner;

public class ParOImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número para verificar si es par o impar: ");
        int numero = scanner.nextInt();

        if (esPar(numero)) {
            System.out.println(numero + " es un número par.");
        } else {
            System.out.println(numero + " es un número impar.");
        }

        scanner.close();
	}
	
	public static boolean esPar(int n) {
        return n % 2 == 0;
    }

}
