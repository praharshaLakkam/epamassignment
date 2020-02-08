package epam.task2;

/**
 * Hello world!
 *
 */
public class Chocolate implements calculate
{
	
    public int count(int a[])
    {
    	int sum=0;
    	for(int i=0;i<a.length;i++)
    	{
    		sum=sum+a[i];
    	}
    	return sum;
    }
   public void rangesort(int a[],int m,int n)
    {
    	for(int i=0;i<a.length;i++)
    	{
    		if(a[i]>=m && a[i]<=n)
    		{
    			System.out.print(a[i]+" ");
    		}
    	}
    	System.out.println();
    }
}
