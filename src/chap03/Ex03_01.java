package chap03;

import java.util.Scanner;

// Q1)실습 3-3의 seqSearchSen 메서드를 while문이 아니라 for문을 사용하여 수정한 프로그램을 작성하세요.
public class Ex03_01 {
	// 요솟수가 n인 배열 a에서 key와 같은 요소를 보초법으로 선형 검색합니다.
		static int seqSearchSen(int[] a, int n, int key) {
			int i = 0;
			
			a[n] = key;				// 보초를 추가
			
			while(true) {
				if(a[i] == key)		// 검색 성공!
					break;
				i++;
			}
			return i == n ? -1 : i;
		}
		
		static int seqSearchSenFor(int[] a, int n, int key) {
			int num = 0;
			a[n] = key;
			
			for(int i = 0; i < n; i++) {
				if(a[i] == key)
					num = i;
			}
			
			return num == n ? -1 : num;
		}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = stdIn.nextInt();
		int[] x = new int[num + 1];				// 요솟수 num + 1
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
			
		System.out.print("검색할 값 : ");			// 키 값을 입력
		int ky = stdIn.nextInt();
		
		int idx = seqSearchSenFor(x, num, ky);		// 배열 x에서 키 값이 ky인 요소를 검색
		
		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
		
		stdIn.close();
	}
}
/* 해설
package chap03;
import java.util.Scanner;
// 선형 검색(보초법：for문을 사용하여 구현)

class SeqSearchSenFor_03_01 {
	// 배열 a의 앞쪽 n개 요소에서 key와 같은 요소를 선형 검색(보초법)
	static int seqSearchSen(int[] a, int n, int key) {
		int i;

		a[n] = key; // 보초를 추가

		for (i = 0; a[i] != key; i++)
			;
		return i == n ? -1 : i;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("요솟수：");
		int num = stdIn.nextInt();
		int[] x = new int[num + 1]; // 요솟수 num + 1인 배열

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}

		System.out.print("찾는 값："); // 키 값을 입력 받음
		int ky = stdIn.nextInt();

		int idx = seqSearchSen(x, num, ky); // 배열 x에서 값이 ky인 요소를 검색

		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");
	}
}
*/