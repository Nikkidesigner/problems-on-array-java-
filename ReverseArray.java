class ReverseArray 
{
	public static void Printarr(int[] a)
	{
	System.out.println("Reversed array : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("\t"+a[i]);
		}
	}
	public static void ReverseInputArray(int[] arr)
		{
			int i=0,j=arr.length-1;
			while(i<=j)
				{
			int temp = arr[i];
					arr[i]=arr[j];
					arr[j] = temp;
					i++;
					j--;
				}
		}
	public static void main(String[] args) 
	{
	 int[]	arr1={1,2,3,4,5};
		ReverseInputArray(arr1);
		Printarr(arr1);
	}
}
