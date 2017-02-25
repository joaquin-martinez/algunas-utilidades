package juegopalabra;

import java.util.HashSet;

public class ObtenedorParcialPalabra {
	
	String palabraSecreta ;
	float porcentajeLetras;
	GeneraAleatorio posicionAleatoria ;
	EscribeLog log ;
	
	public ObtenedorParcialPalabra(String palabraSecreta , float porcentaje) {
		
		this.palabraSecreta = palabraSecreta ;
		this.porcentajeLetras = porcentaje ;
		posicionAleatoria = new GeneraAleatorio();
		log = new EscribeLog();
		log.escribe("creado \n");
	}
	
	
	
	public String obtener(){
		
		int palabraSecretaSize ;
		String palabraParcial ;
		int letrasVisibles ;
		HashSet<Integer> posiciones = new HashSet<Integer>() ;
		char[] cadenaSecreta;
		
		log.escribe("entra obtener \n");
		log.escribe(palabraSecreta + "\n");
		
		palabraSecretaSize = palabraSecreta.length();
		log.escribe(Integer.toString(palabraSecretaSize));
		letrasVisibles = Math.round(palabraSecretaSize * porcentajeLetras );
		
		log.escribe("calcula letras visibles." + letrasVisibles + " " + palabraSecreta + "\n");
		
		cadenaSecreta = palabraSecreta.toCharArray();
		
		log.escribe("llega al do.");
		
		do{
		
			Integer posicion  ;
			int pos ;
			
			pos = posicionAleatoria.delintervalo(0, palabraSecretaSize-1 );
			posicion = (Integer) pos ;
			posiciones.add(posicion);
			log.escribe(Integer.toString(posicion) + "\n");
		}		
		while (posiciones.size() < letrasVisibles);
		
		
		log.escribe("llega al for. \n");
		
		for(Integer i : posiciones){
			
			cadenaSecreta[i]= '-' ;
			
		}
		
		palabraParcial = new String(cadenaSecreta);
		
		log.escribe("quiere devolver: " + palabraParcial);
		
		return palabraParcial ;
		
	}
	

}
