package Q10818;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q10818 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		if(n < 1 || n > 1000000) return;
		int[] arr = new int[n];
		
		String[] splitInput = br.readLine().split(" ");
		
		for(int i = 0 ; i < n; i++) {
			int a = Integer.parseInt(splitInput[i]);
			if(a < -1000000 || a > 1000000) return;
			arr[i] = a;
		}
		bw.write(Arrays.stream(arr).min().getAsInt() + " ");
		bw.write(Arrays.stream(arr).max().getAsInt() + "");
		
		br.close();
		bw.close();
	}

}

/*

문제
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

출력
첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.

예제 입력 1 
5
20 10 35 30 7
예제 출력 1 
7 35

*/