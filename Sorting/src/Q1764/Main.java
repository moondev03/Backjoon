package Q1764;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.StringTokenizer;

/*
 * Q1764 - 듣보잡
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashSet<String> hs = new HashSet<>();
		for(int i=0; i<N; i++) {
			hs.add(br.readLine());	
		}
		
		ArrayList<String> arr = new ArrayList<String>();
		for(int i=0; i<M; i++) {
			String temp = br.readLine();
			if(hs.contains(temp)){
				arr.add(temp);
			}
		}
		
		arr.sort(Comparator.naturalOrder());
		
		System.out.println(arr.size());
		for(String s : arr) {
			System.out.println(s);
		}
		
	}
}
