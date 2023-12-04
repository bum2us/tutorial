package 반복문.Q2439;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2439 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		if(1 <= n && n <= 100) {
			for(int i = 1; i < n+1; i++) {
				for(int j = 1; j <= n; j ++) {
					String txt = (n-i) >= j ? " " : "*"; 
					bw.write(txt);
				}
				bw.write("\n");
			}			
		}
		br.close();
		bw.close();
	}

}

/*

문제
첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.

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
