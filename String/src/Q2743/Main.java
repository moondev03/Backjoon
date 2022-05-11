package Q2743;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
문제_Q2743
알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.

출력
첫째 줄에 입력으로 주어진 단어의 길이를 출력한다.
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
