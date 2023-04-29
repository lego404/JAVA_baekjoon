package Unit04;
//import java.io.*;
import java.util.Scanner;
public class bj1546 {
	public static void main(String[ ]args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//과목 수
		double [] num = new double[N];

		//과목 점수 입력
		double M = 0;	//가장 큰 수
		for(int i = 0; i<N; i++) {
			num[i] = Double.parseDouble(sc.next());
			if(M <num[i]) M = num[i];
		}
		
		//점수 조작
		double sum = 0;
		for(int i = 0; i<N; i++) {
			num[i] = (num[i]/M)*100;
			sum += num[i];
		}
		System.out.println(sum/N);
	}
}
