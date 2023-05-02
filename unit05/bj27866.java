package unit05;
//import java.io.*;
import java.util.Scanner;

public class bj27866 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int i = sc.nextInt();
		char found = S.charAt(i-1);
		System.out.println(found);
	}
}
