package veterinaria;

public class Aves extends Mascota {

	private Integer precioAtencion;
	
	public Aves(String nombre, String sexo, String raza, Double peso) {
		super(nombre, sexo, raza, peso);
		this.precioAtencion=4500;
	}

	@Override
	public void precioPorPeso() {
		if (super.getPeso()>1.0d) {
			this.precioAtencion=5000;
		}	
	}

	public Integer getPrecioAtencion() {
		return precioAtencion;
	}

	public void setPrecioAtencion(Integer precioAtencion) {
		this.precioAtencion = precioAtencion;
	}
}