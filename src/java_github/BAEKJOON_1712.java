package java_github;

import java.util.Scanner;

public class BAEKJOON_1712 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A, B, C;
		
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		if(C>B)
			System.out.println(A/(C-B)+1);
		
		else
			System.out.println("-1");
	}
}