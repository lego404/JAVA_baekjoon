package unit05;
//import java.io.*;
import java.util.*;
public class bj2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String A = sc.next();
		String B = sc.next();
		
		char[] A_arr = new char[3];
		char[] B_arr = new char[3];
		for(int i = 0; i<3; i++) {
			A_arr[i] = A.charAt(i);
			B_arr[i] = B.charAt(i);
		}
		char tempA, tempB;
		//A
		tempA = A_arr[0];
		A_arr[0] = A_arr[2];
		A_arr[2] = tempA;
		//B
		tempB = B_arr[0];
		B_arr[0] = B_arr[2];
		B_arr[2] = tempB;
		
		int A_result = Integer.parseInt(String.valueOf(A_arr));
		int B_result = Integer.parseInt(String.valueOf(B_arr));
		
		int result = (A_result > B_result) ? A_result : B_result; 
		System.out.println(result);
	}
}
