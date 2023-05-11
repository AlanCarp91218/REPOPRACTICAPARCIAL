package veterinaria;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class RegistroMedico {
	 
	private String tratamiento;
	private LocalDateTime LocalDate;
	private String diagnostico;
	private Perro perro;
	private Gato gato;
	
	
	public RegistroMedico(LocalDateTime fechaYHora, String diagnostico,String tratamiento, Perro perro) {
		this.perro=perro;
		this.diagnostico=diagnostico;
		this.LocalDate=fechaYHora;
		this.tratamiento=tratamiento;
		
	}
	
	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getProcedimiento() {
		return tratamiento;
	}
	
	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	public LocalDateTime getLocalDate() {
		return LocalDate;
	}

	public void setLocalDate(LocalDateTime localDate) {
		LocalDate = localDate;
	}

	public Perro getPerro() {
		return perro;
	}

	public void setPerro(Perro perro) {
		this.perro = perro;
	}

	public Gato getGato() {
		return gato;
	}

	public void setGato(Gato gato) {
		this.gato = gato;
	}

	 

	


	

	
}
