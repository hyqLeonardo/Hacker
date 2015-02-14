#include  <conio.h>
#include  <stdio.h>
#include  <windows.h>
void readwriteDAT() ;
void num(int m,int k,int xx[])
{
	int Data;
    int half,i,n=0;
    Data=m+1;
    while(n<k)
	{
      half=Data/2;
      for(i=2;i<=half;i++)
	  {
          if(Data%i==0)  break;
          if(i>half)  {xx[n]=Data;n++;}
          Data++;
	  }
	}
}
main()
{
  int m, n, xx[1000] ;
  system("cls");
  printf("\nPlease enter two integers:") ;
  scanf("%d,%d", &m,&n ) ;
  num(m, n, xx) ;
  for(m = 0 ; m < n ; m++)  printf("%d ", xx[m]) ;
  printf("\n") ;
  readwriteDAT() ;
}
void readwriteDAT()
{
  int m, n, xx[1000], i ;
  FILE *rf, *wf ;
  rf = fopen("c:\\test\\IN.DAT", "r") ;
  wf = fopen("OUT.DAT", "w") ;
  for(i = 0 ; i < 10 ; i++) 
  {
    fscanf(rf, "%d %d", &m, &n) ;
    num(m, n, xx) ;
    for(m = 0 ; m < n ; m++)  fprintf(wf, "%d ", xx[m]) ;
    fprintf(wf, "\n") ;
  }
  fclose(rf) ;
  fclose(wf) ;
}
