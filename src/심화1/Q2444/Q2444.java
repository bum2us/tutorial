package 심화1.Q2444;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2444 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		if(n < 1 || n > 100) return;
		
		int max = n*2-1;
		
		for(int i = 0; i < n*2-1; i++) {
			int space = n-1 < i ? -(n-(i+1)) : n-(i+1);
			for(int j = 0; j < max; j++) {
				if(max - space -1 < j)
					continue;
				else if(space <= j)
					bw.write("*");
				else
					bw.write(" ");
			}
			bw.write("\n");
		}
		br.close();
		bw.close();
	}

}

/*

문제
예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

출력
첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.

예제 입력 1 
5
예제 출력 1 
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/