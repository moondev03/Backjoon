package Q2743;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
����_Q2743
���ĺ����θ� �̷���� �ܾ �Է¹޾�, �� ���̸� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ���� �ҹ��ڿ� �빮�ڷθ� �̷���� �ܾ �־�����. �ܾ��� ���̴� �ִ� 100�̴�.

���
ù° �ٿ� �Է����� �־��� �ܾ��� ���̸� ����Ѵ�.
*/

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		if(Pattern.matches("^[a-zA-Z]*$", s) && s.length()<=100) {
			System.out.println(s.length());
		}
	}
}
