package java_github;

import java.util.Scanner;

public class BAEKJOON_1003 {
	static Integer[][] cnt = new Integer[41][2];
	
	static Integer[] fibonacci(int N) {
		if (cnt[N][0] == null || cnt[N][1] == null) {
			cnt[N][0] = fibonacci(N-1)[0] + fibonacci(N-2)[0];
			cnt[N][1] = fibonacci(N-1)[1] + fibonacci(N-2)[1];
		}
		return cnt[N];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		cnt[0][0]=1;
		cnt[0][1]=0;
		cnt[1][0]=0;
		cnt[1][1]=1;
		
		int T = sc.nextInt();
		
		while(T-- > 0){
			int N = sc.nextInt();
			fibonacci(N);
			System.out.println(cnt[N][0] + " " + cnt[N][1]);
		}
	}
}

