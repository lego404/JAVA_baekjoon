package Unit03;
import java.io.*;
import java.util.StringTokenizer;

public class bj15552 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		
		//입력
		for(int i = 0; i< num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()); //StringTokenizer인자값에 입력 문자열 넣음
			int a = Integer.parseInt(st.nextToken()); //첫번째 호출
			int b = Integer.parseInt(st.nextToken()); //두번째 호출
			
			bw.write(a + b + "\n");
		}
		
		bw.flush();
		bw.close();
		
	}
}
