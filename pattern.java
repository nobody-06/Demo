import java.util.Scanner;

public class pattern{
	public static void main(String []arg)
	{
		//Diamond pattern 
		int n;//Size of  Diamond
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		if(n%2==0)
      			n=n+1;
    		int midF=n/2,midB=n/2;
   	 //upper triangle..
   		 for (int i=0;i<n/2;i++)
    		{
      			for (int j=0;j<n;j++)
      			{
        		if (j==midF||j==midB)
        		{
         		 System.out.print("*");
        		}
        else
        {
          System.out.print(" ");
        }	
      }
      System.out.println("");
      midF--;
      midB++;
    }
    //lower triangle
    for (int i=0;i<(n/2)+1;i++)
    {
      for (int j=0;j<n;j++)
      {
        if (j==midF||j==midB)
        {
          System.out.print("*");
        }
        else
        {
          System.out.print(" ");
        }
      }
      System.out.println("");
      midF++;
      midB--;
    	}
		
	}
}

