package Unit03;
//import java.io.*;
import java.util.Scanner;
public class bj11022 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();	//테스트 케이스의 개수
		for(int i = 0; i<X; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println("Case #" + (i+1) + ": " + A + " + " + B + " = " + (A+B));
		}
	}
}
