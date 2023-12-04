package 반복문.Q8393;

import java.util.Scanner;

public class Q8393 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,result=0;
		Scanner sc = new Scanner(System.in);
		n = Integer.parseInt(sc.nextLine());
		
		if(1 <= n && n <= 10000) {
			for(int i = 1; i<=n; i++) {
				result += i;
			}
			
			System.out.println(result);
		}
	}

}
/*

문제
n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.

출력
1부터 n까지 합을 출력한다.

예제 입력 1 
3
예제 출력 1 
6
*/