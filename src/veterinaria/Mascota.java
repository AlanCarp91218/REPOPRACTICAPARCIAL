package veterinaria;

public abstract class Mascota {

	private String nombre;
	private String sexo;
	private String raza;
	private Double peso;
	
	public Mascota(String nombre, String sexo,String raza,Double peso) {
		this.nombre=nombre;
		this.sexo=sexo;
		this.raza=raza;
		this.peso=peso;
	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", sexo=" + sexo + ", raza=" + raza + "]";
	}
	
	public abstract void precioPorPeso(); //METODO ABSTRACTO PARA TODAS LAS ESPECIES DE ANIMALES
	
}
