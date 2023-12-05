package 문자열.Q27866;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q27866 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		if(input.length() > 1000) return;
		
		int i = Integer.parseInt(br.readLine());
		
		if(i < 1 || i > input.length()) return;
		
		bw.write(input.toCharArray()[i-1]);
		
		br.close();
		bw.close();
	}

}

/*

문제
단어 
$S$와 정수 
$i$가 주어졌을 때, 
$S$의 
$i$번째 글자를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 영어 소문자와 대문자로만 이루어진 단어 
$S$가 주어진다. 단어의 길이는 최대 
$1\,000$이다.

둘째 줄에 정수 
$i$가 주어진다. (
$1 \le i \le \left|S\right|$)

출력
 
$S$의 
$i$번째 글자를 출력한다.

예제 입력 1 
Sprout
3
예제 출력 1 
r
예제 입력 2 
shiftpsh
6
예제 출력 2 
p
예제 입력 3 
Baekjoon
4
예제 출력 3 
k

*/