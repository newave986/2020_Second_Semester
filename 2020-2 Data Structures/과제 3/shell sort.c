#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define MAX_SIZE 200000

inc_insertion_sort(int list[], int first, int last, int gap) {
	int i, j, key;
	for (i = first + gap; i <= last; i = i + gap) {
		key = list[i];
		for (j = i - gap; j >= first && list[j] > key; j = j - gap)
			list[j + gap] = list[j];
		list[j + gap] = key;
	}
}

void shell_sort(int list[], int n) {
	int i, gap;
	for (gap = n / 2; gap > 0; gap = gap / 2) {
		if ((gap % 2) == 0) gap++; 
			for (i = 0; i < gap; i++)
				inc_insertion_sort(list, i, n - 1, gap);
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
	shell_sort(list, n);
	for (i = 0; i < n; i++) printf("%d ", list[i]);
	end = clock();
	double result = (double)(end - start) / CLOCKS_PER_SEC;
	printf("\n\n");
	printf("--------- 쉘 정렬 -------- \n 소요 시간: %lf\n", result);
	return 0;
}

