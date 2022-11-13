public class Q25 
{  
public static void main(String[] args)   
{  
int i, j, k, rows=7;  
for(i=1;i< rows+1 ;i++)  
{  
for(j=i; j < rows+1 ;j++)  
{  
System.out.print(j + " ");  
}  
for(k=1; k < i ;k++)  
{  
System.out.print(k + " ");  
}  
System.out.println();  
}  
}  
} 

/*

1 2 3 4 5 6 7
2 3 4 5 6 7 1
3 4 5 6 7 1 2
4 5 6 7 1 2 3
5 6 7 1 2 3 4
6 7 1 2 3 4 5
7 1 2 3 4 5 6

*/