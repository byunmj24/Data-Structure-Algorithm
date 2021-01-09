package chap05;

// Q9)8퀸 문제를 비재귀적으로 구현한 프로그램을 작성하세요.
public class Ex05_09 {
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
	
	// i열의 알맞은 위치에 퀸을 배치
	static void set(int i) {
		for (int j = 0; j < 8; j++) {
			if (flag_a[j] == false &&			// 가로(j행)에 아직 배치하지 않았습니다.
				flag_b[i + j] == false &&		// 대각선 /에 아직 배치하지 않았습니다.
				flag_c[i - j + 7] == false) {	// 대각선 \에 아직 배치하지 않았습니다.
				pos[i] = j;						// 퀸을 j행에 배치합니다.
				if (i == 7)						// 모든 열에 배치했다면
					print();
				else {
					flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
					set(i + 1);
					flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = false;
				}
			}
		}
	}
	
	// 8퀸 문제 비재귀적으로 표현
	static void setX(int i) {
		int j;
		int[] jstk = new int[8];
		
		Start: while (true) {
			j = 0;
			while (true) {
				while (j < 8) {
					if (!flag_a[j] && !flag_b[i + j] && !flag_c[i - j + 7]) {
						pos[i] = j;
						if (i == 7)	// 모든 열에 배치 마침
							print();
						else {
							flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
							jstk[i++] = j;	// i 열의 행을 Push
							continue Start;
						}
					}
					j++;
				}
				if (--i == -1)
					return;
				j = jstk[i];	// i열의 행을 Pop
				flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = false;
				j++;
			}
		}
	}
	
	
	public static void main(String[] args) {
		set(0);
	}
}
