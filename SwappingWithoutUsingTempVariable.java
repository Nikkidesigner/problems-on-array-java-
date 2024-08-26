class SwappingWithoutUsingTempVariable 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,7,8};
		swap(arr, 1,5);
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print("\t"+arr[i]);
		}
	}
	public static void swap(int[] arr , int n1 , int n2)
	{
		arr[n1]= arr[n1]+arr[n2];
		arr[n2] = arr[n1] - arr[n2];
		arr[n1]= arr[n1]-arr[n2];
	}
}
