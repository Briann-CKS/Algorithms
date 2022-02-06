#include <stdio.h>
/* Author's Name: Brian Cheong
 * Description: This program helps users to calculate the sum of the first few integers divisible by 7 (user input) with all the values presented in a formatted manner. 
 * Also, this program outputs a diamond based on the value of dimension entered by the user.
 */

int main()
{
	//Part (a)
	unsigned int K;
	int count;
	int n = 7;
	int sum = 0;
	//Prompting the user to enter the first few integers divisible by 7 to be added.
	printf("Please enter the number of first few integers divisible by 7 to be added: ");
	scanf("%u", &K);
	//Adding the first few integers divisible by 7 and presenting it in a formatted manner.
	printf("%-10s%-23s%-10s\n", "Count", "Number to be added", "Sum");
	for (count = 0; count < K; count++)
	{
		printf("%-10d", count + 1);
		printf("%-23d", n);
		sum += n;
		n += 7;
		printf("%-10d\n", sum);
	}
	printf("The sum of the first %u integers that are divisible by 7 is %d.\n", K, sum);

	//Part (b)
	//Prompting user to input the dimension of a diamond
	printf("Please enter a positive odd integer for the dimension of a diamond (greater than or equal to three): ");
	scanf("%d", &K);

	if ( K < 3 || ( K % 2) == 0)
	{
		printf("Invalid input!\n");
		return 0;
	}	
	
	int i, j;
	int star = 1;
	int star1 = 2;
	int star2 = K / 2;
	int spaces = K / 2;
	int space0 = (K / 2) - 1;
	int space1 = K / 2;
	int space2 = 0;
	int space3 = (K / 2) - 1;
	int space4 = 1;
	int space5 = (K / 2) - 2;

	//Top part of the diamond
	for (j = 0; j < spaces; j++) {
		printf(" ");
	}
	printf("*\n");
	for (i = 0; i < space0; i++)
	{
		for (j = 1; j < space1; j++) {
			printf(" ");
		}
		for (j = 0; j < star1; j++) {
			printf("*");
		}
		for (j = 0; j < space2; j++) {
			printf(" ");
		}
		printf("*\n");
		star1++;
		space1--;
		space2++;
	}

	//Center part of the diamond
	for (i = 0; i < K; i++) {
		printf("*");
	}
	printf("\n");

	//Bottom part of the diamond
	for (i = 0; i < space3; i++)
	{
		for (j = 0; j < space4; j++) {
			printf(" ");
		}
		printf("*");
		for (j = 0; j < space5; j++) {
			printf(" ");
		}
		for (j = 0; j < star2; j++) {
			printf("*");
		}
		space5--;
		space4++;
		star2--;
		printf("\n");
	}
	for (j = 0; j < K / 2; j++) {
		printf(" ");
	}
	printf("*\n");
	return 0;
}
