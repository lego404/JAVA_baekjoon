package unit05;
//import java.io.*;
import java.util.*;

public class bj1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		char[] words = str.toCharArray();
		int cnt =1;
		for(int i =0; i<words.length; i++) {
			if(words[i] == ' ') {
				cnt++;
			}
		}
		if(words[0] == ' ') cnt--;
		if(words[words.length-1] == ' ') cnt--;
		
		System.out.println(cnt);
	}
}

