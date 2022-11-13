class Q22{

public static void main(String args[]){

for(int i=1; i<=7 ; i++)
{
for(int j=((6-i)); j>=0 ; j--)
//to give gap of 2
{
System.out.print("1");
}
for (int j=1; j<=i;j++)
{
System.out.print(i);
//System.out.print("* ");
//* & gap 
}

System.out.println();
}

}
}

/*

1111111
1111122
1111333
1114444
1155555
1666666
7777777

*/