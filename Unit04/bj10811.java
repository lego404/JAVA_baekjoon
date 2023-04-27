package Unit04;
//import java.io.*;
import java.util.*;
public class bj10811 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//바구니 갯수
		int M = sc.nextInt();	//바구니 바꿀 횟수
		int i =0, j=0;	//i부터 j까지의 바구니 역순으로 만들기
		int [] num = new int[N];
		for(int a = 1; a<=N; a++) {
			num[a-1] = a;
		}
		int temp = 0;
		for(int a = 0; a<M; a++) {
			i = sc.nextInt();
			j = sc.nextInt();
			for(int b = i-1; b<j-1; b++) {
				temp = num[b];
				num[b] = num[j-1];
				num[j-1] = temp;
				j--;
			}
		}
		for(int a = 0; a<N; a++) {
			System.out.print(num[a] + " ");
			
		}
	}
}
