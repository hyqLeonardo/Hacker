#include <stdio.h>
main()
{
	int v[10]={1,3,5,7,9,2,4,6,8,0};
	int n=10;
	void shellsort(v[10],10);
	printf("%s\n",v[10]);
	return 0;
}
void shellsort(int v[],int n)
{
	int gap,i,j,temp;
	for(gap=n/2;gap>0;gap/=2)
		for(j=i-gap;j>=0&&v[j]>v[j+gap];j-=gap)
		{
			temp=v[j];
			v[j]=v[j+gap];
			v[j+gap]=temp;
		}

}