/*
 * stack.c
 *
 *  Created on: Aug 23, 2014
 *      Author: nishantdholakia
 */

#include<stdio.h>

struct Stack {
	int top;
	int data[10];
};

typedef struct Stack Stack;

void push(Stack *s, int value) {
	if(s->top==9) {
		printf("The stack is full and no value can be inserted in the stack now");
		return;
	}

	s->data[++s->top] = value;
}

int pop(Stack *s) {
	if(s->top == -1) {
		printf("The stack is empty");
		return -1;
	}

	return s->data[s->top--];
}

void display(Stack *s) {
	if(s->top == -1) {
		printf("The stack is empty");
		return;
	}
	printf("The stack elements in the proper order are as follows:");
	for(int i=0; i<s->top; i++)  {
		printf("%d\n", s->data[i]);
	}
}

void clearStack(Stack *s) {
    s->top = 0;
    printf("The stack is now empty");
}

int main() {
	Stack s;
	s.top = -1;
	int choice, number;
	printf("You have a stack of size 10. You can push pop show and clear the stack.\n"
			"The choices are 1, 2, 3 and 4 respectively. 5 to exit.");

	scanf("%d" ,&choice);

	while(choice != 5) {
		switch(choice) {
		case 1:
			printf("Enter the number you want to push to the stack:");
			scanf("%d", &number);
			push(&s, number);
			break;
		case 2:
			number = pop(&s);
			printf("The popped value is:%d", number);
			break;
		case 3:
			display(&s);
			break;
		case 4:
			clearStack(&s);
			break;
		case 5:
			break;
		}

		fflush(stdin);
		printf("You have a stack of size 10. You can push pop show and clear the stack.\n"
				"The choices are 1, 2, 3 and 4 respectively. 5 to exit.");

		scanf("%d" ,&choice);
	}

	return 0;
}
