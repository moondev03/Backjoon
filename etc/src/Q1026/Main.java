package Q1026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/*
 * Q1026 - 보물
 */
public class Main {
	
	private static void S(Integer[] A, int[] B, int[] rank) {
		int sum = 0;
		
		for(int i=0; i<A.length; i++) {
			sum += A[i] * B[rank[i]];
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int N = Integer.parseInt(br.readLine());
		Integer[] A = new Integer[N];
		int[] B = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; st.hasMoreTokens(); i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; st.hasMoreTokens(); i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}
		
		// A 배열 오름차순 정렬
		Arrays.sort(A, Collections.reverseOrder());
		
		// B 배열을 오름차순 정렬한 tempArr 배열생성
		int[] tempArr = B;
		for(int i=0; i<tempArr.length; i++) {
			for(int j=i+1; j<tempArr.length; j++) {
				if(tempArr[i]>tempArr[j]) { 
					int temp = tempArr[i];
					tempArr[i] = tempArr[j];
					tempArr[j] = temp;
				}
			}
		}
		
		// rank배열에 B배열의 rank순 index저장
		int[] rank = new int[A.length];
		for(int i=0; i<tempArr.length; i++) {
			for(int j=0; j<tempArr.length; j++) {
				if(tempArr[i] == B[j]) {
					rank[i] = j;
				}
			}
		}
		
		// S함수
		S(A, B, rank);
	}
}
