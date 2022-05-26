package Q1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Q1316 - 그룹 단어 체커
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for(int i=0; i<N; i++) {
			String word = br.readLine();
			boolean[] checker = new boolean[26];
			boolean flag = true;
			
			for(int j=0; j<word.length(); j++) {
				int index = word.charAt(j)-'a';
				
				if(checker[index]) { // 이전에 사용된 문자인지
					if(word.charAt(j) != word.charAt(j-1)) { // 이전문자와 연속 x
						flag = false;
						break;
					}
				}else { // 처음 나온 문자인지
					checker[index] = true;
				}
			}
			if(flag) {
				cnt++;
			}	
		}
		System.out.println(cnt);
	}
}
