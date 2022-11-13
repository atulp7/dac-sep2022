import java.lang.*;
import java.util.*;

class EncodedDecodedString13{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the encoded string : ");
		String s = sc.nextLine();
		
		String ch = s.replaceAll("[^a-zA-Z]", "");
		String num = s.replaceAll("[^0-9]", "");
		
		int x[] = new int[num.length()];
		for(int i = 0; i < x.length; i++){
			
			x[i] = Character.getNumericValue(num.charAt(i));
		}
		
		for(int i = 0; i < ch.length(); i++){
			int k = x[i];
			for(int j = 0; j < k; j++){
				
				System.out.print(ch.charAt(i));
			}
		}
		
	}
}