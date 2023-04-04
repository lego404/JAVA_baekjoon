package Unit03;
//import java.io.*;
import java.util.Scanner;

public class bj11021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int A, B;
		//input
		for(int i = 0; i<T; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			
			System.out.println("Case #" + (i+1) + ": " + (A + B));
		}

	}
}
