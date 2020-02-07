
import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Crea un array de 10 de números enteros con valores leídos por teclado.
		// Muestra por consola el índice
		// y el valor al que corresponde.
		// A continuación, guarda los valores de este array en otro array distinto,
		// pero con los valores invertidos y muéstralo.
		
		Scanner teclado = new Scanner(System.in);
		
		// Array
		int i;
        int[] array = new int[10];

        for(i=0; i<array.length; i++)
        {
            System.out.printf("Introduzca número %d: ", i+1);
            array[i] = teclado.nextInt();
        }

        for(i=0; i<array.length; i++)
        {
            System.out.println(array[i]);
        }
		
        
        System.out.println();
        System.out.println("La matriz en orden invertido es: ");
		
		for (int j=9; j>= 0; j--) {
			
			System.out.println(array[j]);
		}

	}

}
