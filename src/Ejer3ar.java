import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejer3ar {

	public static void main(String[] args) {
		
		
		
		int cantidad;
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("introduce la cantidad de numero que quieres meter");
		cantidad =  s.nextInt();
		Integer [] pedir = new Integer[cantidad];
		
		for (int c = 0; c < pedir.length; c++) {
			
			System.out.println("introduce un numero");
			pedir[c] = s.nextInt();
			
			
		}
		// TODO Auto-generated method stub
		Arrays.sort(pedir,Collections.reverseOrder());
		
		for (int i : pedir) {
			
			System.out.println(i + " ");
		
			
		}
	}

}
