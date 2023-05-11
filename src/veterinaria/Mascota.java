package veterinaria;

public abstract class Mascota {

	private String nombre;
	private String sexo;
	private String raza;
	
	public Mascota(String nombre, String sexo,String raza) {
		this.nombre=nombre;
		this.sexo=sexo;
		this.raza=raza;
	
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

	

	
	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", sexo=" + sexo + ", raza=" + raza + "]";
	}
	

	

	
}
