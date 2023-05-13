package veterinaria;

public class Perro extends Mascota {
	
	private Integer precioAtencion;
	
	public Perro(String nombre, String sexo,String raza,Double peso) {
		super(nombre, sexo,raza,peso);	
		this.precioAtencion=2500;
	}

	public Integer getPrecio() {
		return precioAtencion;
	}

	public void setPrecio(Integer precio) {
		this.precioAtencion = precio;
	}

	@Override
	public void precioPorPeso() {
		if (super.getPeso() > 10.0d) {
			this.precioAtencion=3000;			
		}
	
	}

}