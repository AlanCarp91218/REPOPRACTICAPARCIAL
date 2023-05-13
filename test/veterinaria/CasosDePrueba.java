package veterinaria;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import org.junit.Test;

public class CasosDePrueba {

	@Test
	public void queSePuedaAgregarUnNuevoClienteALaVeterinaria() {
		
	  String nombre2 = "Veterinaria";
	  Veterinaria veterinaria = new Veterinaria(nombre2);
	  
	  String nombre="Alan";
	  String apellido="Dominguez";	
	  String email= "alandominguez01010@gmail.com";
	  Integer telefono= 20668770;
	  Integer dni= 45128320;
	  
	  Cliente clienteNuevo = new Cliente (nombre,apellido,email,telefono,dni);
	  Boolean exitoso = veterinaria.agregarCliente(clienteNuevo);
	  
	  //VALIDACION
	  assertNotNull(exitoso);
	  assertTrue(exitoso);

	}
	
	@Test
	public void queSePuedaBuscarClientePorDni() {
		
		Veterinaria veterinaria = new Veterinaria("");
		
		String nombre4="Melina";
		String apellido3="Viola";
		String email3= "melinabelen100@gmail.com";
		Integer telefono3= 20668770;
		Integer dni3= 45128320;
		
	  	Cliente clienteNuevo = new Cliente(nombre4, apellido3,email3, telefono3,dni3);
	  		
	  	veterinaria.agregarCliente(clienteNuevo);
	  	
	  	Cliente clienteEncontrado = veterinaria.buscarClientePorDni(clienteNuevo);
	  	
	  	//VALIDACION
	  	assertNotNull(clienteEncontrado);
	  	assertEquals(clienteNuevo, clienteEncontrado);
	  		  	
	}
	
	@Test
	public void queSePuedaAsignarUnaMascotaAUnCliente() {
		
		Veterinaria veterinaria = new Veterinaria("");
		Cliente clienteNuevo = new Cliente("Juan", "Perez", "juanperez@gmail.com", 1234567890,11222333);
	  	veterinaria.agregarCliente(clienteNuevo);
	  	Perro perro = new Perro("Lucky", "Macho", "Salchicha",5.3d);
	  	veterinaria.agregarPerro(perro);
	  	Boolean perroAsignado = veterinaria.asignacionPerroCliente(clienteNuevo, perro);
	  		
	  	//VALIDACION
	  	assertTrue(perroAsignado);
 		
	}
	
	@Test
	public void queSeCobreMayorPrecioAlPasarUnDeterminadoPesoEnUnPerro() {
		
	  String nombre2 = "Veterinaria";
	  Veterinaria veterinaria = new Veterinaria(nombre2);
	  
	  String nombre="Toby";
	  String sexo= "Macho";
	  String raza = "caniche";
	  Double peso= 8.0d;			
	  
	  final Integer PRECIO_ESPERADO=2500;
	  Perro perro = new Perro (nombre,sexo,raza,peso);
	  
	  veterinaria.agregarPerro(perro);
	  perro.precioPorPeso();
	  
	  //VALIDACION
	  assertNotEquals(PRECIO_ESPERADO, perro.getPrecio());

	}
	

	
	@Test
	public void queSeCobreElPrecioBaseDeLaAtencionDeUnGato() {
		
	  String nombre2 = "Veterinaria";
	  Veterinaria veterinaria = new Veterinaria(nombre2);
	  
	  String nombre="Haaland";
	  String sexo= "Macho";
	  String raza = "Europeo";
	  Double peso= 4.0d;			
	  
	  final Integer PRECIO_ESPERADO=3000;
	  Gato gato = new Gato (nombre,sexo,raza,peso);
	  
	  veterinaria.agregarGato(gato);
	  gato.precioPorPeso();
	  
	  //VALIDACION
	  assertEquals(PRECIO_ESPERADO, gato.getPrecio());

	}
	
	@Test
	public void calcularCostoDeUnaAtencionEnEspecifico() {	//IRA VARIANDO EN RELACION AL PESO Y AL TIPO DE ANIMAL QUE SE REGISTRE EN LA ATENCION.
		
	  String nombre="Vete";
	  Veterinaria veterinaria = new Veterinaria(nombre);
		
	  String nombre2="Celeste";
	  String apellido="Gomez";
	  String email= "CelesteGomez4512@gmail.com";
	  Integer telefono= 20668770;
	  Integer dni= 45128320;
		  
	  Cliente clienteNuevo = new Cliente (nombre2,apellido,email,telefono,dni);
		 
	  veterinaria.agregarCliente(clienteNuevo);
		  
	  String nombre3="Tom";
	  String sexo= "Macho";
	  String raza = "Conejo Angora";
	  Double peso= 7.0d;
		  
	  Roedores roedor = new Roedores (nombre3,sexo,raza,peso);
		  
	  veterinaria.agregarRoedor(roedor);
		 
	  LocalDate Fecha = LocalDate.of(2023, 5, 9);
	  LocalDateTime fechaYHora = Fecha.atTime(16, 00);
	  String motivo= "dolor de estomago";
	  Integer id= 1;
		 	 
	  veterinaria.registrarAtencionRoedor(id,clienteNuevo,roedor,fechaYHora,motivo);

	  final Integer COSTO_ESPERADO=4000;
		 
      roedor.precioPorPeso();
		 
	  //VALIDACION
      assertNotEquals(COSTO_ESPERADO, roedor.getPrecioAtencion());
		 	 
	}
	
	
	@Test
	public void QueNoSePuedaAgregarDosPersonasConElMismoDni() {
		
		String nombre = "Veterinaria";
		Veterinaria veterinaria = new Veterinaria (nombre);
		
		String nombre2="Lionel";
		String apellido="Messi";
		String email= "leomessi1010@gmail.com";
		Integer telefono= 20668770;
		Integer dni= 45128320;
		 
		Cliente clienteNuevo = new Cliente (nombre2,apellido,email,telefono,dni);
		
		String nombre4="Melina";
		String apellido2="Viola";
		String email2= "melinabelen91218@gmail.com";
		Integer telefono2= 78484800;
		Integer dni2= 45128320;
		Integer conteoCliente=1;
		  
		Cliente clienteNuevo2 = new Cliente (nombre4,apellido2,email2,telefono2,dni2);
		 		
		//VALIDACION
		assertTrue(veterinaria.agregarCliente(clienteNuevo));
		assertFalse(veterinaria.agregarCliente(clienteNuevo2));
		assertEquals(conteoCliente, veterinaria.getCantidadClientes());
		
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
	  
	 String nombre3="Betty";
	 String sexo= "Hembra";
	 String raza = "Siames";
	 Double peso= 2.5d;
	  
	 Gato gato = new Gato (nombre3,sexo,raza,peso);
	  
	 veterinaria.agregarGato(gato);
	 
	 LocalDate Fecha = LocalDate.of(2023, 5, 9);
	 LocalDateTime fechaYHora = Fecha.atTime(16, 00);
	 String motivo= "dolor de estomago";
	 Integer id = 1;
	 	 
	 Boolean exitoso = veterinaria.registrarAtencionGato(id,clienteNuevo,gato,fechaYHora,motivo);
	 
	 //VALIDACION
	 assertNotNull(exitoso);
	 assertTrue(exitoso);
	 
	 
	}

	@Test
	public void queSePuedaRegistrarExitosamenteDosAtencionesConMismoDniDeCliente() { 
		
	 String nombre="Vete";
	 Veterinaria veterinaria = new Veterinaria(nombre);
	
	 String nombre2="Alan";
	 String apellido="Dominguez";
	 String email= "alandominguezcarp1@gmail.com";
	 Integer telefono= 20668770;
	 Integer dni= 1234;
	  
	 Cliente clienteNuevo = new Cliente (nombre2,apellido,email,telefono,dni);
	 
	 veterinaria.agregarCliente(clienteNuevo);
	  
	 String nombre3="Tomas";
	 String sexo= "Macho";
	 String raza = "Siames";
	 Double peso= 4.0d;
	  
	 Gato gato = new Gato (nombre3,sexo,raza,peso);
	  
	 veterinaria.agregarGato(gato);
	 
	 LocalDate Fecha = LocalDate.of(2023, 5, 9);
	 LocalDateTime fechaYHora = Fecha.atTime(16, 00);
	 String motivo= "dolor de estomago";
	 Integer id = 1;
	 	 
	 veterinaria.registrarAtencionGato(id,clienteNuevo,gato,fechaYHora,motivo);
	 
	 String nombre5="Alan";
	 String apellido2="Dominguez";
	 String email2= "alandominguezcarp1@gmail.com";
	 Integer telefono2= 20668770;
	 Integer dni2= 1234;
	  
	 Cliente clienteNuevo1 = new Cliente (nombre5,apellido2,email2,telefono2,dni2);
	 
	 veterinaria.agregarCliente(clienteNuevo1);
	  
	 String nombre6="Pedro";
	 String sexo2= "Macho";
	 String raza2 = "Persa";
	 Double peso1= 3.0d;
	  
	 Gato gato1 = new Gato (nombre6,sexo2,raza2,peso1);
	  
	 veterinaria.agregarGato(gato1);
	 
	 LocalDate Fecha1 = LocalDate.of(2023, 5, 9);
	 LocalDateTime fechaYHora1 = Fecha1.atTime(16, 00);
	 String motivo1= "dolor de estomago";
	 Integer id1 = 1;
	 	 
	 veterinaria.registrarAtencionGato(id1,clienteNuevo1,gato1,fechaYHora1,motivo1);
	 
	 Integer cantidadClientes=2;
	 
	 //VALIDACION
	 assertNotEquals(cantidadClientes, veterinaria.getCantidadClientes());
	 
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
		  
		 String nombre3="Pepito";
		 String sexo= "Macho";
		 String raza = "Birmano";
		 Double peso= 2.6;
		  
		 Gato gato = new Gato (nombre3,sexo,raza,peso);
		  
		 veterinaria.agregarGato(gato);
		 
		 LocalDate Fecha = LocalDate.of(2023, 5, 9);
		 LocalDateTime fechaYHora = Fecha.atTime(16, 00);
		 String motivo= "dolor de estomago";
		 Integer id = 1;
	  
		 veterinaria.registrarAtencionGato(id,clienteNuevo,gato,fechaYHora,motivo);
		
		 Atencion exitoso = veterinaria.buscarDniPersonaEnAtencionRegistrada(dni);
		 
		 //VALIDACION
		 assertNotNull(exitoso);
	}
	
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
			  
	   String nombre3="Felix";
	   String sexo= "Macho";
	   String raza = "Siames";
	   Double peso= 3.2d;
			  
	   Gato gato = new Gato (nombre3,sexo,raza,peso);
			  
	   veterinaria.agregarGato(gato);
			 
	   LocalDate Fecha = LocalDate.of(2023, 5, 9);
	   LocalDateTime fechaYHora = Fecha.atTime(16, 00);
	   String motivo= "dolor de estomago";
	   Integer id = 1;
		  
	   veterinaria.registrarAtencionGato(id,clienteNuevo,gato,fechaYHora,motivo);
			 
	   Atencion exitoso  = veterinaria.buscarGatoPorNombreEnAtencionRegistrada(gato.getNombre());
			 
	   //VALIDACION
	   assertNotNull(exitoso);		 
	}
	
	
	@Test
	public void queSePuedaeliminarAtencionPorNombreDeMascotaYPorDniPersona() {
		
		 String nombre="Vete";
		 Veterinaria veterinaria = new Veterinaria(nombre);
		
		 String nombre2="Alan";
		 String apellido="Dominguez";
		 String email= "alandominguezcarp1@gmail.com";
		 Integer telefono= 20668770;
		 Integer dni= 45128320;
		  
		 Cliente clienteNuevo = new Cliente (nombre2,apellido,email,telefono,dni);
		 
		 veterinaria.agregarCliente(clienteNuevo);
		  
		 String nombre3="Romeo";
		 String sexo= "Macho";
		 String raza = "Loro comun";
		 Double peso= 2.0d;
		  
		 Aves ave = new Aves (nombre3,sexo,raza,peso);
		  
		 veterinaria.agregarAve(ave);
		 
		 LocalDate Fecha = LocalDate.of(2023, 5, 9);
		 LocalDateTime fechaYHora = Fecha.atTime(16, 00);
		 String motivo= "dolor de estomago";
		 Integer id= 1;
		 	 
		 veterinaria.registrarAtencionAve(id,clienteNuevo,ave,fechaYHora,motivo);

		 Boolean exitoso = veterinaria.eliminarAtencionPorNombreAveYDni(clienteNuevo.getDni(), ave.getNombre());
		 
		 //VALIDACION
		 assertTrue(exitoso);
		 
	}

		@Test
		public void listarAtencionesPorUnDiaYHoraEnEspecifico() {
		 
			String nombre="Vete";
			Veterinaria veterinaria = new Veterinaria(nombre);
			
			//PRIMERA ATENCION
			String nombre4="Alan";
			String apellido3="Dominguez";
			String email3= "alandominguezcarp40000@gmail.com";
			Integer telefono3= 20668770;
			Integer dni3= 45128320;
				  
			Cliente clienteNuevo1 = new Cliente (nombre4,apellido3,email3,telefono3,dni3);
				 
			veterinaria.agregarCliente(clienteNuevo1);
				  
		    //SEGUNDA ATENCION 
				 
			String nombre5="Toby";
			String sexo1= "Macho";
			String raza1 = "Siames";
			Double peso = 3.5d;
				  
			Gato gato1 = new Gato (nombre5,sexo1,raza1,peso);
				  
			veterinaria.agregarGato(gato1);
				 
			LocalDate Fecha2 = LocalDate.of(2023, 5, 9);
			LocalDateTime fechaYHora2 = Fecha2.atTime(16, 00);
			String motivo2= "dolor de estomago";
			Integer id2 = 1;
				 	 
			veterinaria.registrarAtencionGato(id2,clienteNuevo1,gato1,fechaYHora2,motivo2);
						 
			Atencion atenciones = veterinaria.listarAtencionesPorEspecieDeterminada(LocalDate.of(2023, 5, 9).atTime(16, 00));
				 
			//VALIDACION
			assertNotNull(atenciones.toString());
			
		}
			
			@Test
			public void queSePuedaAgregarRegistroMedicoDeUnPerro() {
				
				Veterinaria veterinaria = new Veterinaria("");
				Cliente clienteNuevo = new Cliente("Juan", "Perez", "juanperez@gmail.com", 1234567890,11222333);
			  	veterinaria.agregarCliente(clienteNuevo);
			  	Perro perro = new Perro("Lucky", "Macho", "Salchicha",5.3d);
			  	veterinaria.agregarPerro(perro);
			  	veterinaria.asignacionPerroCliente(clienteNuevo, perro);
			  	
			  	LocalDate Fecha = LocalDate.of(2023, 5, 9);
			  	LocalDateTime fechaYHora = Fecha.atTime(16, 00);
			  	String motivo= "Falta de vacuna";
			  	String diagnostico ="Vacuna antirrarbica";
			  	Integer id= 1;
			  	final Integer registrosEsperados=1;
			  		 	 
			  	veterinaria.registrarAtencionPerro(id,clienteNuevo,perro,fechaYHora,motivo);
			  	
			  	RegistroMedico nuevoRegistro = new RegistroMedico(clienteNuevo,fechaYHora,motivo,diagnostico,perro);
			  	veterinaria.agregarRegistroMedico(nuevoRegistro);
			  	
			  	//VALIDACION
			  	assertEquals(registrosEsperados, veterinaria.getCantidadRegistros());

			}

	@Test
	public void queSePuedaBuscarRegistroMedicoPorFechaYPorNombreDeMascota() {
			Veterinaria veterinaria = new Veterinaria("");
				
			Cliente clienteNuevo = new Cliente("Juan", "Perez", "juanperez@gmail.com", 1234567890,11222333);
			veterinaria.agregarCliente(clienteNuevo);
			Perro perro = new Perro("Pipa", "Macho", "Boxer", 7.5d);
			veterinaria.asignacionPerroCliente(clienteNuevo,perro);
					
			LocalDate Fecha = LocalDate.of(2023, 5, 9);
			LocalDateTime fechaYHora = Fecha.atTime(16, 00);
			String motivo= "dolor de estomago";
			String diagnostico ="Vacuna antirrabica";
			Integer id= 1;
				  		 	 
			veterinaria.registrarAtencionPerro(id,clienteNuevo,perro,fechaYHora,motivo);
				
			RegistroMedico nuevoRegistro = new RegistroMedico(clienteNuevo,fechaYHora,motivo,diagnostico,perro);
			veterinaria.agregarRegistroMedico(nuevoRegistro);
			RegistroMedico registroEncontrado = veterinaria.buscarRegistroMedicoPorFechaYNombreMascota(perro, fechaYHora);
				
			//VALIDACION
			assertEquals(nuevoRegistro, registroEncontrado);
				
			}
			
	@Test
	public void queSePuedaEliminarUnRegistroMedicoDeUnaAtencion() {
		
			Veterinaria veterinaria = new Veterinaria("");
		
			Cliente clienteNuevo = new Cliente("Juan", "Perez", "juanperez@gmail.com", 1234567890,11222333);
			veterinaria.agregarCliente(clienteNuevo);
			Perro perro = new Perro("Pipa", "Macho", "Boxer", 7.5d);
			veterinaria.asignacionPerroCliente(clienteNuevo,perro);
			
			LocalDate Fecha = LocalDate.of(2023, 5, 9);
			LocalDateTime fechaYHora = Fecha.atTime(16, 00);
			String motivo= "dolor de estomago";
			String diagnostico ="Vacuna antirrabica";
			Integer id= 1;
		  		 	 
		  	veterinaria.registrarAtencionPerro(id,clienteNuevo,perro,fechaYHora,motivo);
		
		  	RegistroMedico nuevoRegistro = new RegistroMedico(clienteNuevo,fechaYHora,motivo,diagnostico,perro);
			veterinaria.agregarRegistroMedico(nuevoRegistro);
			
			Integer numerosRegistros=1;
			
			//VALIDACIONES
			assertEquals(numerosRegistros,veterinaria.getCantidadRegistros()); //NUMEROS REGISTROS = 1
			veterinaria.eliminarRegistroMedico(nuevoRegistro);
			assertNotEquals(numerosRegistros,veterinaria.getCantidadRegistros());
	}
}