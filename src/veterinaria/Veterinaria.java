package veterinaria;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;

public class Veterinaria {
	
	private String nombre;
	private HashSet <Cliente> clientes;
	private ArrayList <Perro> perros;
	private ArrayList <Atencion> atenciones;
	private ArrayList <Gato> gatos;
	
	public Veterinaria(String nombre2) {
		this.nombre=nombre2;
		this.clientes=new HashSet<>();
		this.perros= new ArrayList <> ();
		this.atenciones= new ArrayList <>();
		this.gatos=new ArrayList <> ();
	}

	public Boolean agregarCliente(Cliente clienteNuevo) {
		return this.clientes.add(clienteNuevo);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public HashSet<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(HashSet<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Boolean agregarPerro(Perro perro) {
		return this.perros.add(perro);
	}
	
	public Integer getCantidadCuentas () {
		return clientes.size();
	}


	public Boolean registrarAtencion(Integer id, Cliente clienteNuevo, Perro perro, LocalDateTime fechaYHora, String motivo) {
		Cliente cliente = buscarClientePorDni(clienteNuevo);
		Perro perros = buscarPerroPorNombre(perro);
		if(cliente!=null&&perro!=null) {
			Atencion atencion = new Atencion (id, cliente,perros,fechaYHora,motivo);
			this.atenciones.add(atencion);
			return true;
			
		}
		return false;
	}

	public Perro buscarPerroPorNombre(Perro perross) {
		for (Perro perro : perros) {
			if (perro.getNombre().equals(perross.getNombre())) {
				return perro;
			}
		}
		
		return null;
	}

	private Cliente buscarClientePorDni(Cliente clienteNuevo) {
		for (Cliente cliente : clientes) {
			if(cliente.getDni().equals(clienteNuevo.getDni())) {
				return cliente;
			}
		}
		
		return null;
	}

	public Boolean agregarGato(Gato gato) {
		return this.gatos.add(gato);
		
	}

	public Boolean registrarAtencion(Integer id, Cliente clienteNuevo, Gato gato, LocalDateTime fechaYHora, String motivo) {
		Cliente cliente = buscarClientePorDni(clienteNuevo);
		Gato gatos = buscarGatoPorNombre(gato);
		if(cliente!=null&&gatos!=null) {
			Atencion atencion = new Atencion (id,cliente,gatos,fechaYHora,motivo);
			this.atenciones.add(atencion);
			return true;
			
		}
		return false;
	
	}

	public Gato buscarGatoPorNombre(Gato gato) {
		for (Gato gatoss : gatos) {
			if (gatoss.getNombre().equals(gato.getNombre())) {
				return gatoss;
			}
		}
		
		return null;
	}

	public Atencion buscarDniPersonaEnAtencionRegistrada(Integer dni) {
		for (Atencion atencion : atenciones) {
			if(atencion.getCliente().getDni().equals(dni)) {
				return atencion;
			}
		}
		return null;
	}

	public Atencion buscarGatoPorNombreEnAtencionRegistrada(String nombreGato) {
		for (Atencion atencion : atenciones) {
			if(atencion.getGatos().getNombre().equals(nombreGato)) {
				return atencion;
			}
		}
		return null;
	}

	
	public Atencion buscarPerroPorNombreEnAtencionRegistrada(String nombrePerro) {
		for (Atencion atencion : atenciones) {
			if(atencion.getPerro().getNombre().equals(nombrePerro)) {
				return atencion;
				
			}
		}
		
		return null;
	}

	public Boolean eliminarAtencionPorNombreMascotaYDni(Integer dni, String nombre2) {
		for (Atencion atencion : atenciones) {
			if(atencion.getCliente().getDni().equals(dni)&&(atencion.getPerro().getNombre().equals(nombre2))) {
				this.atenciones.remove(atencion);
				return true;
				
			}
		}
		
		return null;
	}

	public Atencion listarAtencionesPorEspecieDeterminada(LocalDateTime of) {
		for (Atencion atencion : atenciones) {
			if(atencion.getFechaYHora().equals(of)){
				return atencion;
				
				
			}
		}
		
		
		return null;
		
	}

	
	
	
	

	}
