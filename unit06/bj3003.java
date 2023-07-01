package unit06;
//import java.io.*;
import java.util.*;
public class bj3003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] Chess = {1, 1, 2, 2, 2, 8};
		int[] input = new int[6];
		
		for(int i = 0; i<input.length; i++) {
			input[i] = sc.nextInt();
			if(Chess[i] != input[i]) {	// 갯수가 다를 때 
				input[i] = Chess[i] - input[i];
			} else {	// 갯수가 맞을 때 
				input[i] = 0;
			}
		}
		
		for(int i = 0; i<input.length; i++) {
			System.out.print(input[i] + " ");
		}
		
	}
}
