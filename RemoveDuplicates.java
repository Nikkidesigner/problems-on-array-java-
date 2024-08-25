class RemoveDuplicates 
{
	public static int RemoveDuplicatesInArray(int[] arr)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
			{
				if(i<arr.length-1 && arr[i]==arr[i+1])
				{
					continue;
				}
				else
				{
					arr[count]=arr[i];
					count++;
				}
			}
			for(int i=count;i<arr.length;i++)
			{
				arr[i]= 0;
			}
		return count;

			
	}
	public static void Printarray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
	}
	public static void main(String[] args) 
	{
		int[] arr1={1,1,2,2,3,3,4,4,4,5,5};
       System.out.println("No. of unique elements : "+ RemoveDuplicatesInArray(arr1));
		Printarray(arr1);
		
	}
}
