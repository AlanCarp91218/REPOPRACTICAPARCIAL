package veterinaria;

public class Roedores extends Mascota {

	private Integer precioAtencion;
	
	public Roedores(String nombre, String sexo, String raza, Double peso) {
		super(nombre, sexo, raza, peso);
		this.precioAtencion=4000;
	}
	
	@Override
	public void precioPorPeso() {
		if (super.getPeso()>4.0d) {
			this.precioAtencion=4500;
		}		
	}

	public Integer getPrecioAtencion() {
		return precioAtencion;
	}

	public void setPrecioAtencion(Integer precioAtencion) {
		this.precioAtencion = precioAtencion;
	}
}