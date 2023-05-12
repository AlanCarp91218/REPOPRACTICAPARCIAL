package veterinaria;

import java.time.LocalDateTime;

public class RegistroMedico {
	 
	private String tratamiento;
	private LocalDateTime LocalDate;
	private String motivo;
	private Perro perro;
	private Gato gato;
	private Cliente cliente;
	
	public RegistroMedico(Cliente clienteNuevo, LocalDateTime fechaYHora, String motivo,String tratamiento, Perro perro) {
		this.cliente=clienteNuevo;
		this.perro=perro;
		this.motivo=motivo;
		this.LocalDate=fechaYHora;
		this.tratamiento=tratamiento;
		}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}