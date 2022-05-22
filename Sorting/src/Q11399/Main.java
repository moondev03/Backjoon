package Q11399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * Q11399 - ATM
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String p = br.readLine();
		StringTokenizer st = new StringTokenizer(p);
		
		int[] arr_p = new int[N];
		
		for(int i=0; i<N; i++) {
			int temp = Integer.parseInt(st.nextToken());
			arr_p[i] = temp;
		}
		
		Arrays.sort(arr_p);
		
		int sum = 0;
		for(int i=0; i<N; i++) {
			int[] temp = Arrays.copyOfRange(arr_p, 0, i+1);
			for(int j=0; j<temp.length; j++) {
				sum += temp[j];
			}
		}
		System.out.println(sum);
	}
}
