import java.util.Scanner;

public class Ques3Prime {


       public static void main(String args[]){
           int i;
          // int N=Integer.parseInt(args[0]);
           int N;
           Scanner sl=new Scanner(System.in);
   			System.out.println("Enter Number");
   			N=sl.nextInt();
   		 sl.close();


          for(i=1;i<=N;i++)
          {
        	  int j=i,count=0,k;
        	  for(k=1;k<=j;k++)
      		{
      			if(j % k == 0)
      			{
      				count++;
      			}
      		}
      		
      	
      		if(count == 2)
      			System.out.println(j+" is Prime");
          }
               
           }
       	
         
       
}
