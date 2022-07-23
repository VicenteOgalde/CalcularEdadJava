package cl.dojo.services;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EstudianteServiceImpl implements IEstudianteService{

	@Override
	public int calcularEdad(String fechaDeNacimiento) {
		LocalDate today = LocalDate.now();
		LocalDate birthD = LocalDate.now();
		String[] parts = fechaDeNacimiento.split("-", 3);
		String part1 = parts[0];
		String part2 = parts[1];
		String part3 = parts[2];
		birthD = LocalDate.of(Integer.parseInt(part1), Integer.parseInt(part2), Integer.parseInt(part3));
		Long age = ChronoUnit.YEARS.between(birthD, today);

		int edad = Math.toIntExact(age);
		return edad;
	}

}
