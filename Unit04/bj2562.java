package Unit04;
//import java.io*;
import java.util.Scanner;
import java.util.Arrays;

public class bj2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[9];
		for(int i = 0; i<9; i++) {
			num[i] += sc.nextInt();
		}
		
		int max= num[0];
		for(int i = 0; i<9; i++) {
			if(max < num[i]) max = num[i];
		}
		System.out.println(max);
		//index 찾기
		int cnt = 0;
		for(int i = 0; i<9; i++) {
			cnt++;
			if(max == num[i]) break; 
		}
		System.out.println(cnt);
	}
}
