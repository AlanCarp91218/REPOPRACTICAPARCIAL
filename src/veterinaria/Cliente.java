package veterinaria;

import java.util.Objects;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private String email;
	private Integer telefono;
	private Integer dni;
	private Perro perro;
	private Gato gato;
	private Aves ave;
	private Roedores roedor;
	

	public Cliente(String nombre, String apellido, String email, Integer telefono, Integer dni) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.telefono=telefono;
		this.dni=dni;
		this.email=email;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Integer getTelefono() {
		return telefono;
	}


	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}


	public Integer getDni() {
		return dni;
	}


	public void setDni(Integer dni) {
		this.dni = dni;
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
	
	public Aves getAve() {
		return ave;
	}


	public void setAve(Aves ave) {
		this.ave = ave;
	}


	public Roedores getRoedor() {
		return roedor;
	}


	public void setRoedor(Roedores roedor) {
		this.roedor = roedor;
	}


	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(dni, other.dni);
	}


	
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono
				+ ", dni=" + dni + "]";
	}

}
