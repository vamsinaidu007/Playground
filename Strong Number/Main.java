import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	     Scanner in = new Scanner(System.in);
	    int num = in.nextInt();
       
        int sum =0;
        int temp=num;
       while(num>0)
       {
          int fact=1;
         int rem = num%10;
         for(int i=1;i<=rem;i++)
         {
           fact = fact* i;
         }
          sum = sum+ fact;
          num =num/10;
       }
        if(temp == sum)
        {
          System.out.println("Yes");
        }
         else
         {
           System.out.println("No");
         }
	}
}