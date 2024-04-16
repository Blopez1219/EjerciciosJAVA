package DiasVividos;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DiasVividos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa tu fecha de nacimiento (en el formato dd/MM/yyyy): ");
        String fechaNacimientoString = scanner.nextLine();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoString, formatter);
        
        LocalDate fechaActual = LocalDate.now();

        long diasVividos = ChronoUnit.DAYS.between(fechaNacimiento, fechaActual);

        System.out.println("Has vivido aproximadamente " + diasVividos + " días.");

        scanner.close();
	}

}
