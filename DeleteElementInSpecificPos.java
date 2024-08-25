class  DeleteElementInSpecificPos 
{
	public static void DeleteElement(int[] arr, int pos)
		{
			for(int i = pos-1; i< arr.length-1; i++)
				{
					arr[i]=arr[i+1];
				}
				arr[arr.length-1]=0;
			
		}
	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5,6,7,8};
		DeleteElement(a,4);
		for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
		
	}
}
