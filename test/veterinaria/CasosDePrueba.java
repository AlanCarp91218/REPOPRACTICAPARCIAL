package veterinaria;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.Test;

import Testing.Cliente;
import Testing.Veterinaria;

public class CasosDePrueba {

	@Test
	public void QueSePuedaAgregarUnNuevoCliente() {
		
	  String nombre2 = "Veterinaria";
	  Veterinaria veterinaria = new Veterinaria(nombre2);
	  
	  String nombre="Alan";
	  String apellido="Dominguez";
	  String email= "alandominguezcarp1@gmail.com";
	  Integer telefono= 20668770;
	  Integer dni= 45128320;
	  
	  Cliente clienteNuevo = new Cliente (nombre,apellido,email,telefono,dni);
	  Boolean exitoso = veterinaria.agregarCliente(clienteNuevo);
	  
	  assertTrue(exitoso);

	}
	
	
	
	@Test
	public void QueSePuedaAgregarUnPerroYSuPrecioSea2500() {
		
	  String nombre2 = "Veterinaria";
	  Veterinaria veterinaria = new Veterinaria(nombre2);
	  
	  String nombre="Toby";
	  String sexo= "Macho";
	  String raza = "caniche";
	  
	  final Integer PRECIO_ESPERADO=2500;
	  Perro perro = new Perro (nombre,sexo,raza);
	  
	  veterinaria.agregarPerro(perro);
	  
	  assertEquals(PRECIO_ESPERADO, perro.getPrecio());

	}
	
	
	@Test
	public void QueSePuedaAgregarUnGatoYSuPrecioSea3000() {
		
	  String nombre2 = "Veterinaria";
	  Veterinaria veterinaria = new Veterinaria(nombre2);
	  
	  String nombre="Toby";
	  String sexo= "Macho";
	  String raza = "caniche";
	  
	  final Integer PRECIO_ESPERADO=3000;
	  Gato gato = new Gato (nombre,sexo,raza);
	  
	  veterinaria.agregarGato(gato);
	  
	  assertEquals(PRECIO_ESPERADO, gato.getPrecio());

	}
	
	@Test
	public void QueNoSePuedaAgregarDosPersonasDistintasConElMismoDni() {
		
		String nombre = "Veterinaria";
		Veterinaria veterinaria = new Veterinaria (nombre);
		
		 String nombre2="Alan";
		 String apellido="Dominguez";
		 String email= "alandominguezcarp1@gmail.com";
		 Integer telefono= 20668770;
		 Integer dni= 45128320;
		 
		 Cliente clienteNuevo = new Cliente (nombre2,apellido,email,telefono,dni);
		
		 String nombre4="Melina";
		 String apellido2="Viola";
		 String email2= "melinabelen@gmail.com";
		 Integer telefono2= 78484800;
		 Integer dni2= 45128320;
		 Integer conteoCuentas=1;
		  
		 Cliente clienteNuevo2 = new Cliente (nombre4,apellido2,email2,telefono2,dni2);
		 		
		 assertTrue(veterinaria.agregarCliente(clienteNuevo));
		 assertFalse(veterinaria.agregarCliente(clienteNuevo2));
		 assertEquals(conteoCuentas, veterinaria.getCantidadCuentas());

		 
		
		
	}
	
	
	@Test
	public void registrarUnaAtencionDeUnPerro() {
		
	String nombre="Vete";
	Veterinaria veterinaria = new Veterinaria(nombre);
	
	 String nombre2="Alan";
	 String apellido="Dominguez";
	 String email= "alandominguezcarp1@gmail.com";
	 Integer telefono= 20668770;
	 Integer dni= 45128320;
	  
	 Cliente clienteNuevo = new Cliente (nombre2,apellido,email,telefono,dni);
	 
	 veterinaria.agregarCliente(clienteNuevo);
	  
	 String nombre3="Toby";
	 String sexo= "Macho";
	 String raza = "caniche";
	  
	 Perro perro = new Perro (nombre3,sexo,raza);
	  
	 veterinaria.agregarPerro(perro);
	 
	 LocalDate Fecha = LocalDate.of(2023, 5, 9);
	 LocalDateTime fechaYHora = Fecha.atTime(16, 00);
	 String motivo= "dolor de estomago";
	 Integer id= 1;
	 	 
	 Boolean exitoso = veterinaria.registrarAtencion(id,clienteNuevo,perro,fechaYHora,motivo);
	 
	 assertNotNull(exitoso);
	 assertTrue(exitoso);
	 
	 
	}
	
	@Test
	public void registrarUnaAtencionDeUnGato() {
		
	String nombre="Vete";
	Veterinaria veterinaria = new Veterinaria(nombre);
	
	 String nombre2="Alan";
	 String apellido="Dominguez";
	 String email= "alandominguezcarp1@gmail.com";
	 Integer telefono= 20668770;
	 Integer dni= 45128320;
	  
	 Cliente clienteNuevo = new Cliente (nombre2,apellido,email,telefono,dni);
	 
	 veterinaria.agregarCliente(clienteNuevo);
	  
	 String nombre3="Toby";
	 String sexo= "Macho";
	 String raza = "Siames";
	  
	 Gato gato = new Gato (nombre3,sexo,raza);
	  
	 veterinaria.agregarGato(gato);
	 
	 LocalDate Fecha = LocalDate.of(2023, 5, 9);
	 LocalDateTime fechaYHora = Fecha.atTime(16, 00);
	 String motivo= "dolor de estomago";
	 Integer id = 1;
	 	 
	 Boolean exitoso = veterinaria.registrarAtencion(id,clienteNuevo,gato,fechaYHora,motivo);
	 
	 assertNotNull(exitoso);
	 assertTrue(exitoso);
	 
	 
	}

	


	@Test
	public void buscarAtencionesPorDniPersona() {
	String nombre= "Vete";
	  Veterinaria veterinaria = new Veterinaria(nombre);
	 
	  	String nombre2="Alan";
		 String apellido="Dominguez";
		 String email= "alandominguezcarp1@gmail.com";
		 Integer telefono= 20668770;
		 Integer dni= 45128320;
		  
		 Cliente clienteNuevo = new Cliente (nombre2,apellido,email,telefono,dni);
		 
		 veterinaria.agregarCliente(clienteNuevo);
		  
		 String nombre3="Toby";
		 String sexo= "Macho";
		 String raza = "Siames";
		  
		 Gato gato = new Gato (nombre3,sexo,raza);
		  
		 veterinaria.agregarGato(gato);
		 
		 LocalDate Fecha = LocalDate.of(2023, 5, 9);
		 LocalDateTime fechaYHora = Fecha.atTime(16, 00);
		 String motivo= "dolor de estomago";
		 Integer id = 1;
	  
		 veterinaria.registrarAtencion(id,clienteNuevo,gato,fechaYHora,motivo);
		
		 Atencion exitoso = veterinaria.buscarDniPersonaEnAtencionRegistrada(dni);
		 
		 assertNotNull(exitoso);
	}


	


	//Prueba para verificar si el m�todo de buscar una mascota por su nombre funciona correctamente:


	@Test
	public void buscarGatoPorNombreEnAtencionRegistrada() {
		
		String nombre= "Vete";
		  Veterinaria veterinaria = new Veterinaria(nombre);
		 
		  	String nombre2="Alan";
			 String apellido="Dominguez";
			 String email= "alandominguezcarp1@gmail.com";
			 Integer telefono= 20668770;
			 Integer dni= 45128320;
			  
			 Cliente clienteNuevo = new Cliente (nombre2,apellido,email,telefono,dni);
			 
			 veterinaria.agregarCliente(clienteNuevo);
			  
			 String nombre3="Toby";
			 String sexo= "Macho";
			 String raza = "Siames";
			  
			 Gato gato = new Gato (nombre3,sexo,raza);
			  
			 veterinaria.agregarGato(gato);
			 
			 LocalDate Fecha = LocalDate.of(2023, 5, 9);
			 LocalDateTime fechaYHora = Fecha.atTime(16, 00);
			 String motivo= "dolor de estomago";
			 Integer id = 1;
		  
			 veterinaria.registrarAtencion(id,clienteNuevo,gato,fechaYHora,motivo);
			 
			 Atencion exitoso  = veterinaria.buscarGatoPorNombreEnAtencionRegistrada(gato.getNombre());
			 
			 assertNotNull(exitoso);
		 
			 
	}
	
	@Test
	public void buscarPerroPorNombreEnAtencionRegistrada() {
		
		String nombre="Vete";
		Veterinaria veterinaria = new Veterinaria(nombre);
		
		 String nombre2="Alan";
		 String apellido="Dominguez";
		 String email= "alandominguezcarp1@gmail.com";
		 Integer telefono= 20668770;
		 Integer dni= 45128320;
		  
		 Cliente clienteNuevo = new Cliente (nombre2,apellido,email,telefono,dni);
		 
		 veterinaria.agregarCliente(clienteNuevo);
		  
		 String nombre3="Toby";
		 String sexo= "Macho";
		 String raza = "caniche";
		  
		 Perro perro = new Perro (nombre3,sexo,raza);
		  
		 veterinaria.agregarPerro(perro);
		 
		 LocalDate Fecha = LocalDate.of(2023, 5, 9);
		 LocalDateTime fechaYHora = Fecha.atTime(16, 00);
		 String motivo= "dolor de estomago";
		 Integer id= 1;
		 	 
		 veterinaria.registrarAtencion(id,clienteNuevo,perro,fechaYHora,motivo);
		 
		 Atencion exitoso = veterinaria.buscarPerroPorNombreEnAtencionRegistrada(perro.getNombre());
		 
		 assertNotNull(exitoso);
		 
			 
	}
	
	@Test
	public void eliminarAtencionPorNombreDeMascotaYPorDniPersona() {
		
		String nombre="Vete";
		Veterinaria veterinaria = new Veterinaria(nombre);
		
		 String nombre2="Alan";
		 String apellido="Dominguez";
		 String email= "alandominguezcarp1@gmail.com";
		 Integer telefono= 20668770;
		 Integer dni= 45128320;
		  
		 Cliente clienteNuevo = new Cliente (nombre2,apellido,email,telefono,dni);
		 
		 veterinaria.agregarCliente(clienteNuevo);
		  
		 String nombre3="Toby";
		 String sexo= "Macho";
		 String raza = "caniche";
		  
		 Perro perro = new Perro (nombre3,sexo,raza);
		  
		 veterinaria.agregarPerro(perro);
		 
		 LocalDate Fecha = LocalDate.of(2023, 5, 9);
		 LocalDateTime fechaYHora = Fecha.atTime(16, 00);
		 String motivo= "dolor de estomago";
		 Integer id= 1;
		 	 
		 veterinaria.registrarAtencion(id,clienteNuevo,perro,fechaYHora,motivo);

		 Boolean exitoso = veterinaria.eliminarAtencionPorNombreMascotaYDni(clienteNuevo.getDni(), perro.getNombre());
		 
		 assertTrue(exitoso);
		 
		 
	}


	@Test
	public void listarAtencionesPorUnDiaYHoraEnEspecifico() {
	 
			String nombre="Vete";
			Veterinaria veterinaria = new Veterinaria(nombre);
		
		 String nombre4="Alan";
		 String apellido3="Dominguez";
		 String email3= "alandominguezcarp1@gmail.com";
		 Integer telefono3= 20668770;
		 Integer dni3= 45128320;
		  
		 Cliente clienteNuevo1 = new Cliente (nombre4,apellido3,email3,telefono3,dni3);
		 
		 veterinaria.agregarCliente(clienteNuevo1);
		  
		 //SEGUNDA ATENCION 
		 
		 String nombre5="Toby";
		 String sexo1= "Macho";
		 String raza1 = "Siames";
		  
		 Gato gato1 = new Gato (nombre5,sexo1,raza1);
		  
		 veterinaria.agregarGato(gato1);
		 
		 LocalDate Fecha2 = LocalDate.of(2023, 5, 9);
		 LocalDateTime fechaYHora2 = Fecha2.atTime(16, 00);
		 String motivo2= "dolor de estomago";
		 Integer id2 = 1;
		 	 
		 veterinaria.registrarAtencion(id2,clienteNuevo1,gato1,fechaYHora2,motivo2);
				 
		 Atencion atenciones = veterinaria.listarAtencionesPorEspecieDeterminada(LocalDate.of(2023, 5, 9).atTime(16, 00));
		 
		 assertNotNull(atenciones.toString());
		
	}
		
		
	@Test
	public void calcularCostoDeUnaAtencionEnEspecifico() {
		
		String nombre="Vete";
		Veterinaria veterinaria = new Veterinaria(nombre);
		
		 String nombre2="Alan";
		 String apellido="Dominguez";
		 String email= "alandominguezcarp1@gmail.com";
		 Integer telefono= 20668770;
		 Integer dni= 45128320;
		  
		 Cliente clienteNuevo = new Cliente (nombre2,apellido,email,telefono,dni);
		 
		 veterinaria.agregarCliente(clienteNuevo);
		  
		 String nombre3="Toby";
		 String sexo= "Macho";
		 String raza = "caniche";
		  
		 Perro perro = new Perro (nombre3,sexo,raza);
		  
		 veterinaria.agregarPerro(perro);
		 
		 LocalDate Fecha = LocalDate.of(2023, 5, 9);
		 LocalDateTime fechaYHora = Fecha.atTime(16, 00);
		 String motivo= "dolor de estomago";
		 Integer id= 1;
		 	 
		 veterinaria.registrarAtencion(id,clienteNuevo,perro,fechaYHora,motivo);

		 final Integer COSTO_ESPERADO=2500;
		 
		 assertEquals(COSTO_ESPERADO, perro.getPrecio());
		 
		 
	}
	
//-------------------------------------------------------------------------------------------------------------------
	
	//Prueba para verificar si el método de agregar un registro médico a una mascota funciona correctamente:

			@Test
			public void queSePuedaAgregarRegistroMedico() {
				Veterinaria veterinaria = new Veterinaria("");
				Cliente clienteNuevo = new Cliente("Juan", "Pérez", "juanperez@gmail.com", 1234567890,11222333);
			  		veterinaria.agregarCliente(clienteNuevo);
			  	Perro perro = new Perro("Lucky", "Perro", "Macho");
			  		veterinaria.asignacionPerroCliente(clienteNuevo, perro);
			  	LocalDate Fecha = LocalDate.of(2023, 5, 9);
			  	LocalDateTime fechaYHora = Fecha.atTime(16, 00);
			  	String motivo= "dolor de estomago";
			  	String diagnostico ="Vacuna antirrábica";
			  	Integer id= 1;
			  	final Integer registrosEsperados=1;
			  		 	 
			  		veterinaria.registrarAtencion(id,clienteNuevo,perro,fechaYHora,motivo);
			  	
			  	RegistroMedico nuevoRegistro = new RegistroMedico(fechaYHora,motivo,diagnostico,perro);
			  	veterinaria.agregarRegistroMedico(perro, nuevoRegistro);
			  	assertEquals(registrosEsperados, veterinaria.getCantidadRegistros());
//			  	assertTrue(veterinaria.getRegistrosMedicos().contains(nuevoRegistro));
			}

	//Prueba para verificar si el método de buscar un registro médico por fecha funciona correctamente:

			@Test
			public void queSePuedaBuscarRegistroMedicoPorFechaYPorNombreDeMascota() {
				Veterinaria veterinaria = new Veterinaria("");
				Cliente clienteNuevo = new Cliente("Juan", "Pérez", "juanperez@gmail.com", 1234567890,11222333);
					veterinaria.agregarCliente(clienteNuevo);
				Perro perro = new Perro("Lucky", "Perro", "Macho");
					veterinaria.asignacionPerroCliente(clienteNuevo,perro);
				LocalDate Fecha = LocalDate.of(2023, 5, 9);
				LocalDateTime fechaYHora = Fecha.atTime(16, 00);
				String motivo= "dolor de estomago";
				String diagnostico ="Vacuna antirrábica";
				Integer id= 1;
				  		 	 
				  	veterinaria.registrarAtencion(id,clienteNuevo,perro,fechaYHora,motivo);
				
				RegistroMedico nuevoRegistro = new RegistroMedico(fechaYHora,motivo,diagnostico,perro);
					veterinaria.agregarRegistroMedico(perro, nuevoRegistro);
				RegistroMedico registroEncontrado = veterinaria.buscarRegistroMedicoPorFechaYNombreMascota(perro, fechaYHora);
				assertEquals(nuevoRegistro, registroEncontrado);
			}
			
			public void queSePuedaBuscarClientePorDni() {
				Veterinaria veterinaria = new Veterinaria("");
				String nombre4="Alan";
				String apellido3="Dominguez";
				String email3= "alandominguezcarp1@gmail.com";
				Integer telefono3= 20668770;
				Integer dni3= 45128320;
			  	Cliente clienteNuevo = new Cliente(nombre4, apellido3,email3, telefono3,dni3);
			  		
			  		veterinaria.agregarCliente(clienteNuevo);
			  	
			  	Cliente clienteEncontrado = veterinaria.buscarClientePorUsuario(11222333);
			  	assertEquals(clienteNuevo, clienteEncontrado);
			  	assertNotNull(clienteEncontrado);
			}
//-------------------------------------------------------------------------------------------------------------------	
	
//	//Prueba para verificar si el m�todo de buscar un registro m�dico por fecha funciona correctamente:
//
//
//	@Test
//	public void testBuscarRegistroMedicoPorFecha() {
//	  Veterinaria veterinaria = new Veterinaria();
//	  Miembro miembro = new Miembro("Juan", "P�rez", "juanperez@gmail.com", "1234567890");
//	  veterinaria.agregarMiembro(miembro);
//	  Mascota mascota = new Mascota("Lucky", "Perro", "Macho", LocalDate.of(2018, 8, 25));
//	  veterinaria.agregarMascota(miembro, mascota);
//	  RegistroMedico registroMedico = new RegistroMedico(LocalDate.of(2021, 5, 10), "Vacuna antirr�bica");
//	  veterinaria.agregarRegistroMedico(mascota, registroMedico);
//	  RegistroMedico registroEncontrado = veterinaria.buscarRegistroMedicoPorFecha(mascota, LocalDate.of(2021, 5, 10));
//	  assertEquals(registroMedico, registroEncontrado);
//	}
//
//
//	//Prueba para verificar si el m�todo de verificar el historial m�dico de una mascota funciona correctamente:
//
//
//	@Test
//	public void testVerificarHistorialMedico() {
//	  Veterinaria veterinaria = new Veterinaria();
//	  Miembro miembro = new Miembro("Juan", "P�rez", "juanperez@gmail.com", "1234567890");
//	  veterinaria.agregarMiembro(miembro);
//	  Mascota mascota = new Mascota("Lucky", "Perro", "Macho", LocalDate.of(2018, 8, 25));
//	  veterinaria.agregarMascota(miembro, mascota);
//	  RegistroMedico registroMedico1 = new RegistroMedico(LocalDate.of(2021, 5, 10), "Vacuna antirr�bica");
//	  RegistroMedico registroMedico2 = new RegistroMedico(LocalDate.of(2021, 6, 15), "Desparasitaci�n");
//	  veterinaria.agregarRegistroMedico(mascota, registroMedico1);
//	  veterinaria.agregarRegistroMedico(mascota, registroMedico2);
//	  List<RegistroMedico> historialMedico = veterinaria.verificarHistorialMedico(mascota);
//	  assertTrue(historialMedico.contains(registroMedico1));
//	  assertTrue(historialMedico.contains(registroMedico2));
//	}
//
//
//	//Prueba para verificar si el m�todo de eliminar un miembro del sistema funciona correctamente:
//
//
//	@Test
//	public void testEliminarMiembro() {
//	  Veterinaria veterinaria = new Veterinaria();
//	  Miembro miembro = new Miembro("Juan", "P�rez", "juanperez@gmail.com", "1234567890");
//	  veterinaria.agregarMiembro(miembro);
//	  int cantidadMiembrosAntes = veterinaria.getMiembros().size();
//	  veterinaria.eliminarMiembro(miembro);
//	  int cantidadMiembrosDespues = veterinaria.getMiembros().size();
//	  assertEquals(1, cantidadMiembrosAntes - cantidadMiembrosDespues);
//	}
//
//
//	
//
//
//	 //Prueba para verificar si el m�todo de eliminar un registro m�dico de una mascota funciona correctamente:
//
//
//	@Test
//	public void testEliminarRegistroMedico() {
//	  Veterinaria veterinaria = new Veterinaria();
//	  Miembro miembro = new Miembro("Juan", "P�rez", "juanperez@gmail.com", "1234567890");
//	  veterinaria.agregarMiembro(miembro);
//	  Mascota mascota = new Mascota("Lucky", "Perro", "Macho", LocalDate.of(2018, 8, 25));
//	  veterinaria.agregarMascota(miembro, mascota);
//	  RegistroMedico registroMedico = new RegistroMedico(LocalDate.of(2021, 5, 10), "Vacuna antirr�bica");
//	  veterinaria.agregarRegistroMedico(mascota, registroMedico);
//	  int cantidadRegistrosAntes = mascota.getRegistrosMedicos().size();
//	  veterinaria.eliminarRegistroMedico(mascota, registroMedico);
//	  int cantidadRegistrosDespues = mascota.getRegistrosMedicos().size();
//	  assertEquals(1, cantidadRegistrosAntes - cantidadRegistrosDespues);
//	}

}
