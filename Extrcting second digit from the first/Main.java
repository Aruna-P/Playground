#include <stdio.h>
#include <math.h>
int main() {
  	int n;
  	scanf("%d", &n);
  int digits = 0;
  int m = n;
  while(n > 0) {
    digits ++;
     n = n / 10;
  }
  int secondDigit = m / pow(10, digits-2);
  secondDigit = secondDigit % 10;
  printf("%d", secondDigit);
	return 0;
}