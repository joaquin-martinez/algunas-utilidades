package mvc.controlador;

import java.io.File;


import utilidades.RecuperadorPropiedades;

public abstract class FactoriaAcciones {
	
	public static Accion creaAccion(String accion){
		Accion accionSeleccionada = null;
		File fichero;
		RecuperadorPropiedades recuperadorPropiedades ;
		String acciones ;
//		String ficheroStr ;
		
		
		fichero = new File("../standalone/deployments/mvcjpa.war/WEB-INF/factoriaNavegacion.props");
		System.out.println(fichero.getAbsolutePath());
		recuperadorPropiedades = new RecuperadorPropiedades(fichero);
		acciones = recuperadorPropiedades.getPropiedad(accion) ;
		System.out.println(acciones);
		try {
			accionSeleccionada = (Accion) Class.forName( acciones ).newInstance() ;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		accionSeleccionada = javaObject( acciones.get(accion));
		
		return accionSeleccionada;
		
	}

}
