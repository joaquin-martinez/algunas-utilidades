package beans;
import java.io.Serializable;

public class Usuario implements Serializable , Comparable {
	
	String nombre ;
	String apellidos ;
	String email ;
	String edad ;
	
	public Usuario(){
		
		nombre = "" ;
		apellidos = "" ;
		email = "" ;
		edad = "" ;
		
		
	}
	
	public Usuario(String nombre , String apellidos , String email , String edad ){
		this.email = email ;
		this.nombre = nombre ;
		this.apellidos = apellidos ;
		this.edad = edad ;
		
		
		
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public boolean equals(Object o){
		Usuario usuario2 ;
		boolean iguales = false ;
		if(o!= null && Usuario.class == o.getClass()){
		usuario2 = (Usuario) o ;
			if(this.email.equals(usuario2.getEmail() ) )
					
				iguales = true ;
		}
		return iguales ;
	}

	
	public int hashcode(){
	return	(email).hashCode() ;
		
	}

	@Override
	public String toString() {
		return "<h3>Usuario :</h3> Nombre : " + nombre + "<br> Apellidos : " + apellidos + "<br> edad : " + edad + "<br> E-mail : " + email ;
	}

	@Override
	public int compareTo(Object o) {
		Usuario usuario2 ;
		int edad , edad2 ;
	
		
		if(o!= null && Usuario.class == o.getClass()){
		usuario2 = (Usuario) o ;

	edad = Integer.parseInt(this.getEdad());
	edad2 = Integer.parseInt(usuario2.getEdad());
		
	return edad-edad2 ;
	
		}
		
		return 0;
	}
	
	
	
}
