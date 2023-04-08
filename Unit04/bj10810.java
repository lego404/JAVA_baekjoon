package Unit04;
//import java.io.*;
import java.util.Scanner;
public class bj10810 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//바구니, 공 갯수
		int M = sc.nextInt();	//앞으로 공을 넣을 횟수
		
		int[] result = new int[N];
		for(int b = 0; b<M; b++) {
			int i = sc.nextInt();	//i번 부터
			int j = sc.nextInt();	//j번까지 
			int k = sc.nextInt();	//k번 번호가 적힌 공을 넣을 거임 
			
			//'i번부터 j번까지'로 입력받으니까 배열의 인덱스에 맞추어서 넣어야함 
			for(int a = i-1; a<=j-1; a++) {
				result[a] = k;
			}
		}
		for(int i = 0; i< N; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
