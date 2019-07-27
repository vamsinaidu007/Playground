import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
		Scanner sc=new Scanner(System.in);
       
      int n1 = sc.nextInt();
       int n = n1/10;
       int m = n1%10;
      int s= n+m;
      System.out.println(s);
	}
}