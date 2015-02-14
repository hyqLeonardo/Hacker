#include <stdio.h>
#define maxline 1000
int getline(char line[],int maxline);
void copy(char to[],char from[]);
main()
{
	int len;
	int max;
	char line[maxline];
	char longest[maxline];
	max=0;
	while((len=getline(line,maxline))>0)
		if(len>max)
		{
			max=line;
			copy(longest,line);
		}
	if (max>0)
		printf("%s",longest);
	return 0;
}
int getline(char s[],int lim)
{
	int c,i;
	for(i=0;i<lim-1&&(c=getchar)!=EOF&&c!='\n';++i)
		s[i]=c;
	if(c=='\n')
	{
		s[i]=c;
		++i;
	}
	s[i]='\0';
	return i;
}
void copy(char to[],char from[])
{
	int i;
	i=0;
	while((to[i]=from[i])!='\0')
		++i;
}


