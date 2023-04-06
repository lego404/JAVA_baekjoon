package Unit04;
//import java.io.*;
import java.util.Scanner;
public class bj10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//정수의 개수
		int[] num = new int[N];
		//입력
		for(int i = 0; i<N; i++) {
			num[i] = sc.nextInt();
		}
		int min = num[0];
		int max = num[0];
		//최대값, 최소값 구하기
		for(int i = 0; i<N; i++) {
			if(max < num[i]) max = num[i];
			if(min > num[i]) min = num[i];
		}
		System.out.print(min + " " + max);
	}
}
