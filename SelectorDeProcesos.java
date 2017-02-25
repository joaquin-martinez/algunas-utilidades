package utilidades;


import excepciones.EntradaDatoExcepcion;


import interfaces.InterfaceOpciones;


import java.util.LinkedList;



public class SelectorDeProcesos {
    
    
    boolean ejecutaProceso;
    LinkedList<String> opcionesLectura   ;     
    LinkedList<InterfaceOpciones> procesos ;

    public SelectorDeProcesos(){
    opcionesLectura = new LinkedList<String>();
    procesos = new  LinkedList<InterfaceOpciones>();
    }
    
    public void addElementos( String lectura , InterfaceOpciones procesos){
        this.opcionesLectura.add(lectura);
        this.procesos.add(procesos);
    }
    
    public InterfaceOpciones ejecuta(LinkedList<String> opcionesLectura , LinkedList<InterfaceOpciones> procesos ,
                               String opcionLeida , boolean ejecutaProceso)   {
        
        int numeroOpcion = -1;
        int sizeListaOpciones = opcionesLectura.size();
        this.ejecutaProceso = ejecutaProceso;
        int i = 0 ;
/*
        do{
            
            

            if (opcionesLectura.get(i).equals(opcionLeida)){
                numeroOpcion = i ;
                i = sizeListaOpciones;
            }
            
            if (ejecutaProceso && numeroOpcion != -1 ){
                
                procesos.get(numeroOpcion).ejecutar();
                
            }
            
            
            i++ ;
            
        }while(i<sizeListaOpciones) ;
 */      
        
        while ( ! opcionesLectura.get(i).equals(opcionLeida ) && i <sizeListaOpciones ){
            i++ ;
        }
        
        
        
        if (i>=  sizeListaOpciones){
            throw new EntradaDatoExcepcion("la opcion no existe") ;
        }
        
        
        if (ejecutaProceso ){
            
            procesos.get(i).ejecutar();
        }  
        
        return procesos.get(i);
        
    }
    
    public void ejecutar(String opcionLeida , boolean ejecutaProceso) {
        if (opcionesLectura.isEmpty()){
            throw new EntradaDatoExcepcion("Lista vacia");
        }else {
            this.ejecuta(opcionesLectura, procesos, opcionLeida ,ejecutaProceso);
        }

    }
    
}

