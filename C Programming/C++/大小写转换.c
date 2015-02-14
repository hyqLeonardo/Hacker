#include <stdio.h>
main()
{
	char t=getchar();
	char s=lower(t);
	printf("%c\n",s);
}
int lower(int c)
{
	if(c>='A'&&c<='Z')
		return c+'a'-'A';
	else
		if(c>='a'&&c<='z')
			return c+'A'-'a';
		else 
			return c;

}