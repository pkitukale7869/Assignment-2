package Practice2;

public class BubbleSort {

	public static void main(String[] args) 
	{
		int []ar= {9,5,6,7,1,2,4,3,8};
		for(int i=0; i<ar.length;i++) 
		{
			for(int j=1;j<ar.length-1;j++) 
			{
				if(ar[j]<ar[j-1]) 
				{
					int tempVar=ar[j];
					ar[j]=ar[j-1];
					ar[j-1]=tempVar;
				}
				
			}
		}
		for(int ele:ar) 
		{
			System.out.println(ele);
		}

	}

}
