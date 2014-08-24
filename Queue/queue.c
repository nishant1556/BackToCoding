/*
 * queue.c
 *
 *  Created on: Aug 23, 2014
 *      Author: nishantdholakia
 */
#include<stdio.h>

#define SIZE 5

struct queue {
	int front;
	int rear;
	int data[10];
}q;

typedef struct queue Q;

void insertQ(Q *q, int data) {
	if(q->rear-q->front >=SIZE) {
		printf("The queue is full and now you can NOT insert in queue");
		return;
	}
	q->data[(q->rear++)%SIZE] = data;
}

int removeQ(Q *q) {
	if(q->front == q->rear) {
		printf("The queue is empty and nothing can be removed from this queue now");
		return -1;
	}

	return q->data[(q->front++)%SIZE];
}

void displayQ(Q *q) {
	if(q->front==q->rear) {
		printf("The queue is empty dude. So don't know what to display");
		return;
	}
	printf("So here is the queue in the correct order");
	for(int i=q->front; i<q->rear; i++)
		printf("\n%d", q->data[i%SIZE]);
}

void clearQ(Q *q) {
	q->front = q->rear = 0;
}

int main () {
	q.front=q.rear = 0;
	int choice, number;
		printf("You have a queue of size 10. You can insert remove show and clear the queue.\n"
				"The choices are 1, 2, 3 and 4 respectively. 5 to exit.");

		scanf("%d" ,&choice);

		while(choice != 5) {
			switch(choice) {
			case 1:
				printf("Enter the number you want to insert to the queue:");
				scanf("%d", &number);
				insertQ(&q, number);
				break;
			case 2:
				number = removeQ(&q);
				printf("The popped value is:%d", number);
				break;
			case 3:
				displayQ(&q);
				break;
			case 4:
				clearQ(&q);
				break;
			case 5:
				break;
			}

			fflush(stdin);
			printf("\nYou have a queue of size 10. You can insert remove show and clear the queue.\n"
					"The choices are 1, 2, 3 and 4 respectively. 5 to exit.");

			scanf("%d" ,&choice);
		}
	return 0;
}

