package 미분류.Q11382;

import java.util.Scanner;

public class Q11382 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		String[] splitInput = input.split(" ");	
		Long a,b,c;
		
			a = Long.parseLong(splitInput[0]);
			b = Long.parseLong(splitInput[1]);
			c = Long.parseLong(splitInput[2]);
			
			if(a >= 1 || c <= Math.pow(10, 12)) {
				System.out.println(a+b+c);
			}
	}

}
