package veterinaria;

import java.time.LocalDateTime;

public class Atencion {

	private Cliente cliente;
	private Perro perro;
	private LocalDateTime fechaYHora;
	private String motivo;
	private Gato gatos;
	private Integer id;
	
	
	public Atencion(Integer id, Cliente clienteNuevo, Perro perro, LocalDateTime fechaYHora, String motivo) {
		this.cliente=clienteNuevo;
		this.fechaYHora=fechaYHora;
		this.motivo=motivo;
		this.perro=perro;
		this.id=id;
		
	}

	public Atencion(Integer id, Cliente cliente2, Gato gatos, LocalDateTime fechaYHora2, String motivo2) {
		this.cliente=cliente2;
		this.fechaYHora=fechaYHora2;
		this.motivo=motivo2;
		this.gatos=gatos;
		this.id=id;
	
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Perro getPerro() {
		return perro;
	}

	public void setPerro(Perro perro) {
		this.perro = perro;
	}

	public LocalDateTime getFechaYHora() {
		return fechaYHora;
	}

	public void setFechaYHora(LocalDateTime fechaYHora) {
		this.fechaYHora = fechaYHora;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public Gato getGatos() {
		return gatos;
	}

	public void setGatos(Gato gatos) {
		this.gatos = gatos;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	@Override
	public String toString() {
		return "Atencion [cliente=" + cliente + ", perro=" + perro + ", fechaYHora=" + fechaYHora + ", motivo=" + motivo
				+ ", gatos=" + gatos + ", id=" + id + "]";
	}
	
	
	
	

}
