package chap01;

// Q2)세 값의 최솟값을 구하는 min3 메서드를 작성하세요.
public class Ex01_02 {
	static int min3(int a, int b, int c) {
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		
		return min;
	}
	public static void main(String[] args) {
			System.out.println("min3(3,2,1) = " + min3(3, 2, 1));
			System.out.println("min3(2,3,5) = " + min3(2, 3, 5));
			System.out.println("min3(2,1,5) = " + min3(2, 1, 5));
	}
}
