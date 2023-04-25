package Unit04;
//import java.io.*;
import java.util.*;
public class bj3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> HS = new HashSet<Integer>();

		int[] num = new int[10];
		for(int i = 0; i<10; i++) {
			num[i] = sc.nextInt();
			HS.add(num[i]%42);
		}
		
		System.out.println(HS.size());
	}
}
