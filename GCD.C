#include<stdio.h>
void main()
{
int num1,num2,fact1[10],fact2[10],com[10],max,i,j=0,k=0;
clrscr();
printf("enter number1 ");
scanf("%d",&num1);
printf("\n enter number2 ");
scanf("%d",&num2);
for(i=0;i<10;i++){
fact1[i]=0;
fact2[i]=0;
com[i]=0;
}

for(i=1;i<=num1;i++){
if(num1%i==0){
fact1[j]=i;
j++;
}
}
for(i=1;i<=num2;i++){
if(num2%i==0){
fact2[k]=i;
k++;
}
}
k=0;
for(i=0;i<10;i++){
for(j=0;j<10;j++){
if(fact1[i]==fact2[j]){
com[k]=fact1[i];
}
}
}

}
}