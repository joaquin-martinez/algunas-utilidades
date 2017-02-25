package procesarformulario;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Utilidad para recuprar un objeto serializado.
 * @author joaquin
 *
 */

public class DesSerializa {
    
	/**
	 * Desserializa el objeto del archivo.
	 * @param nomArchivo
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	
    public static Object  ejecutar(String nomArchivo  ) throws FileNotFoundException, IOException, ClassNotFoundException {

//        ListaActuacionesPendiente objecto = null;
    File fArchivo = new File(nomArchivo);
    System.out.println(fArchivo.exists() + " : " + fArchivo.getAbsoluteFile());
    ObjectInputStream ois = null;
    Object object = null;
    
    
    
    try {
            ois = new ObjectInputStream(new FileInputStream(fArchivo));
            object =  ois.readObject();
            System.out.println( object.getClass() + " holala ");
    }
    // Este catch debe ir antes que el de IOException.
    catch (FileNotFoundException fnfe) {
            throw new FileNotFoundException("No se encuentra archivo en metodo DesSerializa");
    }
    catch (IOException ioe) {
            throw new IOException("Error al leer el objeto en metodo DesSerializa.ejecutar()",ioe);
    } catch (ClassNotFoundException cnfe) {
            throw new ClassNotFoundException("Error al leer el objeto en metodo DesSerializa",cnfe);
    }
    finally {
            if (ois != null)
                    ois.close();
        
    }  
    
//        objecto = (ListaActuacionesPendiente) object;
//        System.out.println(objecto.dimension() + " dimension 2");
//        System.out.println(objecto.size() + " dimension 22");
        return object ;
    }




}
