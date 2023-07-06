package unit06;
//import java.io.*;
import java.util.*;
public class bj10988 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char[] input_rvs = input.toCharArray();
		
		for(int i = 0; i<input.length()/2; i++) {
			char temp = input_rvs[i];
			input_rvs[i] = input_rvs[(input.length()-1)-i];
			input_rvs[(input.length()-1)-i] = temp;
		}
		
		String input_rvs_1 = new String(input_rvs);
		if(input.equals(input_rvs_1))
			System.out.println("1");
		else 
			System.out.println("0");
		
	}
}
