
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Crea un array de números y otro de String de 10 posiciones donde insertaremos notas entre 0 y 10
		//(debemos controlar que inserte una nota valida), pudiendo ser decimal la nota en el array de números,
		// en el de Strings se insertaran los nombres de los alumnos.
		// Después, crearemos un array de String donde insertaremos el resultado de la nota con palabras.
		// Si la nota esta entre 0 y 4,99, será un suspenso
		// Si esta entre 5 y 6,99, será un bien.
		// Si esta entre 7 y 8,99 será un notable.
		// Si esta entre 9 y 10 será un sobresaliente.
		// Muestra por pantalla, el alumno su nota y su resultado en palabras. Crea los métodos que creas
		// conveniente.

Alumno[] alumnos = new Alumno[10];
		
		alumnos[0] = new Alumno("Joselu", "Suspenso", 4 );
		alumnos[1] = new Alumno("Quique", "Suspenso", 3.9);
		alumnos[2] = new Alumno("Fran", "Bien", 6);
		alumnos[3] = new Alumno("Mike", "Bien", 5.01);
		alumnos[4] = new Alumno("Nelson", "Suspenso", 0);
		alumnos[5] = new Alumno("Laura", "Sobresaliente", 10);
		alumnos[6] = new Alumno("Micaela", "Suspenso", 2.8);
		alumnos[7] = new Alumno("Rosario", "Notable", 8.65);
		alumnos[8] = new Alumno("Fede Valverde", "Sobresaliente", 10);
		alumnos[9] = new Alumno("Adolfo", "Bien", 6);
		
		for (int i=0;i<alumnos.length;i++) {
			System.out.println(alumnos[i].getDatos());
		}
		

	}
}

	
	class Alumno {
		
		private String nombre;
		private String notaescrita;
		private double nota;
		
		public Alumno(String nombre, String notaescrita, double nota) {
			this.nombre=nombre;
			this.notaescrita=notaescrita;
			this.nota=nota;
		}
		
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getNotaescrita() {
			return notaescrita;
		}

		public void setNotaescrita(String notaescrita) {
			this.notaescrita=notaescrita;
		}

		public double getNota() {
			return nota;
		}

		public void setNota(int nota) {
			this.nota=nota;
		}
		
		public String getDatos() {
			return "El alumno "+nombre+" ha sacado un "+nota+", por tanto, su nota es un "+notaescrita;
		}
	
	}


