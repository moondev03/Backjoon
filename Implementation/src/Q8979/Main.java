package Q8979;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * Q8979 - 올림픽
 */
public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); 
		int K = Integer.parseInt(st.nextToken()); 
		
		int[][] recode = new int[N][4];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			recode[i][0] = Integer.parseInt(st.nextToken()); // 나라
			recode[i][1] = Integer.parseInt(st.nextToken()); // 금
			recode[i][2] = Integer.parseInt(st.nextToken()); // 은
			recode[i][3] = Integer.parseInt(st.nextToken()); // 동
		}
		
		int index = -1;
		for(int i=0; i<N; i++) {
			if(recode[i][0] == K) {index = i;}
		}
		
		int cnt = 1;
        for(int i=0; i<N; i++){
            if(i == index) 
                continue;
            else{
                if(recode[i][1] > recode[index][1]){
                    cnt++;
                    continue;
                }else if(recode[i][1] == recode[index][1]){
                    if(recode[i][2] > recode[index][2]) {cnt++;}
                   
                    else if(recode[i][2] == recode[index][2]){
                        if(recode[i][3] > recode[index][3]) {cnt++;}
                    }
                }
            }
        }
        System.out.println(cnt);
	}
}
