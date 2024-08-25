import java.util.Scanner;
class Selectionsort
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
		// selection sort 
		for(int i=0;i<arr.length-1;i++)
		{
			int minimum = i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[minimum]>arr[j])
				{
					minimum = j;
				}
			}
			int temp = arr[i];
			arr[i]=arr[minimum];
			arr[minimum]=temp;
		}
Printarr(arr);
	}
}
