#include <stdio.h>
main()
{
	int i,j,t1,t2,t3,t4,a[5]={1634,6422,4471,2256,3425};
	int cent=0;
	for(i=0;i<5;i++)
	{
		t1=a[i]%10;
		t2=a[i]%100/10;
		t3=a[i]%1000/100;
		t4=a[i]/1000;
		if(t1+t2==t3+t4&&t1%2==1||t2%2==1)
		{
			cent++;
		}
	}
	printf("cent=%d\n",cent);
}
    