package procesarformulario;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectOutputStream;

/**
 * serializa un objeto en un fichero.
 * @author joaquin
 *
 */

public class Serializa {
	
	/**
	 * realiza la serializacion un objeto dado  en un fichero determinado.
	 * @param nomArchivo
	 * @param object
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
    
    public static boolean ejecutar(String nomArchivo , Object object) throws FileNotFoundException, IOException, ClassNotFoundException{
        
        File fArchivo;
        ObjectOutputStream oos = null;
        boolean ok = true;
        
        System.out.println("creando el file");

           fArchivo = new File(nomArchivo);
            
//            if (!fArchivo.exists()) {
//            	fArchivo.createNewFile();
//                System.out.println("el fichero existe bbbien");
//            }
                try {
                        oos = new ObjectOutputStream(new FileOutputStream(fArchivo));
                        oos.writeObject(object);
                }
                // Este catch debe ir antes que el de IOException.
                catch (FileNotFoundException fnfe) {
                        throw new FileNotFoundException("No se encuentra archivo en m�todo grabaListaUsuarios()");
                }
                catch (IOException ioe) {
                        throw new IOException("Error al escribir el objeto en m�todo grabaListaUsuarios()",ioe);
                }
                finally {
                        if (oos != null)
                                oos.close();
                }
                ok = true ;
                
 
 //               }
 //           else{
 //               System.out.println("El archivo ya existe. Hay que borrarlo antes."); 
                
 //               ok = false ;
                
 //           }
     
    return ok;
    } 
}
