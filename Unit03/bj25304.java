package Unit03;
//import java.io.*;
import java.util.Scanner;
public class bj25304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();	//영수증에 적힌 총 금액	1,000,000,000까지 
		int N = sc.nextInt();	//영수증에 적힌 구매한 물건의 종류 수
		int []a = new int[N];	//구매한 물건의 가격
		int []b = new int[N];	//구매한 물건의 개수
		
		//입력
		for(int i = 0; i<N; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i=0; i<N; i++) {
			sum += a[i] * b[i];
		}
		
		if(sum == X) System.out.print("Yes");
		else System.out.print("No");
		
	}
}
