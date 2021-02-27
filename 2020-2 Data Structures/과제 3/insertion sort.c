#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define MAX_SIZE 200000

void insertion_sort(int list[], int n) {
	int i, j, key;
	for (i = 1; i < n; i++) {
		key = list[i];
		for (j = i - 1; j >= 0 && list[j] > key; j--)
			list[j + 1] = list[j]; 
		list[j + 1] = key;
	}
}

int main(void) {
	clock_t start, end;
	start = clock();
	int i;
	int n = MAX_SIZE;
	int list[MAX_SIZE];
	srand(time(NULL));
	for (i = 0; i < n; i++) list[i] = rand();
	insertion_sort(list, n);
	for (i = 0; i < n; i++) printf("%d ", list[i]);
	end = clock();
	double result = (double)(end - start) / CLOCKS_PER_SEC;
	printf("\n\n");
	printf("--------- 삽입 정렬 -------- \n 소요 시간: %lf\n", result);
	return 0;
}

