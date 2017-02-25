package utilidades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.LinkedList;

public class LeeLineasEnFichero {
    
    public LinkedList<String> ejecutar(String archivo ) throws FileNotFoundException, IOException{
        File  fArchivo ;
        String cadena = null;
       LinkedList<String> lectura ;
    
    fArchivo = new File(archivo);
    lectura = new LinkedList<String>();

    BufferedReader br = null;
 //   PrintWriter pw = null;

    
    if (fArchivo.exists()){
            if (fArchivo.canRead()) {
                
                
        br = new BufferedReader (new FileReader(fArchivo));     
        while ((cadena=br.readLine())!=null)  {
            lectura.add(cadena) ;
        }
                
//    pw.close();
    br.close();
    }
        else
    System.out.println("No puede leerse el archivo de origen.");
}
    else
     System.out.println("No existe el archivo de origen.");
    
    
    
    return lectura ;
    }
    
    
}
