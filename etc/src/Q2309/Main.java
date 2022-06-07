package Q2309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * Q2309 - 일곱 난쟁이
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] height = new int[9];
		int sum = 0;
		
		for(int i=0; i<9; i++) {
			height[i] = Integer.parseInt(br.readLine());
			sum+=height[i];
		}
		
		int[] del_index = new int[2];
		
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				if(sum-(height[i]+height[j])==100){
					del_index[0] = i;
					del_index[1] = j;
					break;
				}
					
				}
			if(sum == 100) {break;}
		}
		
		height[del_index[0]] = 0;
		height[del_index[1]] = 0;
		Arrays.sort(height);
		
		for(int i=0; i<height.length; i++) {
			if(height[i] == 0) {continue;}
			System.out.println(height[i]);
		}
	}

}
