import java.util.*;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crea un array de números donde le indicamos por teclado el tamaño del array, rellenaremos el array
		// con números aleatorios entre 0 y 100, al final muestra por pantalla el valor de cada posición y la suma
		// y la media de todos los valores. 
		
		Scanner teclado = new Scanner(System.in);
	
		int suma=0;
		
		System.out.println("Dime el tamaño del array: ");
		int t= teclado.nextInt();
		
		int[] array=new int[t];
		
		 for(int j=0; j<array.length; j++)
	        {
	            array[j] = (int) (Math.random()*100);
	        }
		 
		 for(int k=0; k<array.length; k++)
	        {
	            System.out.println("En la posicion "+ k +" esta el numero: "+array[k]);
	            suma += array[k];
	        }
		 
		 
		 System.out.println("La suma es: "+suma);
		 
		 int media= suma/t;
		 
		 System.out.println("La media es: "+media);
		
		
	}

}
