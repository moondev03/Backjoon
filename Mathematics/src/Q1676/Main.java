package Q1676;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Q.1676
문제> N!에서 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 0의 개수를 구하는 프로그램을 작성하시오.
입력> 첫째 줄에 N이 주어진다. (0 ≤ N ≤ 500)
출력> 첫째 줄에 구한 0의 개수를 출력한다.
*/
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int cnt_2 = 0;
		int cnt_5 = 0;
		
		for(int i=1; i<=num; i++) {
			int t = i;
			
			while(t%2 == 0) {
				cnt_2++;
				t /= 2;
			}
			
			while(t%5 == 0) {
				cnt_5++;
				t /= 5;
			}
		}
		
		System.out.println(Math.min(cnt_2, cnt_5));
	}
}
