public class Q2 
// Find max and min of an array
{
  public static void main(String args[])
  {
    int arr[]={1,2,3,6,4,5};
    
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;

    for(int i=0;i<5;i++)
    {
				if(arr[i]>max)
				max=arr[i];
				
				if(arr[i]<min)
				min=arr[i];
	}
		
	System.out.println("Max of array is "+ max);
    System.out.println("Min of array is "+ min);
  }
}
  																												
      
