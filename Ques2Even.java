import java.util.Scanner;

public class Ques2Even {

    public static void main(String[] args){
        //int N=Integer.parseInt(args[0]);
        int i,N;
        Scanner sl=new Scanner(System.in);
		System.out.println("Enter Number");
		N=sl.nextInt();

        for(i=0;i<=N;i++)
        {
            if(i%2==0)
                System.out.println(" "+i);

        }
        
        sl.close();
    }
}
