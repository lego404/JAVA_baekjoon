package Unit04;
//import java.io.*;
import java.util.Scanner;
public class bj10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//정수 N개
		int X = sc.nextInt();	//최대값 X
		int[] A = new int[N];	//N개의 정수로 이루어진 수열 A
		
		//입력
		for(int i = 0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		//출력
		for(int i = 0; i<N; i++) {
			if(A[i] <X) System.out.print(A[i] + " ");
		}
	}
}
