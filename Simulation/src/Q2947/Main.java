package Q2947;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * Q2947 - 나무 조각
 */
public class Main {
	
	private static void sort_wood(int[] arr) {
		int temp = 0;
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					for(int k=0; k<arr.length; k++) {
						System.out.print(arr[k]+" ");
					}
					System.out.println();
				}
			}
		}
	}
	
	public static void Main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[5];
		
		for(int i=0; i<5; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		sort_wood(arr);
	}

}
