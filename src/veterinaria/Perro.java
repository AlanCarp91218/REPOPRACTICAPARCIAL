package veterinaria;

public class Perro extends Mascota {
	
	private Integer precio;

	public Perro(String nombre, String sexo,String raza) {
		super(nombre, sexo,raza);	
		this.precio=2500;
		
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	
	
}