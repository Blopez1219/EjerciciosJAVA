package Palindromo;
import java.util.Scanner;

public class Palindromo {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una palabra o frase para verificar si es un palíndromo: ");
        String entrada = scanner.nextLine();

        String entradaFormateada = entrada.replaceAll("\\s+", "").toLowerCase();

        String reverso = new StringBuilder(entradaFormateada).reverse().toString();

        if (entradaFormateada.equals(reverso)) {
            System.out.println("'" + entrada + "' es un palíndromo.");
        } else {
            System.out.println("'" + entrada + "' no es un palíndromo.");
        }

        scanner.close();
	}
}
