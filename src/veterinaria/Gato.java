package veterinaria;

public class Gato extends Mascota {

	private Integer precioAtencion;
	
	public Gato(String nombre3, String sexo, String raza) {
		super(nombre3, sexo, raza);
		this.precioAtencion=3000;
	
	}

	public Integer getPrecio() {
		return precioAtencion;
	}

	public void setPrecio(Integer precio) {
		this.precioAtencion = precio;
	}



	
}
