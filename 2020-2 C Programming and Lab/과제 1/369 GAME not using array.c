#include <stdio.h> 

short i, j, clap = 0; 

int main(void) { 

	short A, B; 
	printf("�� ���� ���� ���� A, B�� �Է��ϼ���:\n"); 
	scanf_s("%hd", &A); 
	scanf_s("%hd", &B); 
	if (A > B || A <= 0 || B <= 0) { 
		printf("�߸��� �Է��Դϴ�.");
	} 

	else { 
		for (i = A; i <= B; i++) { 
			j = i; 
			while (j > 1) { 
				switch (j % 10) {
				case 3: clap += 1; break;
				case 6: clap += 1; break;
				case 9: clap += 1; break;
				default: break;
				} 
				j /= 10; 
			}
			if (clap == 0) {
				printf("%d ", i); 
			} 
			else { 
				while (clap > 0) {
					printf("¦! "); 
					clap -= 1; 
				} 
			} 
		} 
	} 

		printf("\n"); 
		return 0; 

} 