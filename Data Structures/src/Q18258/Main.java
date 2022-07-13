package Q18258;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

/*
 * Q18258 - 큐 2
 */
public class Main {
	LinkedList<Integer> queue = new LinkedList<>();
	public static void main(String[] args) throws IOException {
		Main m = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			switch (st.nextToken()) {
			case "push":
				m.push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				sb.append(m.pop()).append("\n");
				break;
			case "size":
				sb.append(m.size()).append("\n");
				break;
			case "empty":
				sb.append(m.empty()).append("\n");
				break;
			case "front":
				sb.append(m.front()).append("\n");
				break;
			case "back":
				sb.append(m.back()).append("\n");
				break;

			default:
				break;
			}
		}
		System.out.println(sb);
	}
	
	private void push(int X) {
		queue.offer(X);
	}
	
	public int pop() {
		if(empty()==1) {return -1;}
		return queue.poll();
	}
	
	private int size() {
		return queue.size();
	}
	
	private int empty() {
		if(queue.isEmpty()) {return 1;}
		return 0;
	}
	
	private int front() {
		if(empty()==1) {return -1;}
		return queue.peek();
	}
	
	private int back() {
		if(empty()==1) {return -1;}
		return queue.peekLast();
	}
}
