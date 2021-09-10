package java_github;

import java.util.Scanner;

public class BAEKJOON_1330 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (A>B) {
			System.out.println(">");
		}
		else if (A<B) {
			System.out.println("<");
		}
		else {
			System.out.println("==");
		}		
	}
}