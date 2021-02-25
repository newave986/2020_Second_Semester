#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define SWAP(x, y, t) ( (t)=(x), (x)=(y), (y)=(t) )
#define MAX_SIZE 200000

void bubble_sort(int list[], int n) {
	int i, j, temp;
	for (i = n - 1; i > 0; i--) {
		for (j = 0; j < i; j++)
			if (list[j] > list[j + 1])
				SWAP(list[j], list[j + 1], temp);
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
	bubble_sort(list, n);
	for (i = 0; i < n; i++) printf("%d ", list[i]);
	end = clock();
	double result = (double)(end - start) / CLOCKS_PER_SEC;
	printf("\n\n");
	printf("--------- 버블 정렬 -------- \n 소요 시간: %lf\n", result);
	return 0;
}
