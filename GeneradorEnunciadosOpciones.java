package utilidades;

import excepciones.ESExcepcion;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;
/**
 * Encapsula una utilidad que almacena los enunciados de los menus, relacionando
 * las opciones a elegir con las posiilidades ofertadas, pudiendo construirlos de varias maneras
 * y dando diversa informacion  sobre su contenido.
 * @autor Joaquin Matinez Perez
 * 
 */
public class GeneradorEnunciadosOpciones {
    
    AlmacenString opciones ;
    AlmacenString enunciados ;
    String patron;
    String[] enunciadoOpcion ;
  /**
   * Constructor sin parametros. 
   * 
   */
    public GeneradorEnunciadosOpciones(){
        opciones = new AlmacenString();
        enunciados = new AlmacenString() ;
        enunciadoOpcion = new String[2];
        
    }
    
    /**
     * Constuctor de enunciados de menu a partir de una coleccion de posibilidades.
     * @param enunciado
     */
   public GeneradorEnunciadosOpciones(Collection<String> enunciado ){
        LinkedList<String> temporal;
        
        
        enunciados = (AlmacenString) enunciado;
        enunciadoOpcion = new String[2];
        temporal = new LinkedList<String>();
        
        for (int i = 0; i <= enunciado.size(); i++){
            
            temporal.add(Integer.toString(i+1));
            
            }
            
        opciones = (AlmacenString) temporal;
    }
    
    
    /**
     * Proceso para añadir posibilidades a  la  utilidad.
     *
     *
     * @param enunciado
     * @param opcion
     */
    public void incluyeEnunOpc(String enunciado , String opcion){
        enunciados.add(enunciado);
        opciones.add(opcion);
    }
    
    
    /**
     * 
     *
     * @param enunciado
     */
    public void incluyeEnun(String enunciado){
        
        incluyeEnunOpc(enunciado , Integer.toString(opciones.size()+1));
        
    }
    
    
    public boolean contieneOpcion(String opcion){
        
       
        
       return opciones.contains(opcion);
        
        
    }
    
    
    
    public int dimension(){
        return opciones.size();
    }
    
    public ListIterator getIteradorOpciones(){
        return opciones.listIterator()  ;
    }
    
    public ListIterator getIteradorenunciados(){
        return enunciados.listIterator();
    }
    
    public boolean estaVacio(){
        return opciones.isEmpty();
    }
    
    public String[] enunOpc(int i){
        enunciadoOpcion[0] = enunciados.get(i);
        enunciadoOpcion[1] = opciones.get(i); 
        return enunciadoOpcion ;
    }
    
    public int indiceEnunOpc(String opcion){
        int indice = -1;
        int contador = 0;
        do{

            try {
                EscribeLog.escribe(opciones.get(contador));

            } catch (ESExcepcion e) {
            }
            if(opciones.get(contador).equals(opcion)){
                indice = contador ;
                contador = opciones.size();
            }else{
                contador++ ;
            }
            
        }while(contador<opciones.size());
        
/*        if (indice == opciones.dimensionAlmacen()){
            indice = -1 ;
        }
*/        
        return indice ;
        
    }
    
    
    public String toString(){
        
        String cadena = "" ;
                 
        for(int j = 0 ; j < opciones.size() ; j++ ){
            
            cadena = cadena + "\r\n " + opciones.get(j) + "  :   " + enunciados.get(j) + "\r\n"  ;
            
            
            
        }
        
        
        return cadena ;
        
    }
    
}
