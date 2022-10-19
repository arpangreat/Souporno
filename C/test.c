#include <stdio.h>

void Array(int *arr, int n);

int main() {
  int arr[] = {1, 3, 342, 34, 712, 83};
  Array(arr, 6);
  return 0;
}
void Array(int *arr, int n) {
  for (int i = 0; i < n; i++) {
    printf("%d\n", arr[i]);
  }
}
