package semana1;

import semana1.*;

public class PrincipalEnum {

	public static void main(String[] args) {
		//Asigno un valor a lista.
		listaEnumerados lista = listaEnumerados.MARTES;
		
		
		//El metodo ordinal me devuelve la posicion de MARTES en este caso, Arranca en cero.
		if(lista.ordinal()==0){
			System.out.println(lista);
		}
		else {
			System.out.println("No se encuentra en la posicion seteada");
		}
		
		//Lista todos los valores del enumerado
		for(listaEnumerados e1 : listaEnumerados.values()) {
			System.out.println(e1);
		}
		
	}

}
