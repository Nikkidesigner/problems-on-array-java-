class RemoveDuplicatesFromUnsortedArray 
{
	public static void main(String[] args) 
	{
		int[] arr={1,2,3,4,1,2,3,4,5,5};
		removeDuplicates(arr);
	}
	public static void removeDuplicates(int[] arr)
		{
			for(int i=0;i<arr.length;i++)
				{
					for(int j=i+1;j<arr.length;j++)
						{
							if(arr[i]==arr[j])
								{
									arr[i]=arr[j];
									arr[j]=0;
								}
						}
				}
			for(int i=0;i<arr.length;i++)
				{
					System.out.println(arr[i]);
				}
		}
}
