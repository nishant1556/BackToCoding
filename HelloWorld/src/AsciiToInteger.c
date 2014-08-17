/*
 ============================================================================
 Name        : AsciiToInteger.c
 Author      : Nishant Dholakia
 Version     :
 Copyright   : Copy rights Belong to only Me!!!
 Description : Ascii to integer (atoi) in C, Ansi-style.
               Tried not to use an library function.
               So also has a function to calculate power.
 ============================================================================
 */

#include <stdio.h>

int calculatePower(int base, int exponent) {
	if(exponent == 0)
		return 1;
	if(exponent == 1)
		return base;
	return base*(calculatePower(base, exponent-1));
}

int main() {

	char input[100];
	int count = 0;
	int number = 0;
	printf("Enter the string that you want to convert to Integer:");
	scanf("%s", input);

	for(int i=0; input[i]!='\0'; i++) {
		count++;
	}
	count = count -1;

	for(int i=0; input[i]!='\0'; i++) {
		int multiple = calculatePower(10, count);
        number+= (input[i] - 48)*multiple;
			count--;
		}
	printf("The resulting integer is:%d", number);
	return 0;
}

