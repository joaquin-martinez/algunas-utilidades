package utilidades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribeLineasEnFichero {
    
    public void ejecutar(String nomFichero , String cadena ) throws FileNotFoundException, IOException{
        File  fArchivo ;
        
        
            fArchivo = new File(nomFichero);

            BufferedReader br = null;
            PrintWriter pw = null;
            
           
                            if (!(fArchivo.exists()) || (fArchivo.exists() && fArchivo.canWrite())) {
                                   
                                       pw = new PrintWriter(new FileWriter(fArchivo));
                                
                                           pw.println(cadena);
                                           
                                    }
   }

    
    public void ejecutar(String nomFichero , String cadena ,boolean incrementar ) throws FileNotFoundException, IOException{
        File  fArchivo ;
        
        
            fArchivo = new File(nomFichero);

            BufferedReader br = null;
            PrintWriter pw = null;
            
           
                            if (!(fArchivo.exists()) || (fArchivo.exists() && fArchivo.canWrite())) {
                                   
                                    
                                    pw = new PrintWriter(new FileWriter(fArchivo , incrementar ));
                                      pw.println(cadena);
                                      
                                    }
    } 
}
