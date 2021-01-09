package chap05;

// Q8)실습 5-9의 print 메서드를 수정하여 전각 기호 '■'와 '□'를 사용해 퀸의 배치 상황을 출력하세요.
public class Ex05_08 {
	static boolean[] flag_a = new boolean[8];	// 각 행에 퀸을 배치했는지 체크
	static boolean[] flag_b = new boolean[15];	// / 대각선 방향으로 퀸을 배치했는지 체크
	static boolean[] flag_c = new boolean[15];	// \ 대각선 방향으로 퀸을 배치했는지 체크
	static int[] pos = new int[8];				// 각 열의 퀸의 위치
	
	// 각 열의 퀸의 위치를 출력
	static void print() {
		for (int i = 0; i < 8; i++)
			System.out.printf("%2d", pos[i]);
		System.out.println();
	}
	
	static void printX() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (i == pos[j]) {
					System.out.print("■");
				} else {
					System.out.print("□");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	// i열의 알맞은 위치에 퀸을 배치
	static void set(int i) {
		for (int j = 0; j < 8; j++) {
			if (flag_a[j] == false &&			// 가로(j행)에 아직 배치하지 않았습니다.
				flag_b[i + j] == false &&		// 대각선 /에 아직 배치하지 않았습니다.
				flag_c[i - j + 7] == false) {	// 대각선 \에 아직 배치하지 않았습니다.
				pos[i] = j;						// 퀸을 j행에 배치합니다.
				if (i == 7)						// 모든 열에 배치했다면
					printX();
				else {
					flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
					set(i + 1);
					flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = false;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		set(0);
	}
}
/* 해설
package chap05;
// 8퀸 문제를 풀이합니다 (체스판을 □와 ■로 나타냄)

class EightQueenEx_05_08 {
	static boolean[] flag_a = new boolean[8]; // 각 행에 퀸이 이미 배치되어 있는가?
	static boolean[] flag_b = new boolean[15]; // ／대각선에 퀸이 이미 배치되어 있는가?
	static boolean[] flag_c = new boolean[15]; // ＼대각선에 퀸이 이미 배치되어 있는가?
	static int[] pos = new int[8]; // 각 열의 퀸의 위치

	// 체스판 (각 열의 퀸의 위치)을 출력
	static void print() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++)
				System.out.printf("%s", j == pos[i] ? "■" : "□");
			System.out.println();
		}
		System.out.println();
	}

	// i 열의 알맞은 위치에 퀸을 배치
	static void set(int i) {
		for (int j = 0; j < 8; j++) {
			if (flag_a[j] == false && // 가로(j행)에 미배치
					flag_b[i + j] == false && // ／대각선에 미배치
					flag_c[i - j + 7] == false) { // ＼대각선에 미배치
				pos[i] = j; // 퀸을 j행에 배치
				if (i == 7) // 모든 열에 배치 마침
					print();
				else {
					flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
					set(i + 1);
					flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		set(0);
	}
}
*/