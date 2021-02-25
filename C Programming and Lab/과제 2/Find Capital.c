#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX_SIZE_CHAR 10000

typedef char* element;
int i = 0;
int j = 0;

int find_caps(element caps, const element str);
int find_caps(element caps, const element str) {
	char temp = NULL;
	if (i == strlen(str)) {
		return;
	}
	else {
		if (str[i] >= 65 && str[i] <= 90) {
			temp = str[i++];
			caps[j++] = temp;
			find_caps(caps, str);
		}
		else {
			i++;
			find_caps(caps, str);
		}
	}
}

int main(void) {
	element str = (element)malloc(sizeof(char) * MAX_SIZE_CHAR);
	element caps = (element)malloc(sizeof(char) * MAX_SIZE_CHAR);
	memset(caps, NULL, MAX_SIZE_CHAR);
	printf("���ڿ��� �Է��ϼ���.\n");
	scanf("%s", str);
	find_caps(caps, str);
	if (caps[0] == NULL) printf("%s���� �빮�ڴ� �����ϴ�.\n", str);
	else printf("%s���� �빮�ڴ� %s�Դϴ�.\n", str, caps);
	free(str);
	free(caps);
	return 0;
}