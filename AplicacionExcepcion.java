package adivina;

public class AplicacionExcepcion extends RuntimeException implements interfaceCodigo  {
	String codigo;
	
	
	
	public AplicacionExcepcion(String codigo){
		
		super(codigo);
		this.codigo = codigo;
		
		
	}		
	
	
	
	public AplicacionExcepcion(){
		
		super();
		
		
	}
	
	
	
	
	public AplicacionExcepcion(String codigo , Throwable causa){
		
		super(causa);
		this.codigo = codigo;
		
		
	}

	
	
	public String getCodigo(){

		return codigo;
	}
	

	
	public Throwable getCausa() {
		
		return this.getCause();
		
	}
}
