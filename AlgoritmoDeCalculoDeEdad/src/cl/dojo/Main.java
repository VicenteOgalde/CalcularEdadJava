package cl.dojo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Scanner;

import cl.dojo.models.Estudiante;
import cl.dojo.services.EstudianteServiceImpl;
import cl.dojo.services.IEstudianteService;

public class Main {

	public static void main(String[] args) {
/*
		String birthDay = null;
		//Instanciamos la interfaz con su implementacion para poder usar sus metodos.
		IEstudianteService student = new EstudianteServiceImpl();
		LocalDate birthD = LocalDate.now();
		List<Estudiante> estudiantes = new ArrayList<Estudiante>();

		// Solicitamos 5 datos de entrada, con una validacion para que sean correctos,
		// si son correctos se guardan en el objeto estudiantes
		for (int i = 0; i < 5; i++) {
			System.out.println("Ingrese su fecha de nacimiento en el siguiente formato yyyy-MM-dd");
			Scanner scanner = new Scanner(System.in);
			birthDay = scanner.nextLine();
			String string = birthDay;

			try {
				String[] parts = string.split("-", 3);
				String part1 = parts[0];
				String part2 = parts[1];
				String part3 = parts[2];
				birthD = LocalDate.of(Integer.parseInt(part1), Integer.parseInt(part2), Integer.parseInt(part3));
				Estudiante estudiante = new Estudiante(birthDay);
				estudiantes.add(estudiante);
			} catch (Exception e) {
				i--;
				System.out.println("Error de  parametros de entrada , intente nuevamente " + e);
			}

		}
		// ejecutamos el metodo de calcular la edad en nuestros 5 objetos y los leemos
		// por consola
		for (int i = 0; i < 5; i++) {
			System.out.println("Edad de estudiante numero " + (i + 1) + " es:"
					+ student.calcularEdad(estudiantes.get(i).getFechaDeNacimiento()));

		}*/
	
		List.of("This,iS,Sparta,".split(",")).stream().map(String::toUpperCase).sorted().forEach(System.out::println);
	
	
	
	}
}
