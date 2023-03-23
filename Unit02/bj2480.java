package Unit02;
//import java.io.*;
import java.util.Scanner;
public class bj2480 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		//같은 눈 3개 나온 경우
		if(A == B && A == C && B == C) {
			System.out.println(10000+A*1000);
		} 
		//같은 눈 2개 나온 경우
		else if (A == B || A == C || B == C) {
			if(A == B || A == C)
				System.out.println(1000 + A * 100);
			else if(B == C)
				System.out.println(1000 + B * 100);
		}
		//모두 다른 눈 나오는 경우
		if(A != B && A != C && B != C) {
			int max = 0;
			if(A > B) {
				max = A;
				if (C > A) {
					max = C;
				}
			} else {
				if(C > B) max = C;
				else max = B;
			}
			System.out.println(max * 100);			
		}
	}
}
