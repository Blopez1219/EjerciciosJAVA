package IncrementoSalarial;
import java.util.Scanner;

public class IncrementoSalarial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu salario actual: ");
        double salarioActual = scanner.nextDouble();

        double incremento;

        if (salarioActual < 15000) {
            incremento = salarioActual * 0.20; // 20% de incremento
        } else {
            incremento = salarioActual * 0.15; // 15% de incremento
        }

        double nuevoSalario = salarioActual + incremento;

        System.out.println("Incremento salarial: " + incremento);
        System.out.println("Nuevo salario: " + nuevoSalario);

        scanner.close();
	}

}
