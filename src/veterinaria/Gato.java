package veterinaria;

public class Gato extends Mascota {

	private Integer precioAtencion;
	
	public Gato(String nombre3, String sexo, String raza, Double peso) {
		super(nombre3, sexo, raza,peso);
		this.precioAtencion=3000;
	}

	public Integer getPrecio() {
		return precioAtencion;
	}

	public void setPrecio(Integer precio) {
		this.precioAtencion = precio;
	}

	@Override
	public void precioPorPeso() {
		if (super.getPeso()>5.0d) {
			this.precioAtencion=3500;
		}		
	}	
}