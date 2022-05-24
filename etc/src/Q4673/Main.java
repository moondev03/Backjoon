package Q4673;

public class Main {
	
	private static int d(int n) {
		int sum = n;
		
		while(n != 0) {
			sum += n%10;
			n /= 10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		boolean[] flag = new boolean[10001];
		
		for(int i=1; i<=10000; i++) {
			int n = d(i);
			
			if(n <= 10000) {flag[n] = true;}
		}
		
		for(int i=1; i<=10000; i++) {
			if(!flag[i]) {
				System.out.println(i);
			}
		}
	}
}
