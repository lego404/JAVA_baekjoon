package Unit04;
//import java.io.*;
import java.util.Scanner;
public class bj10807 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//N개의 정수 주어졌을때
		int num[] = new int[N];
		int cnt = 0;	//count
		//input
		for(int i = 0; i<N; i++) {
			num[i] = sc.nextInt();
		}
		
		int V = sc.nextInt();	//정수 V
		
		//count
		for(int i = 0;i<N; i++) {
			if(num[i] == V) cnt++;
		}
		
		System.out.println(cnt);
	}
}
