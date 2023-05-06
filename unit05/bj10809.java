package unit05;
//import java.io.*;
import java.util.Scanner;
public class bj10809 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		char[] sArray = S.toCharArray(); 
		int [] num = new int[26];
		
		for(int i =0; i<26; i++) {
			num[i] = -1;
		}
		
		int cnt=0;
		//문자 비교
		for(int i = 0; i<S.length(); i++) {
			for(int j =0; j<26; j++) {
				if(num[j] == -1 && sArray[i] == j+97) {
					num[j] = cnt;
					cnt++;
				} else if(sArray[i] == j+97) cnt++;
			}
		}
		
		for(int i =0; i<26; i++) {
			System.out.print(num[i] + " ");
		}
	}
}
