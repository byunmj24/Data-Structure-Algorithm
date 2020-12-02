package chap01;

public class Ex1 {
	
	// Q1)네 값의 최댓값을 구하는 amx4 메서드를 작성하세요.
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		if (d > max)
			max = d;
		
		return max;
	}
	
	// Q2)세 값의 최솟값을 구하는 min3 메서드를 작성하세요.
	static int min3(int a, int b, int c) {
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		
		return min;
	}
	
	// Q3)네 값의 최솟값을 구하는 min4 메서드를 작성하세요.
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		if (d < min)
			min = d;
		
		return min;
	}
	
	public static void main(String[] args) {
		System.out.println("max4(3,2,1,5) = " + max4(3, 2, 1, 5));
		System.out.println("min3(2,3,5) = " + min3(2, 3, 5));
		System.out.println("min4(3,2,1,5) = " + min4(3, 2, 1, 5));
	}
}
