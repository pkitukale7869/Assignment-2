package Practice2;

public class SubSet 
{
	static boolean isSubset(int ar1[], int ar2[],int m, int n) 
	{
		int i=0;
		int j=0;
		for( i=0;i<n;i++) 
		{
			for( j=0;j<m;j++) 
			{
				 if (ar2[i] == ar1[j])
	                    break;
			}
			if(j==m)
			return false;
		}
		return true;
	}	
	public static void main(String[] args) 
	{
		int[]ar1= {1,2,3,5,6};
		int[]ar2= {2,3,5,};
		
		int m=ar1.length;
		int n=ar2.length;
		
        if (isSubset(ar1, ar2, m, n))
            System.out.print("arr2[] is subset of arr1[] ");
        else
            System.out.print("arr2[] is not subset of arr1[] ");	
	}
}
