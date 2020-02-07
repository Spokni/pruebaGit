import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Crea un array de 20 números enteros entre 0 y 100 generados aleatoriamente. A continuación, guarda
		// en otro array los elementos pares de la primera, y a continuación los elementos impares. 
		
		Scanner teclado = new Scanner(System.in);
		
		int[] array=new int[20];
		int[] pares=new int[20];
		int[] impares=new int[20];
		
		 for(int j=0; j<array.length; j++)
	        {
	            array[j] = (int) (Math.random()*100);
	        }
		 
		 for(int k=0; k<array.length; k++)
	        {
	            if (array[k]%2==0) {
	            	 pares[k]=array[k];
	            } else {
	            	impares[k]=array[k];
	            }
	        }

		 System.out.println("La matriz de pares es: ");
		 for(int j=0; j<array.length; j++)
	        {
	            System.out.println(pares[j]);;
	        }
		 
		 System.out.println("La matriz de impares es: ");
		 for(int j=0; j<array.length; j++)
	        {
	            System.out.println(impares[j]);
	        }
	}

}
