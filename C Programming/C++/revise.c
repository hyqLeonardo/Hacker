#include <stdio.h>
#define num 10
main()
{
	int i,j,a[num],t;
	printf('please input 10 numbers:\n');
	for(t=0;t<10;t++)
	{
		scanf('%d',&a[t]);
	}
	printf('a[num]=%d\n',a[t]);
}