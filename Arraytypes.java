import java.util.Scanner;
class Arraytypes	 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		/*
        types - 
				1) 1d array 
				2) 2d array
				3) 3d array
				4) Multidimensional array 

		1) 1d aarray 
		declaration : 
			*/
			int[] x;
			x = new int[5];
			x[0]=1;
			x[1]=2;
			x[2]=3;
			x[3]=4;
			x[4]=5;
		
			System.out.println("1d Array : "+x[0]+"\t"+x[1]+"\t"+x[2]);
/* Insted of this code we can declare the array in one line : */
			int[] y = {12,13,14};
			System.out.println("1d Array : "+y[0]+"\t"+y[1]+"\t"+y[2]);
			/* 2d array declaration */

			int[][] A = {{10,20},{30,40,50}};
			System.out.println("2d array : \t"+A[0][0]+"\t"+A[0][1]+"\n\t\t"+A[1][0]+"\t"+A[1][1]+"\t"+A[1][2]);

			/*finding the length of the array */
			int[] B = new int[6];
			System.out.println("Length of the array is : "+B.length);
			//========================================================
			System.out.println("\n\nEnter any three elements in array : ");
			int[] C = new int[3];
			for(int i=0;i<C.length;i++)
		{
			C[i]=sc.nextInt();
		}
		System.out.println("Array elements are : ");
		for(int i=0;i<C.length;i++)
		{
			System.out.println("\t"+C[i]);
			
		}
		//================================================================
		/*case 3 assigning array to another array (dimensions)*/
		int[] X = {1,2,3,4,5};
		int[][] Y = new int [2][3];
		int []Z = X;
		//int[]Z<!--  -->=Y; /*error: incompatible types: int[][] cannot be converted to int[] */
		System.out.println("\t"+Z[0]+"\t"+Z[1]+"\t"+Z[2]);
			
	}

}
