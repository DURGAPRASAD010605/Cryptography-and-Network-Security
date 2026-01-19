#include<stdio.h>
int main(){
    char str[]="Hello World";
    char result[50];
    int key=0,i,j;
    while(str[i]!='\0'){
        result[i]=str[i]^key;
        i++;

    }
    result[i]='\0';
    printf("Character ASCII  After XOR  ASCII After XOR");
    prinf("---------------------------------------------");
    for(j=0;str[j]!='\0';j++){
        if(str[j]==' ')
        printf("Space   %d        %c          %d   ",str[j],result[j],result[j]);
        else
        printf("%c      %d        %c          %d ",str[j],str[j],result[j],result[j]);

    }
    printf("\n Original String %s ",str);
    printf("\n After Xor with key : %s",result)


}