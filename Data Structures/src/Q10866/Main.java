package Q10866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

/*
 * Q10866 - 덱
 */
public class Main {
	private Deque<Integer> deque = new ArrayDeque<>();
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Main m = new Main();
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			switch(st.nextToken()) {
			
			case "push_front":
				m.push_front(Integer.parseInt(st.nextToken()));
				break;
				
			case "push_back":
				m.push_back(Integer.parseInt(st.nextToken()));
				break;
				
			case "size":
				m.size();
				break;
				
			case "empty":
				m.empty();
				break;
				
			case "front":
				m.front();
				break;
				
			case "back":
				m.back();
				break;
				
			case "pop_front":
				m.pop_front();
				break;
				
			case "pop_back":
				m.pop_back();
				break;
				
			default:
				break;
			}
		}
		
		
	}
	
	private void push_front(int X) {
		deque.addFirst(X);
	}
	private void push_back(int X) {
		deque.addLast(X);
	}
	private void pop_front() {
		if(deque.size()==0) {System.out.println(-1);}
		else {
			System.out.println(deque.getFirst());
			deque.removeFirst();
		}
	}
	private void pop_back() {
		if(deque.size()==0) {System.out.println(-1);}
		else {
			System.out.println(deque.getLast());
			deque.removeLast();
		}
	}
	
	private void size() {
		System.out.println(deque.size());
	}
	
	private void empty() {
		if(deque.size()==0) {System.out.println(1);}
		else {System.out.println(0);}
	}
	
	private void front() {
		if(deque.size()==0) {System.out.println(-1);}
		else {System.out.println(deque.getFirst());}
	}
	
	private void back() {
		if(deque.size()==0) {System.out.println(-1);}
		else {System.out.println(deque.getLast());}
	}
	
}
