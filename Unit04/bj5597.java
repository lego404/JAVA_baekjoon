package Unit04;
//import java.io*;
import java.util.Scanner;
public class bj5597 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[30];
		for(int i = 0; i<28; i++) {
			int input = sc.nextInt();
			num[input-1] = input;
		}
		
		//출력
		for(int i =0; i<28; i++) {
			if(num[i] == 0)
				System.out.println(i+1);
		}
	}
}

