package problema;

/** 
 * 
 * ENUNCIADO
 * 
 * Hemos llegado al 405 de One piece, "No pude salvar a un solo nakama, la banda de los mugiwara se separa"
 * Luffy lleva 3 años sion encontrarse con sus nakamas y para que la Marina no los encuentre
 * han desarrollado un código secreto para poder identificare sin peligro.
 * 
 * Crea un programa para ayudar a los mugiwara a poder reencontrarse.
 * 1.El programa tiene que contar una cantidad exacta de "x" en minúscula sobre un texto.
 * 2.Si la cantidad de "x" es igual a los namakas totales hasta el cap 405 puedes entrar al Thousand Sunny.
 * 3.Si la cantidad de "x" es inferior subes a un barco de la marina
 * 4.Si la cantidad es superior entras al BARTO CLUB porque eres fan, te has esforzado, pero no eres un nakama.
 * Si no sabes cuantos nakamas había no mereces hacer el programa (9 contando a luffy).
 * 
 * 
 * "Estaba en Texas tranquila hasta que un extraño grito a mi exmarido, exijia que Felix tuviera sexo con el, mi exmarido lo boxeo y pedimos un taxi"
 * "Una boxeadora de Texas extrañaba a Felix, su exmarido exiliado, se le paso y pidio un taxi"
 * 
 * 
 * 
 * @author Qukita92
 * @version 1.0
 * @since Java 8.0
 * 
 * 
 */

public class problema1 {
		/**
		 * 
		 * problema1: Clase Buscadora de Nakamas
		 * @param args main del problema con Syso para el resultado por consola
		 * 
		 */

	public static void main(String[] args) {
		System.out.println(decodificadorDeNakamas(""));
		}
		
		/**
		 * 
		 * @param cadena String Lee una frase, compara los caracteres con codigoSecreto
		 *  y finalmente te dice si eres amigo,fan o te arrestan en el barco de la Marine
		 *  @return "Thousand Sunny","BARTO CLUB","Marine"
		 */
	
	public static String decodificadorDeNakamas(String cadena) {
		int cuentaNakama=0; 
		String codigoSecreto="x";
	        int contador[]={0};
	 
	        // recorrer la cadena todas las letras
	        
	        for(int i=0;i<cadena.length();i++) {
	 
	            // recorrer y comparar con las x
	        	
	            for(int j=0;j<codigoSecreto.length();j++) {
	            	
	                if(cadena.charAt(i)==codigoSecreto.charAt(j)) {
	                	
	                    // contador ++ para cuando encuentre vocal
	                	
	                    contador[j]++;
	                }
	            }
	        }
	 
	        for(int i=0;i<codigoSecreto.length();i++) {
	        cuentaNakama = contador[i];
	        
	        }
	        
	        if (cuentaNakama==9) {
            	return "Thousand Sunny";			        
	        }else if (cuentaNakama>9) {
	        	return "BARTO CLUB";	
	        }else {
	        	return "Marine";	
	        }   
	}	
}


