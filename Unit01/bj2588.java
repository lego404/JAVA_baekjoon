package Unit01;
//import java.io.*;
import java.util.Scanner;

public class bj2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;	//입력변수
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		int n3, n4, n5, n6;	//출력변수
		n3 = num1 * (num2%10);
		n4 = num1 * ((num2/10)%10);
		n5 = num1 * ((num2/100)%10);
		//최종값
		n6 = n3 + n4*10 + n5*100;
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(n6);
	}
}
