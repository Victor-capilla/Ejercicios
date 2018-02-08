import java.util.Arrays;
import java.util.Scanner;

public class ejer5ar {

	public static void main(String[] args) {
		
		
		
		Scanner s = new Scanner(System.in);
		int contador = 0;
		System.out.println("cuantas sumas quieres hacer");
		int cantidad2 = s.nextInt();
		System.out.println("introduce una cantidad");
		int cantidad = s.nextInt() ;
		
		
		int rr[]= new int [cantidad];
		
		int rrr[]= new int[cantidad];
		
		
		
		for (int i = 0; i <= cantidad2; i++) {if (i>0) {System.out.println(Arrays.toString(rr)+" + " + Arrays.toString(rrr)+ " "+contador);	
			
		} for (int j = 0; j < rrr.length; j++) { rr[j] = s.nextInt(); rrr[j]= s.nextInt();
		if (rrr[j]+rr[j]>9) {contador++;
			
		}
			
		}
		
		}
		
		
			
		
	
		
		// TODO Auto-generated method stub

	}

}
