import java.util.Scanner;
class Insertionsort 
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
			arr[i] =  sc.nextInt();
		}

		//insertion sort 
		for(int i=1;i<arr.length;i++)
		{
			int key = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		Printarr(arr);
	}
}
