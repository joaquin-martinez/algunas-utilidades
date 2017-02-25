package procesarformulario;

import java.util.*;
import java.io.*;

/**
 * Utilidad para recuperar informacion de un fichero de propiedades.
 * @author joaquin
 *
 */

public class RecuperadorPropiedades {
	
	Properties propiedad ;
	InputStream lectorPropiedad ;
	
	/**
	 * Constructor del recuperador sobre el fichero parametro.
	 * @param file
	 */
	
	public RecuperadorPropiedades(File file) {
		try {
		propiedad = new Properties();
		lectorPropiedad = new FileInputStream(file);
		
			propiedad.load(lectorPropiedad);
		} catch (IOException e) {
			throw new AplicacionExcepcion("200" , e );
		}
		
		
	}
	
	/**
	 * Recupera la propiedad especificada en el parametro.
	 * @param clave
	 * @return
	 */
	
	public String getPropiedad(String clave){
		
		return propiedad.getProperty(clave);
		
		
	}
	
	

}
