package Q1918;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
 * Q1918 - 중위표기법 -> 후위표기법
*/

public class Main {
	public static int priority(char c) {
		if (c == '*' || c == '/') {
			return 2;
		} else if (c == '+' || c == '-') {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) throws IOException {
		Stack<Character> stack = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		for (int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);

			switch (temp) {

			case '(':
				stack.push(temp);
				break;

			case ')':
				while (true) {
					if (stack.peek().equals('(')) {
						stack.pop();
						break;
					} else {
						System.out.print(stack.pop());
					}
				}
				break;

			case '+':
			case '-':
			case '*':
			case '/':
				while (!stack.isEmpty() && priority(stack.peek()) >= priority(temp)) {
					System.out.print(stack.pop());
				}
				stack.push(temp);
				break;

			default:
				System.out.print(temp);
				break;
			}
		}
		while (!stack.isEmpty()) {
			System.out.print(stack.pop());
		}

	}
}
