package java_github;

import java.util.Scanner;

public class BAEKJOON_10952 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A, B;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			A = sc.nextInt();
			B = sc.nextInt();
		
			if (A==0 && B==0) {
				sc.close();
				break;
			}
			System.out.println(A + B);	
		}
	}
}
