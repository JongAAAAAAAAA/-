package java_github;
import java.util.Scanner;

public class BAEKJOON_18258 {
	
	public static int Queue[];
	public static int size = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		Queue = new int[N];

		
		for (int i =0; i<N; i++) {
			
			String str = sc.next();
			
			switch(str) {
		
			case "push":
				push(sc.nextInt());
				break;
			
			case "pop":
				sb.append(pop()).append('\n');
				break;
			
			case "size":
				sb.append(size()).append('\n');
				break;
			
			case "empty":
				sb.append(empty()).append('\n');
				break;
			
			case "front":
				sb.append(front()).append('\n');
				break;
			
			case "back":
				sb.append(back()).append('\n');
				break;
			}
		
		}
		System.out.println(sb);
	}
	
	public static void push(int X) {
		Queue[size] = X;
		size++;
	}
	
	public static int pop(){
		if(Queue[size] != 0) {
			int res = Queue[size-1];
			Queue[size-1] = 0;
			size--;
			return res;
		}
		else
			return -1;
	}
	
	public static int size() {
		return size;
	}
	
	public static int empty() {
		if (size == 0)
			return 1;
		else
			return 0;
	}
	
	public static int front() {
		if(size != 0) {
			return Queue[0];
		}
		else
			return -1;
	}
	
	public static int back() {
		if(size != 0) {
			return Queue[size-1];
		}
		else
			return -1;
	}
}

