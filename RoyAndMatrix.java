package basicmaths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoyAndMatrix {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		while(testCase!=0) {
			int input = Integer.parseInt(br.readLine());
			long sum=0;
			for (int i = 0; i < input; i++) {
				sum = sum + (sum(i) + sum(input-i-1));
			}
			System.out.println(sum);
			testCase--;
		}
	}
	private static long sum(long range) {
		// sum of digits from 0 to n is n*(n+1)/2
		return ((range*(range+1))/2);
	}
}
