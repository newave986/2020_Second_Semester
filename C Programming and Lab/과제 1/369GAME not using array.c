#include <stdio.h> // 코드에 stdio.h 헤더 파일을 포함한다.

short i, j, clap = 0; // 세 변수 i, j, clap을 선언한다.

int main(void) { // main 함수를 선언한다.

	short A, B; // 두 변수 A, B를 선언한다.
	printf("두 개의 양의 정수 A, B를 입력하세요:\n"); // 정수를 입력하라는 메시지를 출력한다.
	scanf_s("%hd", &A); // 사용자가 입력한 A값을 받는다.
	scanf_s("%hd", &B); // 사용자가 입력한 B값을 받는다.
	if (A > B || A <= 0 || B <= 0) { 
		printf("잘못된 입력입니다.");
	} // 만약 A가 B보다 크거나, A나 B가 0 이하라면 잘못된 입력이라는 메시지를 출력한다.

	else { // A와 B가 양수이고 B가 A보다 크거나 같은 경우에 작동한다.
		for (i = A; i <= B; i++) { // i는 A부터 B까지 작동하며, 루프가 한 번 돌 때마다 i가 1씩 증가한다.
			j = i; // j에 i의 값을 대입한다.
			while (j > 1) { // j가 1보다 클 경우에 while 루프가 동작한다.
				switch (j % 10) {
				case 3: clap += 1; break;
				case 6: clap += 1; break;
				case 9: clap += 1; break;
				default: break;
				} // swith 함수를 이용해 j의 일의  자릿수 값이 3, 6, 9이면 clap 변수가 1 증가한다.
				j /= 10; // j를 10으로 나누고, 그 몫을 j에 저장한다.
			} // j가 1보다 크다면 while문을 다시 실행하고, 그렇지 않으면 while문을 종료하고 다음 실행으로 넘어간다.
			if (clap == 0) {
				printf("%d ", i); // 만약 clap의 값이 0이라면, 숫자에 3/6/9가 단 하나도 있지 않다는 뜻이므로 숫자를 그대로 출력한다.
			} // if문을 닫는다.
			else { // clap의 값이 0이 아니라면,
				while (clap > 0) {
					printf("짝! "); // clap이 0보다 클 때 박수 소리를 출력한다.
					clap -= 1; // 한 번 출력한 후에는 clap 값이 1만큼 감소하며, clap 값이 0이 되었을 때 while문은 종료된다.
				} // while문을 닫는다.
			} // else문을 닫는다.
		} // for문을 닫는다.
	} // else문을 닫는다.

		printf("\n"); // 출력이 모두 끝났다면, 한 줄을 띄워 준다.
		return 0; // 0값을 반환한다.

} // 필요한 모든 실행이 끝났으므로 main 함수를 닫는다.