import java.util.Scanner;
class LargestElement 
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);		
		System.out.println("Enter the number of elements in the array :");
		int no = sc.nextInt();
		int[] arr = new int[no];
		System.out.println("\n Enter the elements in The array :");
		for(int i=0;i<no;i++)
		{
			arr[i] =  sc.nextInt();
		}
		int max=0,index=0;
		for(int i=0;i<no;i++)
		{
			if(arr[i] >max)
				max=arr[i];
			 index = i+1;
		}
	System.out.printf("Largest element in the array is %d%n at %d%n ",max,index);


	}
}
