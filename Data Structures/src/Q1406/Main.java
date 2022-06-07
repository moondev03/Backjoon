package Q1406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * Q1406 - 에디터 
 */
public class Main {
	private ArrayList arr_Str = new ArrayList();
	
	public int cursor_index() {
		for(int i=0; i<arr_Str.size(); i++) {
			if(arr_Str.get(i).equals('/')) {
				return i;
			}
		}
		return -1;
	}
	
	public void L() {
		int index = cursor_index();
		if(index != 0) {
			Object temp =  arr_Str.get(index-1);
			arr_Str.add(index, temp);
			arr_Str.add(index-1, '/');
			arr_Str.remove(arr_Str.size()-1);
			arr_Str.remove(arr_Str.size()-1);
		}
	}
	
	public void D() {
		int index = cursor_index();
		if(index != arr_Str.size()-1) {
			Object temp = arr_Str.get(index+1);
			arr_Str.add(index, temp);
			arr_Str.add(index+1, '/');
			arr_Str.remove(arr_Str.size()-1);
			arr_Str.remove(arr_Str.size()-1);
		}
	}
	
	public void B() {
		int index = cursor_index();
		if(index != 0) {
			for(int i=0; i<index; i++) {
				arr_Str.remove(0);
			}
		}
	}
	
	public void P(String c) {
		int index = cursor_index();
		if(index == 0) {
			arr_Str.add(0, c);
		}else {
			arr_Str.add(index, c);			
		}
	}

	public static void main(String[] args) throws IOException {
		Main t = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<str.length(); i++) {
			t.arr_Str.add(i, str.charAt(i));
		}
		t.arr_Str.add('/');
		
		for(int i=0; i<N; i++) {
			StringTokenizer cmd = new StringTokenizer(br.readLine());
			String token = cmd.nextToken();
			if(token.equals("L")) {t.L();}
			else if(token.equals("D")) {t.D();}
			else if(token.equals("B")) {t.B();}
			else if(token.equals("P")) {t.P(cmd.nextToken());}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<t.arr_Str.size(); i++) {
			if(t.arr_Str.get(i).equals('/')) {continue;}
			sb.append(t.arr_Str.get(i));
		}
		System.out.println(sb);
	}

}
