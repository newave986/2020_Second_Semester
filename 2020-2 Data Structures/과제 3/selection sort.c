#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define SWAP(x, y, t) ( (t)=(x), (x)=(y), (y)=(t) )
#define MAX_SIZE 200000

void selection_sort(int list[], int n) {
	int i, j, least, temp;
	for (i = 0; i < n - 1; i++) {
		least = i;
		for (j = i + 1; j < n; j++) 
			if (list[j] < list[least]) least = j;
		SWAP(list[i], list[least], temp);
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
	selection_sort(list, n);
	for (i = 0; i < n; i++) printf("%d ", list[i]);
	end = clock();
	double result = (double)(end - start)/CLOCKS_PER_SEC;
	printf("\n\n");
	printf("--------- 선택 정렬 -------- \n소요 시간: %lf\n", result);
	return 0;
}