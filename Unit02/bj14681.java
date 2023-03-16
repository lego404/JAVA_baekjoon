package Unit02;
//import java.io.*;
import java.util.Scanner;
/*
 * Q1: x 양수, y 양수
 * Q2: x 음수, y 양수
 * Q3: x 음수, y 음수
 * Q4: x 양수, y 음수 
 */
public class bj14681 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//(x, y) 좌표 입력 
		int x = Integer.parseInt(sc.nextLine());
		int y = Integer.parseInt(sc.nextLine());
		
		//제1사분면 
		if(x > 0 && y > 0) System.out.println("1");
		else if(x < 0 && y > 0) System.out.println("2");
		else if(x < 0 && y < 0) System.out.println("3");
		else if(x > 0 && y < 0) System.out.println("4");
		
	}
}
