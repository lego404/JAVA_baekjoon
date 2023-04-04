package Unit03;
//import java.io.*;
import java.util.Scanner;
public class bj10952 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a == 0 && b == 0) break;
			else System.out.println(a+b);
		}
	}
}
