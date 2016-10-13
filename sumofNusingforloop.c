#include<stdio.h>
int main() {
int n,i,sum=0,value;
printf("Enter the number of integers to be added: ");
scanf("%d",&n);
printf("\n Enter any %d integers: \n",n);
for(i=1;i<=n;i++) {
scanf("%d",&value);
sum=sum+value; }
printf("\nThe result is %d",sum);
return 0;
}
