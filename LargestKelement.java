class LargestKelement 
{
	public static void FindMax(int arr[])
		{
		for(int j=0;j<arr.length;j++)
			{
			for(int i=j+1;i<arr.length;i++)
				{
					if(arr[i+1]>arr[i])
						{
							int temp = arr[i];
							arr[i]=arr[i+1];
							arr[i+1]=temp;
						}
				}
			}
		}
	public static void Printarr(int[] a)
	{
	System.out.println("Sorted array : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("\t"+a[i]);
		}
	}
}

	public static void main(String[] args) 
	{
		int[] arr ={22,11,9,8,45};
		 FindMax(arr);
		Printarr(arr);
	}

