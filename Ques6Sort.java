
public class Ques6Sort {
	
	public static void main(String args[]){

        int arr[]={1,1,1,1,0,0,1,0};
        int length=arr.length;
      int temp;

      int j=0;
       
      
        for(int i=0;i<length;i++)
        {
        	//For least computation When array consist of 0 and 1 only...SORTING using SINGLE LOOP...
            if(arr[i]==0)
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }

        }
        
      /*
       //SELECTION SORT
       Ques6Sort ob=new Ques6Sort();
      ob.sort(arr);
      void sort(int arr[])
        {
            int n = arr.length;
     
            // One by one move boundary of unsorted subarray
            for (int i = 0; i < n-1; i++)
            {
                // Find the minimum element in unsorted array
                int min_idx = i;
                for (int j = i+1; j < n; j++)
                    if (arr[j] < arr[min_idx])
                        min_idx = j;
     
                // Swap the found minimum element with the first
                // element
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        }
        
        */
        System.out.println("Sorted array is ");
        for(int i=0;i<length;i++)
            System.out.println(" "+arr[i]);
    }

}
