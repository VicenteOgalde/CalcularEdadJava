package cl.dojo.models;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Estudiante {

	private int idEstudiante;
	private String rut;
	private String apellidoPat;
	private String apellidoMat;
	private String direccion;
	private String fechaDeNacimiento;

	public Estudiante(int idEstudiante, String rut, String apellidoPat, String apellidoMat, String direccion,
			String fechaDeNacimiento) {
		super();
		this.idEstudiante = idEstudiante;
		this.rut = rut;
		this.apellidoPat = apellidoPat;
		this.apellidoMat = apellidoMat;
		this.direccion = direccion;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public Estudiante(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	

	public Estudiante() {
		super();
	}

	public int getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getApellidoPat() {
		return apellidoPat;
	}

	public void setApellidoPat(String apellidoPat) {
		this.apellidoPat = apellidoPat;
	}

	public String getApellidoMat() {
		return apellidoMat;
	}

	public void setApellidoMat(String apellidoMat) {
		this.apellidoMat = apellidoMat;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	// solo puse este metodo aqui porque esta en grafico de la prueba
	// ya que tambien esta en la implementacion de la interfaz.
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
