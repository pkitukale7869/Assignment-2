package Practice2;

public class DuplicateInArray 
{

	public static void main(String[] args) 
	{
		int[] ar= {10,60,90,50,30,10,50};
		System.out.println("Duplicate elements are present in Array::");
		for(int i=0;i<ar.length;i++)
		{
			for (int j=i+1;j<ar.length;j++) 
			{
			if(ar[i]==ar[j])
			System.out.println( ar[j]+ " ");
			}
		}
	}
}
