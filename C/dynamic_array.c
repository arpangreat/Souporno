/*
 * when we try to create an array with dynamic values
 */

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main() {
  // dataType arrayName[number of values] = {values} - Static Array / 1D

  int *arr;
  int n, i;

  printf("Enter the num of size: ");
  scanf("%d", &n);

  arr = (int *)malloc(n * sizeof(int));

  return 0;
}
