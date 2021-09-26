package java_github;

import java.util.Scanner;

public class BAEKJOON_10872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		
		
		if (0<=N && N<=12) {
			
			int pac = 1;
			
			for (int i = 1; i<= N; i++) {
				pac = pac * i;
			}
			System.out.println(pac);
		}		
	}

}

