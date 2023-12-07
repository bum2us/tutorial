package 배열2차원.Q2738;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2738 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		if(n < 1 || n > 100) return;
		int m = Integer.parseInt(st.nextToken());
		if(m < 1 || m > 100) return;
		
		int[][] arrA = new int[n][m];
		int[][] arrB = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				int s = Integer.parseInt(st.nextToken());
				if(Math.abs(s) > 100) return;
				arrA[i][j] = s;
			}
		}
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				int s = Integer.parseInt(st.nextToken());
				if(Math.abs(s) > 100) return;
				arrB[i][j] = s;
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				bw.write(arrA[i][j] + arrB[i][j] + " ");
			}
			bw.write("\n");
		}
		
		br.close();
		bw.close();
	}

}

/*

문제
N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.

입력
첫째 줄에 행렬의 크기 N 과 M이 주어진다. 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다. 이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다. N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.

출력
첫째 줄부터 N개의 줄에 행렬 A와 B를 더한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.

예제 입력 1 
3 3
1 1 1
2 2 2
0 1 0
3 3 3
4 4 4
5 5 100
예제 출력 1 
4 4 4
6 6 6
5 6 100

*/