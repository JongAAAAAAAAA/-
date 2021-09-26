package java_github;

import java.util.Scanner;

public class BAEKJOON_11047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] arr = new int[N];
		int cnt = 0;
		
		for (int i = 0; i<N; i++)
			arr[i] = sc.nextInt();
		
		for (int i = N-1; i>=0; i--) {
			if(arr[i]<=K) {
				cnt += (K/arr[i]);
				K = K % arr[i];
			}
		}
		System.out.println(cnt);
	}

}

