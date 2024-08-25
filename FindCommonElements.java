class FindCommonElements 
{
	public static void FindElements(int[] arr1, int[] arr2)
		{
		System.out.println("Common elements : ");
			for(int i=0;i<arr1.length;i++)
				{
					for(int j=0;j<arr2.length;j++)
						{
							if(arr1[i]==arr2[j])
							{
								System.out.println("\t"+arr1[i]);
							}
						}
				}
		}
	public static void main(String[] args) 
	{
		int[] arr1={1,2,3,4,5,6,7,8};
		int[] arr2={1,5,34,27,33,24,56,6,7};
		FindElements(arr1,arr2);
	}
}
