import java.io.BufferedReader;
import java.io.InputStreamReader;
class  ArrayInBr
{
	public static void main(String[] args) throws Exception
	{
       // decl.
		int []x=new int[6];
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));

		System.out.println("\n Enter nos: ");
		for(int i=0;i<x.length;i++)
		{
			x[i]=Integer.parseInt(br.readLine());
		}
		// display
		System.out.println("\n Array elements are: ");
		for(int i=0;i<x.length;i++)
		{
			System.out.print("  "+x[i]);
		}
		System.out.println(" ");
	}
}
 