package procesarformulario;

/**
 * Encapsula las excepciones producidas en la aplicacion para su posterior tratamiento.
 * Añade un codigo y almacena la descripcion para una mejor identificacion.
 * El codigo tambien es util en el caso de querer capturarla en algun momento. 
 * @author joaquin
 *
 */

public class AplicacionExcepcion extends RuntimeException implements interfaceCodigo  {
	String codigo;
	
	/**
	 * Constructor que inicia el codigo de error y genera la excepcion a traves de su superclase. 
	 * @param codigo
	 */
	
	public AplicacionExcepcion(String codigo){
		
		super(codigo);
		this.codigo = codigo;
		
		
	}		
	
	/**
	 * constructor de la excepcion de la aplicacion.
	 */
	
	public AplicacionExcepcion(){
		
		super();
		
		
	}
	
	
	/**
	 * Constructor de excepcion con codigo y copia de la excepcion original.
	 * @param codigo
	 * @param causa
	 */
	
	public AplicacionExcepcion(String codigo , Throwable causa){
		
		super(causa);
		this.codigo = codigo;
		
		
	}

	/**
	 * Devuelve el codigo de la excepcion.
	 */
	
	public String getCodigo(){

		return codigo;
	}
	
	
	/**
	 * Devuelve la excepcion originaria.	
	 * @return
	 */
	
	public Throwable getCausa() {
		
		return this.getCause();
		
	}
}
