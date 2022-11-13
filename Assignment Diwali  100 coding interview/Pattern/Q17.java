class Q17{

public static void main(String args[]){

for(int i=1;i<=5;i++)

{

for(int j=1; j<=i; j++)

{

System.out.print("*");


}

System.out.println();
}

for(int i=4;i>=1;i--)
// starting the loop from 4 to overlap

{

for(int j=1; j<=i; j++)

{

System.out.print("*");


}

System.out.println();
}

}
}

/*

*
**
***
****
*****
****
***
**
*

*/