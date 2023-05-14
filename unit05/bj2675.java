package unit05;
//import java.io.*;
import java.util.Scanner;
public class bj2675 {
	public static void main(String[ ]args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();	//테스트 갯수
		int[] R = new int[T]; 	//반복횟수
		String[] S = new String[T];	//문자열

		for(int i=0; i<T; i++) {
			R[i] = sc.nextInt();
			S[i] =sc.next(); 	
		}
		int cnt = 0;
		for(int i =0; i<T; i++) {
			cnt=0;
			for(int j=0; j<S[i].length(); j++) {
				for(int a= 0; a<R[i]; a++) {
					System.out.print(S[i].charAt(j));
				}
				cnt++;
			}
			System.out.println();
		}
	}
}
