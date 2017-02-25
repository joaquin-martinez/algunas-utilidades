package adivina;

import java.util.*;
import java.io.*;

public class RecuperadorPropiedades {
	
	Properties propiedad ;
	InputStream lectorPropiedad ;
	
	public RecuperadorPropiedades(File file) {
		try {
		propiedad = new Properties();
		lectorPropiedad = new FileInputStream(file);
		
			propiedad.load(lectorPropiedad);
		} catch (IOException e) {
			throw new AplicacionExcepcion("200" , e );
		}
		
		
	}
	
	
	public String getPropiedad(String clave){
		
		return propiedad.getProperty(clave);
		
		
	}
	
	

}
