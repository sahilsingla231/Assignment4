import java.util.Scanner;

public class Ques5Reverse {
	
public static void main(String[] args) {
		
		int N,i,rem,sum=0;
		//int N=Integer.parseInt(args[0]);
		Scanner sl=new Scanner(System.in);
		System.out.println("Enter Number");
		N=sl.nextInt();
		
		for(i=N;i>0;i=i/10)
		{
			rem=i%10;
			sum=sum*10 + rem;
		}
	
			System.out.println("Reverse of number is "+sum);
			sl.close();
		
	}

}
