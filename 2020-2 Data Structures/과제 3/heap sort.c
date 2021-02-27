#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define MAX_SIZE 200000

typedef struct {
	int key;
} element;
typedef struct {
	element heap[MAX_SIZE+5];
	int heap_size;
} HeapType;

HeapType* create() {
	return (HeapType*)malloc(sizeof(HeapType));
}

void init(HeapType* h) {
	h->heap_size = 0;
}

void insert_max_heap(HeapType* h, element item) {
	int i;
	i = ++(h->heap_size);
	while ((i != 1) && (item.key > h->heap[i / 2].key)) {
		h->heap[i] = h->heap[i / 2];
		i /= 2;
	}
	h->heap[i] = item;
}

element delete_max_heap(HeapType* h) {
	int parent, child;
	element item, temp;
	item = h->heap[1];
	temp = h->heap[(h->heap_size)--];
	parent = 1;
	child = 2;
	while (child <= h->heap_size) {
		if ((child < h->heap_size) &&
			(h->heap[child].key) < h->heap[child + 1].key)
			child++;
		if (temp.key >= h->heap[child].key) break;
		h->heap[parent] = h->heap[child];
		parent = child;
		child *= 2;
	}
	h->heap[parent] = temp;
	return item;
}

void heap_sort(element a[], int n) {
	int i;
	HeapType* h;
	h = create();
	init(h);
	for (i = 0; i < n; i++) {
		insert_max_heap(h, a[i]);
	}
	for (i = (n - 1); i >= 0; i--) {
		a[i] = delete_max_heap(h);
	}
	free(h);
}

int main(void) {
	clock_t start, end;
	start = clock();
	int i;
	int n = MAX_SIZE;
	element list[MAX_SIZE];
	srand(time(NULL));
	for (i = 0; i < n; i++)
		list[i].key = rand();
	heap_sort(list, MAX_SIZE);
	for (i = 0; i < n; i++) printf("%d ", list[i]);

	end = clock();
	double result = (double)(end - start) / CLOCKS_PER_SEC;
	printf("\n\n");
	printf("--------- 히프 정렬 -------- \n 소요 시간: %lf\n", result);
	return 0;
}

