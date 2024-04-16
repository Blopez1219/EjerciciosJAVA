package DiasFaltantes;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DiasFaltantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la fecha actual
        System.out.println("Ingresa la fecha actual (en el formato dd/MM/yyyy): ");
        String fechaString = scanner.nextLine();
        
        // Convertir la entrada del usuario a LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaActual = LocalDate.parse(fechaString, formatter);
        
        // Calcular las fechas de interés
        LocalDate diaDeMuertos = LocalDate.of(fechaActual.getYear(), 11, 2);
        LocalDate navidad = LocalDate.of(fechaActual.getYear(), 12, 25);

        // Calcular los días restantes hasta cada fecha
        long diasHastaDiaDeMuertos = ChronoUnit.DAYS.between(fechaActual, diaDeMuertos);
        long diasHastaNavidad = ChronoUnit.DAYS.between(fechaActual, navidad);

        // Mostrar los resultados
        System.out.println("Días restantes para el Día de Muertos: " + diasHastaDiaDeMuertos);
        System.out.println("Días restantes para Navidad: " + diasHastaNavidad);

        scanner.close();
	}

}
