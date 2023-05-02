package unit05;
//import java.io.*;
import java.util.*;

public class bj11720 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//숫자의 개수
		String str = sc.next();
		char[] charArr = str.toCharArray();	//문자열을 문자의 배열로 바꿔주는 메소드
		int sum =0;
		for(int i = 0; i<N; i++) {
			sum += (int)charArr[i] -'0';
		}
		System.out.println(sum);
	}
}
