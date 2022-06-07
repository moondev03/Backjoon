package Q10773;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
 * Q10773 - 제로
 */
public class Main {
	public static void main(String[] args) throws IOException {
		Stack<Integer> stack = new Stack<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int K = Integer.parseInt(br.readLine());
		for(int i=0; i<K; i++) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) {stack.pop();}
			else {stack.push(n);}
		}
		
		int sum = 0;
		for(int i : stack) {
			sum += i;
		}
		System.out.println(sum);
	}
}
