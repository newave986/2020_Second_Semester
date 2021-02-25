#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX_CHAR_SIZE 10000

typedef char* element;
typedef struct {
	int n[4];
	element name;
} ipadress;

element k[5];
int m = 0;
int num;

void newIP(ipadress *x) {
	for (int l = 0; l < 4; l++) {
		x->n[l] = NULL;
	}
	x->name = NULL;
}

void error(ipadress* x) {
	if (num != 4) {
		printf("잘못된 입력입니다.\n");
		input(&x);
	}
	else;
}

int input(ipadress* x) {
	x->name = (element)malloc(sizeof(char) * MAX_CHAR_SIZE);
	num = scanf("%d.%d.%d.%d", &x->n[0], &x->n[1], &x->n[2], &x->n[3]);
	scanf("%s", x->name);
	if ((x->n[0] == 203) && (x->n[1] == 255)) {
		k[m++] = x->name;
	}
	error(&x);
}

int main(void) {
	ipadress ip;
	printf("IP주소값 별명 5쌍을 입력하세요.\n");
	for (int i = 0; i < 5; i++) {
		newIP(&ip);
		input(&ip);
	}
	printf("이화여자대학교에 속한 주소: \n");
	for (int j = 0; j < 5;  j++) {
		if (k[j] != NULL) {
			printf("%s\n", k[j]);
		}
	}
	free(ip.name);
	return 0;
}