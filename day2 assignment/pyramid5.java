class pyramid5{
	public static void main(String args[])
	{
for(int i =9;i>=1;i--)
             {
				for(int k =i;k>1;k--)
				{
					System.out.print("  ");
				}
				for(int l=i;l<=9;l++)
				{
					System.out.print(l+" ");
				}
				for(int j =9-1;j>=i;j-- )
				{
					System.out.print(j+" ");
				}
				System.out.println();
				}
					
			}
}
/*
                9
              8 9 8
            7 8 9 8 7
          6 7 8 9 8 7 6
        5 6 7 8 9 8 7 6 5
      4 5 6 7 8 9 8 7 6 5 4
    3 4 5 6 7 8 9 8 7 6 5 4 3
  2 3 4 5 6 7 8 9 8 7 6 5 4 3 2
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
*/