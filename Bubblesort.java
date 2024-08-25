import java.util.Scanner;
class  Bubblesort
{
public static void Printarr(int[] a)
	{
	System.out.println("Sorted array : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("\t"+a[i]);
		}
	}
	public static void main(String[] args) 
	{
		
		Scanner sc  = new Scanner(System.in);		
		System.out.println("Enter the number of elements in the array :");
		int no = sc.nextInt();
		int[] arr = new int[no];
		System.out.println("\n Enter the elements in The array :");
		for(int i=0;i<no;i++)
		{
			arr[i] = sc.nextInt();
		}

	    // Bubble sort
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		Printarr(arr);
		
	}
}
