package Q7785;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.StringTokenizer;

/*
 * Q7785 - 회사에 있는 사람
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet h = new HashSet();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String state = st.nextToken();
			if(state.equals("enter")) {
				h.add(name);
			}
			if(state.equals("leave")) {
				h.remove(name);
			}
		}
		
		ArrayList arr = new ArrayList(h);
		arr.sort(Comparator.reverseOrder());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<arr.size(); i++) {
			sb.append(arr.get(i)).append("\n");
		}
		System.out.println(sb);
	}

}
