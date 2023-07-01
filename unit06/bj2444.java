package unit06;
//import java.io.*;
import java.util.*;
public class bj2444 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 0; i<N; i++) {
			for(int a = 0; a<N-(1+i); a++) {
				System.out.print(" ");
				}
			for(int b = 0; b<N+i-(N-(1+i)); b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 1; i<N; i++) {
			for(int a = 0; a<i; a++) {
				System.out.print(" ");
			}
			for(int b = 0; b<N*2-(i*2+1); b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
