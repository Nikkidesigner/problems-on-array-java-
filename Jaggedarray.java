import java.util.Scanner;
class  Jaggedarray
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of students : ");
		int nos = sc.nextInt();
		int no=0,j=0;
        int x[][] = new int[nos][];
		for(int i=0;i<nos;i++)
		{
			int c = i+1;
			System.out.println("Enter the no. of subjects ");
			 no = sc.nextInt();
			 x[i] = new int[no];
			System.out.println("Enter the marks of student "+c+": ");
			c++;
			for( j =0;j<no;j++)
			{
				x[i][j] = sc.nextInt();
			}
		}
		System.out.println("Marks of "+nos+" students : ");
		for(int i=0;i<x.length;i++)
		{
			System.out.println("Marks of student "+(i+1)+": ");
			for( j=0;j<x[i].length;j++)
			{
				System.out.printf(" "+x[i][j]);
				System.out.println();
			}
		}

	}
}
