/* Program to determine if a number is even or odd */

#include <stdio.h>

int main(void) {

  int n;  // declaring the required variable

  // taking input from the user
  printf("Enter an integer: ");  
  scanf("%d", &n);  // storing the user input in the variable
  
  // checking whether the entered number gives 0 remainder when it is divided by 2
  if (n % 2 == 0) {  
    printf("%d is an even number!\n", n);
  } 
  else {
    printf("%d is an odd number!\n", n);
  }
   
  return 0;  // end of main function
}
