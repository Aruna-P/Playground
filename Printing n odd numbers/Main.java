#include <stdio.h>
#include <math.h>
int main() {
  	int n;
  	scanf("%d", &n);
  int count = 0;
  for(int i = 1; count < n; i+=2) {
  	printf("%d\n", i);
    count++;
  }

	return 0;
}