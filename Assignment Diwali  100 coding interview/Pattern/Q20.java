public class Q20  
{  
public static void main(String[] args)   
{  
int rows=7;  
//Prints upper half pattern  
for (int i = 1; i <= rows; i++)   
{  
//Prints i spaces at the beginning of each row  
for (int j = 1; j < i; j++)   
{  
System.out.print(" ");  
}  
//Prints i to rows value at the end of each row  
for (int j = i; j <= rows; j++)   
{   
System.out.print(j);   
}   
System.out.println();   
}   
//Prints lower half  pattern   
for (int i = rows-1; i >= 1; i--)   
{  
//Prints i spaces at the beginning of each row  
for (int j = 1; j < i; j++)   
{  
System.out.print(" ");  
}  
//Prints i to rows value at the end of each row  
for (int j = i; j <= rows; j++)  
{  
System.out.print(j);  
}  
System.out.println();  
}  
}  
}  

/*

1234567
 234567
  34567
   4567
    567
     67
      7
     67
    567
   4567
  34567
 234567
1234567

*/
