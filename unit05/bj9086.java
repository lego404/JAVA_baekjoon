package unit05;
//import java.io.*;
import java.util.*;
public class bj9086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String[] str = new String[T];
		for(int i = 0; i<T; i++) {
			str[i] = sc.next();
		}
		
		//출력
		char [] first = new char[T];
		char [] fin = new char[T];
		for(int i = 0; i<T; i++) {
			first[i] = str[i].charAt(0);
			if(str[i].length()==1)
				fin[i] = str[i].charAt(0);
			else
				fin[i] = str[i].charAt(str[i].length()-1);
			System.out.println(first[i]+""+fin[i]);
		}
		sc.close();
	}
}
