package Q1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
 * Q1978 - 소수찾기
 */
public class Main {
	public static int cnt_divisor(int n) {
		int i = 1;
		int cnt = 0;
		while(i <= n) {
			if(n % i == 0) {cnt++;}
			i++;
		}
		return cnt;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			int temp = cnt_divisor(Integer.parseInt(st.nextToken()));
			if(temp == 2) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
