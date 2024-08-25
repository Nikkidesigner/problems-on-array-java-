class CheckSortedArray 
{
	public static void CheckArrayIsSorted(int[] arr)
	{
		int flag = 0;
		for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i]>=arr[i+1])
				{
					flag=1;
					break;
				}
				
			}

				if(flag==1)
					System.out.println("Not a sorted array");

				else if(flag==0)
					System.out.println("sorted array!");
			
	}
	public static void main(String[] args) 
	{
		int[] arr1 = {1,2,3,4,5,5,6,7,8};
		int[] arr2 = {1,2,3,2,4,5,65,7,8};
		int[] arr3 = {1,2,3,4,4,4,5,6};		
		CheckArrayIsSorted(arr3);

//--------------------------another method (optimal)------------------------------------
/*
class CheckSortedArray {
    public static boolean isArraySorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; // Early return if any pair is out of order
            }
        }
        return true; // Return true if no pairs are out of order
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 5, 6, 7, 8};
        int[] arr2 = {1, 2, 3, 2, 4, 5, 65, 7, 8};
        int[] arr3 = {1, 2, 3, 4, 4, 4, 5, 6};

        if (isArraySorted(arr1)) {
            System.out.println("arr1 is a sorted array!");
        } else {
            System.out.println("arr1 is not a sorted array");
        }

        if (isArraySorted(arr2)) {
            System.out.println("arr2 is a sorted array!");
        } else {
            System.out.println("arr2 is not a sorted array");
        }

        if (isArraySorted(arr3)) {
            System.out.println("arr3 is a sorted array!");
        } else {
            System.out.println("arr3 is not a sorted array");
        }
    }
}

*/
	}
}
