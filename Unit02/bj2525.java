package Unit02;
//import java.io.*;
import java.util.Scanner;
public class bj2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int A, B, C;	//시, 분, 조리시간
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();

		int time = A*60 + B + C;
		A = time/60;
		B = time % 60;
		if(A >= 23) {
			A %= 24;
			System.out.println(A + " " + B);
		} else 
			System.out.println(A + " " + B);
	}
}
