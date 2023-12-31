package 반복문.Q10951;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q10951 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Boolean isPrint = true;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			try {
					
				StringTokenizer st = new StringTokenizer(br.readLine());			
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());	
				
				if( 1 > a || 9 < b) {
					isPrint = false;
					break;
				}
				
				bw.write(a+b+"\n");
				
			} catch (Exception e) {
				// TODO: handle exception				
				break;
			}
		}	
		
		br.close();
		if(isPrint)
			bw.close();
	}

}

/*

문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
입력은 여러 개의 테스트 케이스로 이루어져 있다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

입력의 마지막에는 0 두 개가 들어온다.

출력
각 테스트 케이스마다 A+B를 출력한다.

예제 입력 1 
1 1
2 3
3 4
9 8
5 2
0 0
예제 출력 1 
2
5
7
17
7

*/