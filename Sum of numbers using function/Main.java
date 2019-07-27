import java.util.Scanner;
class Main{
    public static int sum(int num)
    {
      int s=0;
      for(int i=1;i<=num;i++)
      {
        s=s+i;
      }
      return s;
    }
	public static void main (String[] args)
    {
	   Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
      int a=sum(n);
      System.out.println(a);
    
	}
}