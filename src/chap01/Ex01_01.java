package chap01;

// Q1)네 값의 최댓값을 구하는 amx4 메서드를 작성하세요.
public class Ex01_01 {
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
	public static void main(String[] args) {
		System.out.println("max4(3,2,1,5) = " + max4(3, 2, 1, 5));
		System.out.println("max4(2,3,5,7) = " + max4(2, 3, 5, 7));
		System.out.println("max4(3,2,1,5) = " + max4(3, 2, 1, 5));
	}
}
