#include <stdio.h> 
#define MAX_STACK_SIZE 1000 
#define MAZE_SIZE 15 

typedef struct {
	short r;
	short c;
} Element; 

typedef struct {
	Element data[MAX_STACK_SIZE];
	int top;
} StackType;

void init_stack(StackType* s) { 
	s->top = -1; 
}

int IsEmpty(StackType* s) { 
	if (s->top == -1)
		return 1;
	else
		return 0; 
}

int IsFull(StackType* s) {
	if (s->top == MAX_STACK_SIZE - 1)
		return 1; 
	else
		return 0; 
}

void Push(StackType* s, Element k) {
	if (IsFull(s)); 
	else s->data[++(s->top)] = k;
}

Element Pop(StackType* s) { 
	if (IsEmpty(s)) {
		return; 
	} 
	else {
		return s->data[(s->top)--];
	} 
}

Element here = { 1, 0 }; 
Element entry = { 1, 0 }; 

char maze[MAZE_SIZE + 2][MAZE_SIZE + 2] = {
	{'1','1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'},
	{'1','e', '0', '2', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1','1'},
	{'1','1', '0', '1', '1', '1', '2', '1', '1', '1', '1', '2', '0', '0', '0', '3','1'},
	{'1','1', '0', '1', '0', '0', '0', '0', '1', '3', '1', '1', '1', '0', '1', '1','1'},
	{'1','1', '0', '0', '0', '2', '1', '1', '0', '0', '1', '1', '1', '0', '1', '2','1'},
	{'1','1', '0', '1', '0', '1', '1', '1', '0', '0', '0', '0', '0', '0', '0', '0','1'},
	{'1','1', '3', '1', '0', '2', '0', '1', '0', '1', '1', '0', '1', '0', '1', '1','1'},
	{'1','0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '2', '0', '1', '1','1'},
	{'1','2', '1', '1', '1', '1', '2', '1', '1', '1', '0', '0', '0', '0', '0', '0','1'},
	{'1','1', '1', '1', '1', '1', '1', '1', '0', '0', '0', '1', '1', '1', '1', '3','1'},
	{'1','1', '1', '1', '1', '1', '3', '1', '0', '1', '0', '0', '1', '1', '1', '1','1'},
	{'1','1', '1', '1', '1', '1', '0', '0', '0', '1', '0', '1', '1', '1', '1', '1','1'},
	{'1','1', '1', '1', '1', '1', '3', '0', '1', '1', '0', '3', '1', '1', '1', '2','1'},
	{'1','1', '3', '1', '1', '1', '1', '0', '1', '2', '0', '1', '0', '0', '0', '0','1'},
	{'1','0', '0', '0', '0', '0', '0', '0', '1', '1', '0', '1', '3', '1', '1', '1','1'},
	{'1','1', '1', '1', '1', '1', '1', '1', '1', '1', '0', '0', '0', '0', '0', 'x','1'},
	{'1','1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1','1'}
}; 

void push_loc(StackType* s, int r, int c) { 
	if (r < 0 || c < 0) return;
	if (maze[r][c] != '1' && maze[r][c] != '.') { 
		Element tmp; 
		tmp.r = r; 
		tmp.c = c; 
		Push(s, tmp); 
	}
}

void maze_print(char maze[MAZE_SIZE + 2][MAZE_SIZE + 2]) { 
	printf("\n");
	for (int r = 1; r < MAZE_SIZE + 1; r++) { 
		for (int c = 1; c < MAZE_SIZE + 1; c++) {
			printf("%c", maze[r][c]); 
		}
		printf("\n");
	}
}

int main(void) { 
	StackType s; 
	int r, c;
	int t = 0, w = 0; 

	init_stack(&s); 
	here = entry; 

	while (maze[here.r][here.c] != 'x') { 
		r = here.r; 
		c = here.c;
		if (maze[r][c] == '2') { 
			t += 1; 
		}
		else if (maze[r][c] == '3') { 
			w += 1; 
		}
		maze[r][c] = '.'; 
		maze_print(maze); 
		push_loc(&s, r - 1, c);
		push_loc(&s, r + 1, c);
		push_loc(&s, r, c - 1); 
		push_loc(&s, r, c + 1);

		if (IsEmpty(&s)) { 
			printf("실패\n"); 
			return;
		}
		else {
			here = Pop(&s); 
		}
	}
	printf("성공!\n"); 
	printf("취득한 보물의 갯수는: %d\n이동 중 만난 함정의 갯수는: %d\n총 보물 점수는: %d\n", t, w, t - w);

	return 0; 
}