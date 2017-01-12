package juegopalabra;

import java.io.BufferedInputStream;
import java.io.File;

import java.io.FileOutputStream;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
/**
 * Utilidad para escribir un fichero de incidencias en la ejecucion de la aplicacion.
 * */

public class EscribeLog {

    public static void escribe(String logCatch)  {

        File file;
        FileWriter con;
        BufferedWriter conBuf;
        
        try{

        file = new File("log.txt");
        con = new FileWriter(file,true);
        conBuf = new BufferedWriter(con);
        if (!file.exists()) {
        
            file.createNewFile();
        }

        if (file.canWrite()) {
           
           conBuf.write(logCatch);
           
        }
        conBuf.close();
        con.close();
       
        }catch (IOException ioe){
        	throw new AplicacionExcepcion("11", ioe);
        }

    }

}
