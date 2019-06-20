#include <stdio.h>
#include <math.h>
int main() {
  int n;
  scanf("%d", &n);
  
  int x = pow((n%10), 3) + pow((n%100)/10, 3) + pow(n/100, 3);
  
  if(x == n) {
    printf("Armstrong Number");
  } else {
  printf("Not an Armstrong Number");}
	//Type your code
	return 0;
}