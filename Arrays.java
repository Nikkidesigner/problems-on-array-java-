class Arrays 
{
	/*
Array is one of the most widely and frequently used data structure but, it has some limitations.

Some of the limitations are:

1) An array can contain data of only similar type.
Heterogeneous elements cannot be stored in an array.

2) Array is of fixed size. Once declared, the size cannot be changed.
Let us consider an example of a school which uses an array to store names 
of all the students in a class. Initially based on the number of students,
an array is created and the information is stored. Suppose a student joins
after few days, storing the information of this student now becomes very 
difficult.

3) You have seen the insertion and deletion operations in an array. 
Those operations are expensive in terms of memory as they require
shifting of elements. This shifting may also sometime lead to loss
of data if we try to exceed the capacity of the array. Let us take
the example of a car having 5 seats. 5 people are seated and another
person comes and wants to sit at the second seat. In order to
accommodate this person, the person sitting at the second seat shifts
to the third seat and so on. At the end, the person who was sitting 
at the last has no place to sit.

4) The elements of an array are stored in continuous memory locations.
If the required number of blocks are not present together in the memory,
then the array will not be created. 
	*/
	public static void main(String[] args) 
	{
		int []x = {11,67,89,45,2};
		System.out.println("Array elements are : ");
		for(int i=0;i<x.length;i++)
		{
				System.out.println(" "+x[i]);
		}
	}
}
