#include <stdio.h> 

short i, j, clap = 0;  k = 0;
short a[100]; 

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
			k = 0;  
			while (j > 1) { 
				a[k] = j % 10; 
				if (a[k] == 3 || a[k] == 6 || a[k] == 9) { 
					clap += 1;
				}
				j /= 10;  
				k++;
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
			if (k  == 99) { 
				short a[100] = { 0, }; 
				k = 0; 
			}
		} 
	} 

	printf("\n"); 
	return 0; 

} 