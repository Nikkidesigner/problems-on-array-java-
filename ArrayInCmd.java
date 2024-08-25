class ArrayInCmd 
{
	public static void main(String[] args) 
	{
		int []x = new int[6];

		
		for(int i=0; i<x.length;i++)
		{
			x[i] = Integer.parseInt(args[i]);
			
		}
		System.out.println("Array elements are : ");
		for(int i = 0;i<x.length;i++)
		{
			System.out.println(" "+x[i]);
		}
	}
}
