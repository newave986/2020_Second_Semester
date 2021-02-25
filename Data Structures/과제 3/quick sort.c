#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define MAX_SIZE 200000
#define SWAP(x, y, t) ( (t)=(x), (x)=(y), (y)=(t) )

int partition(int list[], int left, int right) {
	int pivot, temp;
	int low, high;
	low = left;
	high = right + 1;
	pivot = list[left];
	do {
		do
			low++;
		while (low <= right && list[low] < pivot);
		do
			high--;
		while (high >= left && list[high] > pivot);
		if (low < high) SWAP(list[low], list[high], temp);
	} while (low < high);
	SWAP(list[left], list[high], temp);
	return high;
}

void quick_sort(int list[], int left, int right) {
	if (left < right) {
		int q = partition(list, left, right);
		quick_sort(list, left, q - 1);
		quick_sort(list, q + 1, right);
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
	quick_sort(list, 0, n - 1);
	for (i = 0; i < n; i++) printf("%d ", list[i]);

	end = clock();
	double result = (double)(end - start) / CLOCKS_PER_SEC;
	printf("\n\n");
	printf("--------- 퀵 정렬 -------- \n 소요 시간: %lf\n", result);
	return 0;
}

