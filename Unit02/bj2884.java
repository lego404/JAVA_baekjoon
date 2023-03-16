package Unit02;
import java.io.*;
import java.util.Scanner;

public class bj2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 //(0 ≤ H ≤ 23, 0 ≤ M ≤ 59)
		int H, M;
		H = sc.nextInt();
		M = sc.nextInt();
		
		if(M > 45) {
			System.out.println(H + " " + (M - 45));
		} else if(M < 45) {
			if(H == 0) {
				H = 23;
				System.out.println(H + " " + (M + 15));
			}else {
				System.out.println(--H + " " + (M+15));
			}
		} else if(M == 45) {
			System.out.println(H + " " + (M-45));
		}
	}
}
