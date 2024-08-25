class SecondLargest 
{
	public static void main(String[] args) 
	{
		int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
		int[] arr = {56,43,43,55,45,5,47,99,65,75};
		int max=0, second_max=-1;
		//complexity Big O(2n)
		for(int i=0;i<arr.length;i++)
		{
			
				if(arr[i]>max)
				{ 
					max=arr[i];
				}
			
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] >second_max && arr[i]!=max )
			{
				second_max=arr[i];
			}
		}
		System.out.println("The second largest element is :"+second_max);

		//optimal solution - 
		max=arr[0];
		second_max=-1;

		for(int i=1;i<arr.length;i++)
		{
			
				if(arr[i]>max)
				{
					second_max=max;
					max=arr[i];
				}
				else if(arr[i]<max && arr[i]>second_max)
				{
					second_max=arr[i];	
				}
		}
		
		System.out.println("The second largest element is :"+second_max+"\n largest - "+max);
		
		//finding the smallest and second smallest 
		//optimal solution 
		int min= arr[0], second_min=minInt;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				second_min = min;
				min = arr[i];
			}
			else if(arr[i]>min && arr[i]<second_min)
			{
				second_min=arr[i];
					
			}
		}
		System.out.println("The second smallest element is :"+second_min+"\n smallest - "+min);

	}
}
