#include <stdio.h>
void itoa(int n,char s[])
{
	int i,sign;
	if((sign=n)<0)
		n=-n;
	i=0;
	do
	{
		s[i++]=n%10+'0';
	}
	while 
		((n/=10)>0);
	if(sign<0)
		s[i++]='-';
	s[i]='\0';
	reverse(s);
}
main()
{
	int n=67;
	char s[5];
	itoa(n,s[5]);
	printf("%s\n",s[5]);
}
void reverse(char s[])
{
	int c,i,j;
	for(i=0,j=strlen(s)-1;i<j;i++,j--)
	{
		c=s[i];
		s[i]=s[j];
		s[j]=c;
	}
}

	
