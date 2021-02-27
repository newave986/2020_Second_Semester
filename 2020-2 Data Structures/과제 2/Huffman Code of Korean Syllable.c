#include <stdio.h>
#include <stdlib.h>
#define MAX_ELEMENT 200
// 헤더 파일 포함, MAX_ELEMENT 정의

typedef struct TreeNode {
	int weight;
	char* ch;
	struct TreeNode* left;
	struct TreeNode* right;
} TreeNode;
//TreeNode Struct 정의

typedef struct {
	TreeNode* ptree;
	char* ch;
	int key;
} element;
// element struct 정의

typedef struct {
	element heap[MAX_ELEMENT];
	int heap_size;
} HeapType;
// HeapType struct 정의

HeapType* create() {
	return (HeapType*)malloc(sizeof(HeapType));
}
// HeapType 생성 함수 정의

void init(HeapType* h) {
	h->heap_size = 0;
}
// HeapType 초기화 함수 정의

void insert_min_heap(HeapType* h, element item)
{
	int i;
	i = ++(h->heap_size);
	while ((i != 1) && (item.key < h->heap[i / 2].key)) {
		h->heap[i] = h->heap[i / 2];
		i /= 2;
	}
	h->heap[i] = item; 
}
// 히프 h에 element item을 삽입하는 함수 정의

element delete_min_heap(HeapType* h)
{
	int parent, child;
	element item, temp;
	item = h->heap[1];
	temp = h->heap[(h->heap_size)--];
	parent = 1;
	child = 2;
	while (child <= h->heap_size) {
		if ((child > h->heap_size) &&
			(h->heap[child].key) > h->heap[child + 1].key)
			child++;
		if (temp.key < h->heap[child].key) break;
		h->heap[parent] = h->heap[child];
		parent = child;
		child *= 2;
	}
	h->heap[parent] = temp;
	return item;
} 
// 삭제 함수 정의

TreeNode* make_tree(TreeNode* left, TreeNode* right) {
	TreeNode* node =
		(TreeNode*)malloc(sizeof(TreeNode));
	node->left = left;
	node->right = right;
	return node;
}
// 이진 트리 생성 함수 정의

void destroy_tree(TreeNode* root) {
	if (root == NULL) return;
	destroy_tree(root->left);
	destroy_tree(root->right);
	free(root);
}
// 이진 트리 제거 함수 정의

int is_leaf(TreeNode* root) {
	return !(root->left) && !(root->right);
}

void print_array(int codes[], int n) {
	for (int i = 0; i < n; i++)
		printf("%d", codes[i]);
	printf("\n");
}

void print_codes(TreeNode* root, int codes[], int top)
{
	if (root->left) {
		codes[top] = 1;
		print_codes(root->left, codes, top + 1);
	}
	if (root->right) {
		codes[top] = 0;
		print_codes(root->right, codes, top + 1);
	}
	if (is_leaf(root)) {
		printf("%s: ", root->ch);
		print_array(codes, top);
	}
}
// 단말노드이면 코드를 출력하는 함수 정의

void huffman_tree(int freq[], char* ch_list[], int n)
{
	int i;
	TreeNode* node, * x;
	HeapType* heap;
	element e, e1, e2;
	int codes[100];
	int top = 0;
	heap = create();
	init(heap);
	for (i = 0; i < n; i++) {
		node = make_tree(NULL, NULL);
		e.ch = node->ch = &ch_list[i];
		e.key = node->weight = freq[i];
		e.ptree = node;
		insert_min_heap(heap, e);
	}
	for (i = 1; i < n; i++) {
		e1 = delete_min_heap(heap);
		e2 = delete_min_heap(heap); 
		x = make_tree(e1.ptree, e2.ptree);
		e.key = x->weight = e1.key + e2.key;
		e.ptree = x;
		insert_min_heap(heap, e);
	}
	e = delete_min_heap(heap); // 최종 트리
	print_codes(e.ptree, codes, top);
	destroy_tree(e.ptree);
	free(heap);
}
// 허프만 코드 생성 함수 정의

int main(void)
{
	char* ch_list[] = {
	"이", "다", "는", "의", "에", "을", "고", "가", "하", "지",
	"로", "한", "그", "은", "서", "기", "어", "도", "나", "를",
	"사", "아", "리", "있", "자", "들", "대", "으", "인", "시",
	"해", "라", "것", "수", "니", "게", "정", "보", "일", "적",
	"만", "부", "주", "과", "제", "면", "었", "전", "여", "상",
	"장", "요", "구", "문", "내", "우", "성", "거", "동", "생",
	"되", "마", "러", "국", "소", "화", "신", "무", "했", "원",
	"스", "오", "야", "위", "경", "말", "와", "조", "없", "모",
	"데", "비", "할", "계", "안", "까", "중", "세", "때", "미",
	"려", "회", "학", "관", "선", "간", "치", "진", "공", "실" };


	int freq[] = {
	314869, 265071, 232384, 172126, 171493, 162579, 152862, 150918, 144051, 133691,
	113920, 113150, 108164, 106129, 103121, 102709, 99943, 88314, 86764, 84774,
	84247, 80043, 78532, 77858, 75346, 69423, 67855, 66390, 64261, 62338, 60136,
	58485, 58386, 58165, 57152, 56945, 54407, 49019, 45932, 45475, 44672,
	43880, 43879, 43685, 43631, 42568, 40355, 39553, 39529, 39345, 37885,
	37391, 36967, 34109, 33964, 33145, 31692, 31282, 31041, 30364, 30317,
	30184, 30051, 29241, 29105, 29068, 28918, 28660, 28176, 27582, 26804,
	26341, 26009, 25964, 25932, 25618, 25168, 25055, 24975, 24764, 24512,
	24266, 23706, 23653, 23152, 23016, 22916, 22764, 22618, 22373, 22040,
	22033, 21990, 21976, 21973, 21939, 21910, 21719, 21307, 21280 };

	huffman_tree(freq, *ch_list, 100);
	return 0;
}
