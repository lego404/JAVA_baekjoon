package Unit03;
//import java.io.*;
import java.util.Scanner;
public class bj10950 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] a = new int[num];
		int[] b = new int[num];
		//입력
		for(int i = 0; i<num; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		//출력
		for(int i = 0; i<num; i++) {
			System.out.println(a[i] + b[i]);
		}
	}
}
