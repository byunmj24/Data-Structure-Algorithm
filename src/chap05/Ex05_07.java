package chap05;

import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.PUSH;

import chap04.IntStack;

// Q7)실습 5-6의 move 메서드를 비재귀적으로 수정하세요.
public class Ex05_07 {
	// no개의 원반을 x번 기둥에서 y번기둥으로 옮김
	static void move(int no, int x, int y) {
		if (no > 1)
			move(no - 1, x, 6 - x - y);
		
		System.out.println("원반[" + no + "]을 " + x + "기둥에서 " + y + "기둥으로 옮김");
		
		if (no > 1)
			move(no - 1, 6 - x - y, y);
	}
	
	// move 메서드 비재귀적 구현 .... 어렵...
	static void moveX(int no, int x, int y) {
		IntStack noStk = new IntStack(no);
		IntStack xStk = new IntStack(no);
		IntStack yStk = new IntStack(no);
		
		while(true) {
			if (no > 1) {
				// 재귀의 제거
				noStk.push(no);
				no = no - 1;
				xStk.push(x);
				yStk.push(y);
				y = 6 - x - y;
				continue;
			}
			
			System.out.println("원반[" + no + "]을 " + x + "기둥에서 " + y + "기둥으로 옮김");
			
			if (no > 1) {
				// 꼬리 재귀의 제거
				no = no - 1;
				x = 6 - x - y;
				continue;
			}
			break;
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.err.println("하노이의 탑");
		System.out.print("원반 개수 : ");
		int n = stdIn.nextInt();
		
		moveX(n, 1, 3);		// 1번 기둥의 n개의 원반을 3번 기둥으로 옮김
		stdIn.close();
	}
}
/* 해설
package chap05;
import java.util.Scanner;
// 하노이의 탑(비재귀적으로 구현)

class HanoiN_05_07 {
	// 원반을 x기둥에서 y기둥으로 옮김
	static void move(int no, int x, int y) {
		int[] xstk = new int[100];
		int[] ystk = new int[100];
		int[] sstk = new int[100]; // 스택
		int ptr = 0; // 스택 포인터
		int sw = 0;

		while (true) {
			if (sw == 0 && no > 1) {
				xstk[ptr] = x; // x의 값을 푸시
				ystk[ptr] = y; // y의 값을 푸시
				sstk[ptr] = sw; // sw의 값을 푸시
				ptr++;
				no = no - 1;
				y = 6 - x - y;
				continue;
			}

			System.out.printf("[%d]를 %d기둥에서 %d기둥으로 옮김\n", no, x, y);

			if (sw == 1 && no > 1) {
				xstk[ptr] = x; // x의 값을 푸시
				ystk[ptr] = y; // y의 값을 푸시
				sstk[ptr] = sw; // sw의 값을 푸시
				ptr++;
				no = no - 1;
				x = 6 - x - y;
				if (++sw == 2)
					sw = 0;
				continue;
			}
			do {
				if (ptr-- == 0) // 스택이 텅 빔
					return;
				x = xstk[ptr]; // 값을 저장하고 있는 x를 팝
				y = ystk[ptr]; // 값을 저장하고 있는 y를 팝
				sw = sstk[ptr] + 1; // 값을 저장하고 있는 sw를 팝
				no++;
			} while (sw == 2);
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("하노이의 탑");
		System.out.print("원반의 갯수：");
		int n = stdIn.nextInt();

		move(n, 1, 3); // 1기둥에 쌓인 n 개를 3기둥에 옮김
	}
}
*/