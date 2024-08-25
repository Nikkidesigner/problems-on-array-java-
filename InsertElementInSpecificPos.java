class InsertElementInSpecificPos 
{
	public static void InsertElement(char[] arr, int pos, char value)
		{
		//Traversing the array from the last position to the position where the element has to be inserted
			for(int i=arr.length-1;i>=pos;i--)
				{
				//Moving each element one position to its right
					arr[i]=arr[i-1];
				}
				//Inserting the data at the specified position
				arr[pos-1]= value;
		}
	public static void main(String[] args) 
	{
		char[] a = new char[6];
		a[0]='A';
			a[1]='B';
				a[2]='C';
					a[3]='D';
						a[4]='E';
							
		InsertElement(a,4,'X');
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]+"\t");
		}
	}
}
