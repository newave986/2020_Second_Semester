#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define MAX_SIZE 200000

typedef int element; 
typedef struct QueueNode { 
	element data;
	struct QueueNode* link;
} QueueNode;
typedef struct { 
	QueueNode* front, * rear;
	int count;
} LinkedQueueType;

void InitQueue(LinkedQueueType* queue) {
	queue->front = queue->rear = NULL; 
	queue->count = 0;
}

int IsEmpty(LinkedQueueType* queue) {
	return queue->count == 0;
}

void enqueue(LinkedQueueType* q, element data){
	QueueNode* temp = (QueueNode*)malloc(sizeof(QueueNode));
	temp->data = data; 
	temp->link = NULL; 
	if (IsEmpty(q)) { 
		q->front = temp;
		q->rear = temp;
	}
	else { 
		q->rear->link = temp; 
		q->rear = temp;
	}
}

element dequeue(LinkedQueueType* q){
	QueueNode* temp = q->front;
	element data;
	if (IsEmpty(q)) {
		fprintf(stderr, "스택이 비어있음\n");
		exit(1);
	}
	else {
		data = temp->data; 
		q->front = q->front->link; 
		if (q->front == NULL)
			q->rear = NULL;
		free(temp); 
		return data; 
	}
}

#define BUCKETS 10 
#define DIGITS 6

void radix_sort(int list[], int n){
	int i, b, d, factor = 1;
	LinkedQueueType queues[BUCKETS];
	for (b = 0; b < BUCKETS; b++) InitQueue(&queues[b]); 
	for (d = 0; d < DIGITS; d++) {
		for (i = 0; i < n; i++) {
			enqueue(&queues[(list[i] / factor)%10], list[i]);
		}
		for (b = i = 0; b < BUCKETS; b++) 
			while( !IsEmpty(&queues[b]) )
				list[i++] = dequeue(&queues[b]);
		factor *= 10;  
	}
}

int main(void) {
	clock_t start, end;
	start = clock();
	int list[MAX_SIZE];
	srand(time(NULL));
	for (int i = 0; i < MAX_SIZE; i++) 
		list[i] = rand();
	radix_sort(list, MAX_SIZE); 
	for (int i = 0; i < MAX_SIZE; i++)
		printf("%d ", list[i]);
	printf("\n");
	end = clock();
	double result = (double)(end - start) / CLOCKS_PER_SEC;
	printf("\n\n");
	printf("--------- 래딕스 정렬-------- \n 소요 시간 : % lf\n", result);
	return 0;
}

