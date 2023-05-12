package veterinaria;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;

public class Veterinaria {
	
	private String nombre;
	private HashSet <Cliente> clientes;
	private ArrayList <Perro> perros;
	private ArrayList <Atencion> atenciones;
	private ArrayList <Gato> gatos;
	private ArrayList<RegistroMedico> registro;
	private ArrayList <Roedores> roedores;
	private ArrayList <Aves> aves;
	
	public Veterinaria(String nombre2) {
		this.nombre=nombre2;
		this.clientes=new HashSet<>();
		this.perros= new ArrayList <> ();
		this.atenciones= new ArrayList <>();
		this.gatos=new ArrayList <> ();
		this.registro=new ArrayList<>();
		this.roedores= new ArrayList <>();
		this.aves= new ArrayList<>();
		
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
	
	public ArrayList<Perro> getPerros() {
		return perros;
	}

	public void setPerros(ArrayList<Perro> perros) {
		this.perros = perros;
	}

	public ArrayList<Atencion> getAtenciones() {
		return atenciones;
	}

	public void setAtenciones(ArrayList<Atencion> atenciones) {
		this.atenciones = atenciones;
	}

	public ArrayList<Gato> getGatos() {
		return gatos;
	}

	public void setGatos(ArrayList<Gato> gatos) {
		this.gatos = gatos;
	}

	public ArrayList<RegistroMedico> getRegistro() {
		return registro;
	}

	public void setRegistro(ArrayList<RegistroMedico> registro) {
		this.registro = registro;
	}

	public Integer getCantidadClientes () {
		return clientes.size();
	}

	public Integer getCantidadRegistros() {
		return registro.size();
	}
	
	public Integer getCantidadPerros() {
		return perros.size();
	}
	
	public Integer getCantidadGatos() {
		return gatos.size();
	}
	
	public Integer getCantidadRoedores () {
		return roedores.size();
	}
	
	public Integer getCantidadAves () {
		return aves.size();
	}
//------------------------------------------------------------------------------------------//
	
	public Boolean agregarCliente(Cliente clienteNuevo) {
		for (Cliente cliente : clientes) {
			if ((cliente.getDni().equals(clienteNuevo.getDni()))) {
				return false;
		}
	}
		return this.clientes.add(clienteNuevo);
	}
	
	public Cliente buscarClientePorDni(Cliente clienteNuevo) {
		for (Cliente cliente : clientes) {
			if(cliente.getDni().equals(clienteNuevo.getDni())) {
				return cliente;
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
	
//------------------------------------------------------------------------------------------//
	
	public Boolean registrarAtencionPerro(Integer id, Cliente clienteNuevo, Perro perro, LocalDateTime fechaYHora, String motivo) {
		Cliente cliente = buscarClientePorDni(clienteNuevo);
		Perro perros = buscarPerroPorNombre(perro);
		if(cliente!=null&&perros!=null) {
			Atencion atencion = new Atencion (id, cliente,perros,fechaYHora,motivo);
			this.atenciones.add(atencion);
			return true;
			
		}
		return false;
	}
	
	public Boolean registrarAtencionGato(Integer id, Cliente clienteNuevo, Gato gato, LocalDateTime fechaYHora, String motivo) {
		Cliente cliente = buscarClientePorDni(clienteNuevo);
		Gato gatos = buscarGatoPorNombre(gato);
		if(cliente!=null&&gatos!=null) {
			Atencion atencion = new Atencion (id,cliente,gatos,fechaYHora,motivo);
			this.atenciones.add(atencion);
			return true;
			
		}
		return false;
	
	}
	
	public Boolean registrarAtencionRoedor(Integer id, Cliente clienteNuevo, Roedores roedor, LocalDateTime fechaYHora, String motivo) {
		Cliente cliente = buscarClientePorDni(clienteNuevo);
		Roedores roedorr = buscarRoedorPorNombre(roedor);
		if(cliente!=null&&roedorr!=null) {
			Atencion atencion = new Atencion (id,cliente,roedorr,fechaYHora,motivo);
			this.atenciones.add(atencion);
			return true;
			
		}
		return false;
	
	}
	
	public Boolean registrarAtencionAve(Integer id, Cliente clienteNuevo, Aves ave, LocalDateTime fechaYHora, String motivo) {
		Cliente cliente = buscarClientePorDni(clienteNuevo);
		Aves aves = buscarAvePorNombre(ave);
		if(cliente!=null&&aves!=null) {
			Atencion atencion = new Atencion (id,cliente,aves,fechaYHora,motivo);
			this.atenciones.add(atencion);
			return true;
			
		}
		return false;
	
	}

	public Roedores buscarRoedorPorNombre(Roedores roedor) {
		for (Roedores roedores : roedores) {
			if (roedores.getNombre().equals(roedor.getNombre())) {
				return roedores;
			}
		}
		return null;
		
	}
	public Aves buscarAvePorNombre(Aves ave) {
		for (Aves aves : aves) {
			if (aves.getNombre().equals(ave.getNombre())) {
				return aves;
			}
		}
		return null;
	}

	public Perro buscarPerroPorNombre(Perro perross) {
		for (Perro perro : perros) {
			if (perro.getNombre().equals(perross.getNombre())) {
				return perro;
			}
		}
		
		return null;
	}

	public Gato buscarGatoPorNombre(Gato gato) {
		for (Gato gatoss : gatos) {
			if (gatoss.getNombre().equals(gato.getNombre())) {
				return gatoss;
			}
		}
		
		return null;
	}
	
	

	public Boolean agregarGato(Gato gato) {
		return this.gatos.add(gato);
		
	}

	public boolean agregarPerro(Perro perro) {
		return perros.add(perro);
	}
	
	public boolean agregarAve (Aves ave) {
		return aves.add(ave);
	}
	
	public boolean agregarRoedor (Roedores roedor) {
		return roedores.add(roedor);
	}
	
//------------------------------------------------------------------------------------------//

	public Boolean asignacionRoedorCliente(Cliente clienteNuevo,Roedores roedor) {
		if (clienteNuevo!=null) {
			clienteNuevo.setRoedor(roedor);
			return true;
		}
	return false;
					}
	
	public Boolean asignacionAveCliente(Cliente clienteNuevo,Aves ave) {
			if (clienteNuevo!=null) {
				clienteNuevo.setAve(ave);
				return true;
			}
				return false;
	}
	
	public Boolean asignacionPerroCliente(Cliente clienteNuevo,Perro perro) {
		if (clienteNuevo!=null) {
			clienteNuevo.setPerro(perro);
			return true;
			}
			return false;
	}
	
	public Boolean asignacionGatoCliente(Cliente clienteNuevo,Gato gato) {
		if (clienteNuevo!=null) {
			clienteNuevo.setGato(gato);
			return true;
			}
			return false;
	}
	
//------------------------------------------------------------------------------------------//

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
	
	public Atencion buscarAvePorNombreEnAtencionRegistrada(String nombreAve) {
		for (Atencion atencion : atenciones) {
			if(atencion.getAve().getNombre().equals(nombreAve)) {
				return atencion;		
			}
		}
		return null;
	}
	
	public Atencion buscarRoedorPorNombreEnAtencionRegistrada(String nombreRoedor) {
		for (Atencion atencion : atenciones) {
			if(atencion.getRoedor().getNombre().equals(nombreRoedor)) {
				return atencion;		
			}
		}
		return null;
	}
	
	
//------------------------------------------------------------------------------------------//

	public Boolean eliminarAtencionPorNombrePerroYDni(Integer dni, String nombrePerro) {
		for (Atencion atencion : atenciones) {
			if(atencion.getCliente().getDni().equals(dni)&&(atencion.getPerro().getNombre().equals(nombrePerro))) {
				this.atenciones.remove(atencion);
				return true;		
			}
		}
		return false;
	}
	
	public Boolean eliminarAtencionPorNombreGatoYDni(Integer dni, String nombreGato) {
		for (Atencion atencion : atenciones) {
			if(atencion.getCliente().getDni().equals(dni)&&(atencion.getGatos().getNombre().equals(nombreGato))) {
				this.atenciones.remove(atencion);
				return true;		
			}
		}
		return false;
	}
	
	public Boolean eliminarAtencionPorNombreRoedorYDni(Integer dni, String nombreRoedor) {
		for (Atencion atencion : atenciones) {
			if(atencion.getCliente().getDni().equals(dni)&&(atencion.getRoedor().getNombre().equals(nombreRoedor))) {
				this.atenciones.remove(atencion);
				return true;		
			}
		}
		return false;
	}
	
	public Boolean eliminarAtencionPorNombreAveYDni(Integer dni, String nombreAve) {
		for (Atencion atencion : atenciones) {
			if(atencion.getCliente().getDni().equals(dni)&&(atencion.getAve().getNombre().equals(nombreAve))) {
				this.atenciones.remove(atencion);
				return true;		
			}
		}
		return false;
	}
	
	
	public Atencion listarAtencionesPorEspecieDeterminada(LocalDateTime of) {
		for (Atencion atencion : atenciones) {
			if(atencion.getFechaYHora().equals(of)){
				return atencion;
			}
		}
		return null;
		
	}
//--------------------------------------------------------------------------------------------

	public boolean agregarRegistroMedico(RegistroMedico registroMedico) {
		return registro.add(registroMedico);
	}

	public RegistroMedico buscarRegistroMedicoPorFechaYNombreMascota(Perro perro, LocalDateTime fechaYHora) {
		for(RegistroMedico nuevoRegistro : registro) {
			if(nuevoRegistro.getLocalDate().equals(fechaYHora) && (nuevoRegistro.getPerro().getNombre().equals(perro.getNombre()))){
				return nuevoRegistro;
			}
		}
		return null;
	}
	
	public boolean eliminarRegistroMedico(RegistroMedico registroMedicos) {
		for (RegistroMedico registroMedico : registro) {
			if (registroMedico != null) {
				return registro.remove(registroMedicos);		
			}
		}
		return false;
	}
}