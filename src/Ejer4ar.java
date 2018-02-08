import java.util.Arrays;

public class Ejer4ar {

	public static void main(String[] args) {
		
		int arr = 0 , arrr= 0;
		int [] arra = {1,2,3,4,5,6,7,8,9,10};
		
		
		for (int i = 5; i < arra.length; i++) {
			arrr = arra[i];
			i = i-5;
			arr = arra[i];
			arra [i]=arrr;
		 
			
			i = i +5 ;
			
			arra[i] = arr;
			
			
			
			
			
			
			
		     
		}
		
	for (int i = 0; i < arra.length; i++) {
		
		System.out.println(arra[i] +"  ");
		
	}
		
		// TODO Auto-generated method stub

	}

}
