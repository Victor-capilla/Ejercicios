import java.util.Scanner;
public class eje1ar {
	
	

		
		static int notas[];
		static Scanner sc;
		static double notario= 0;
		static int num= 0;
		public static void pedirNotas(int Cantidad) {
			
			notas = new int[Cantidad];
			for (int i=0; i<Cantidad; i++) {
				System.out.println("Introduzca nota ");
				notas[i] = sc.nextInt();
				num++;
			}
			
		}
		
		public static void calcularMedia() {
			System.out.println("La nota media de las notas es: ");
			
			for (int i = 0; i < notas.length; i++) {
				notario = notario + notas[i];				
				
				
			}
			
			 notario = ((double) notario / num);
				System.out.println(notario);

			// Introduce tu código
			
		}
		
		public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
			System.out.println("Cuántas notas vas a introducir?? ");
			sc = new Scanner(System.in);
			int elementos = sc.nextInt();
			
			pedirNotas(elementos);
			calcularMedia();
		
		}
		
	}


