package sort;

public class bubblesort 
{
	        static void bubblesort(int arr[])
		    {
		    	int n = arr.length,j;
		    	for(int i=0;i<n-1;i++)
		    	{
		    		for(j=0;j<n-i-1;j++)
		    		{
		    			if(arr[j]>arr[j+1])
		    		    {
		    				int temp = arr[j];
		    			    arr[j] = arr[j+1];
		    	        	arr[j+1] = temp;
		    	        }
		            }
		    	}
		    }
		    static void print(int arr[])
		    {
		    	for(int i=0;i<arr.length;i++)
		    	{
		    		System.out.print(arr[i] + " ");
		    	}
		    }
			public static void main(String[] args) 
			{
		        int[] arr = {10,2,5,11,20};
		        bubblesort(arr);
		        print(arr);
			}

		}
