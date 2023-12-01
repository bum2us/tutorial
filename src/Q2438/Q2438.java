package Q2438;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2438 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		if(1 <= n && n <= 100) {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < i+1; j ++) {
					bw.write("*");
				}
				bw.write("\n");
			}			
		}
		br.close();
		bw.close();
	}

}

/*

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	128 MB	302678	186596	154694	62.297%
문제
첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

출력
첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

예제 입력 1 
5
예제 출력 1 
*
**
***
****
*****

*/