#include<stdio.h>  
#include<stdlib.h> 
#include<string.h> 
#define MAX_STACK_SIZE 10 

typedef char* element; 

typedef struct {
	element data[MAX_STACK_SIZE];
	int top;
} StackType;

int empty_stack(StackType* s) {	
	if (s->top == -1)
		return 1; // 
	else
		return 0; // 
}

int full_stack(StackType* s) { 
	if (s->top == MAX_STACK_SIZE - 1)
		return 1;
	else
		return 0; 
}

void push_stack(StackType* s, element k) {
	if (full_stack(s))
		return; 
	else {
		s->data[(++(s->top))] = k; 
	} 
}

element pop_stack(StackType* s) { 
	if (empty_stack(s))
		return NULL;
	else {
		element a = s->data[(s->top)--]; 
		return a; 
	}
}

typedef struct {
	StackType sOne;
	StackType sTwo;
} QueueType; 

void init_queue(QueueType* q) { 
	q->sOne.top = -1;
	q->sTwo.top = -1;
} 

void dequeue(QueueType* q) { 
	if (empty_stack(&q->sTwo)) { 
		while (!empty_stack(&(q->sOne))) { 
			push_stack(&(q->sTwo), pop_stack(&q->sOne)); 
		}
	}
	printf("%s\n", pop_stack(&(q->sTwo))); 
}

void enqueue(QueueType* q, element k) { 
	push_stack(&(q->sOne), k); 
}

void print_stack(StackType* s) { 
	if (empty_stack(s));
	else { // 만약 스택 s가 비어 있지 않다면,
		element copy[20]; 
		int j = s->top + 1; 
		for (int k = 0; k < j; k++) {
			strcpy(copy, s->data[k]); 
			printf("%s ", copy);
		} 
	}
	printf("\n"); 
}

void printallstack(QueueType* q) { 
	printf("입력 스택이 가지고 있는 데이터는: ");
	print_stack(&q->sOne);
	printf("출력 스택이 가지고 있는 데이터는: ");
	print_stack(&q->sTwo); 
	printf("\n");
}

int main(void) { 
	QueueType QQQ; 
	init_queue(&QQQ); 
	int n; 
	int k = 0; 
	printf("입력할 데이터의 수는?: ");
	scanf_s("%d", &n); 
	element city; 
	for (int i = 0; i < n; i++) { 
		printf("도시 이름: ");
		city = (element)malloc(sizeof(char) * MAX_STACK_SIZE); 
		scanf("%s", city); 
		enqueue(&QQQ, city); 
		printallstack(&QQQ); 
		if (i > 0 && i % 5 == 0) { 
			dequeue(&QQQ); 
			printallstack(&QQQ); 
			k++; 
		}
	}
	printf("\n");
	for (int i = 0; i < (10 - k); i++) { 
		dequeue(&QQQ); 
		printallstack(&QQQ); 
	}
	free(city); 
	return 0;
}