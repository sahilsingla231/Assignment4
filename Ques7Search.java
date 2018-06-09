import java.util.Scanner;

public class Ques7Search {

	public static void main(String[] args){
        int arr[]={1,4,6,7,8,9,10};
        
       // System.out.println(arr.length - 1); to check ending index
        int beg=0,last=(arr.length - 1); // last=6;
        int mid=(beg+last)/2;
        boolean found=false;
        int N;
       // int N=Integer.parseInt(args[0]);
        Scanner sl=new Scanner(System.in);
		System.out.println("Enter Number to search in array");
		N=sl.nextInt();
		
		sl.close();
       while(beg<=last){
        if(arr[mid]==N){
           found=true;
           break;
        }
        else if(arr[mid]<N)
               beg=mid+1;
               else
               last=mid-1;

           mid=(last+beg)/2;

       }

       if(found==true)
           System.out.println("YES the number is present in array");
       else
            System.out.println("NO the number is not present in array");

         }

	
}
