


public class Q01 {
    //reverse an array
    public static void main(String args[])
    {
      int arr[]={1,2,3,6,4,5};
      int n=arr.length;        
      System.out.println("Old array");
      for(int i=0;i<n;i++)
       {
           System.out.print(arr[i]);
       }
    int i=0,j=n-1;
    while((i!=j) && (i<j))
            {
                swap(arr[i],arr[j]);
                i++;
                j--;
            }
            
      
      System.out.println("\nNew Array");
       for(i=0;i<n;i++)
       {
           System.out.print(arr[i]);
       }
    
    }

  public static void swap(int a,int  b)
        {
            a=a+b;
            b=a-b;
            a=a-b; 
            

        }
}
