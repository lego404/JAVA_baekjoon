package Unit04;
//import java.io.*;
import java.util.Scanner;
public class bj10813 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();	//M번 공 바꿈 
		
		int []ball = new int[N];
		for(int i = 0; i<N; i++) {
			ball[i] =i+1;
		}
		
		//공 바꾸기
		for(int a = 0; a<M; a++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int temp = ball[i-1];
			ball[i-1] = ball[j-1];
			ball[j-1] = temp;
		}
		for(int i = 0; i<N; i++) {
			System.out.print(ball[i] + " ");
		}
	}
}
