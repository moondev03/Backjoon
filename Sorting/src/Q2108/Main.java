package Q2108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * Q2108 - 통계학
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		// 산술평균
		int sum = 0;
		for(int i=0; i<N; i++) {
			sum += arr[i];
		}
		System.out.println("산술: "+Math.round((float)sum/N));
		
		// 중앙값
		Arrays.sort(arr);
		System.out.println("중앙: "+arr[N/2]);
		
		// 최빈값
		Map<Integer, Integer> mp = new HashMap<>();

		for (int i = 0; i < N; i++) {
			if (mp.containsKey(arr[i])) {
				mp.put(arr[i], mp.get(arr[i]) + 1);
			} else {
				mp.put(arr[i], 1);
			}
		}
		int maxValue = Collections.max(mp.values());
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		// 가장 많이 나온 값
		for (Map.Entry<Integer, Integer> m : mp.entrySet()) {
			if (m.getValue() == maxValue) {
				arrayList.add(m.getKey());
			}
		}
		
		Collections.sort(arrayList);
		// 가장 많이 나온 값이 여러개일 경우 두번째로 작은 값
		if (arrayList.size() > 1)
			System.out.println("최빈: "+arrayList.get(1));
		else // 가장 많이 나온 값이 하나면
			System.out.println("최빈1: "+arrayList.get(0));
		
		// 범위
		int max = arr[arr.length-1];
		int min = arr[0];
		System.out.println("범위: "+ (max-min));
		
	}
}
