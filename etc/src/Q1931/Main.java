package Q1931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/*
 * Q1931 - 회의실 배정
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] time = new int[N][2];
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			time[i][0] = Integer.parseInt(st.nextToken());
			time[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(time, new Comparator<int[]>() {
			
			@Override 
			public int compare(int[] p1, int[] p2) {
				if(p1[1] == p2[1]) {
					return p1[0] - p2[0];
				}
				
				return p1[1]-p2[1];
			}
		});
			
		
		int cnt = 0;
		int prev_end = 0;
		
		for(int i=0; i<N; i++) {
			if(prev_end <= time[i][0]) {
				prev_end = time[i][1];
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
