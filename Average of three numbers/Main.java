import java.util.Scanner;
class Main {
	public static void main (String[] args) 
    {
		Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
         int n2=sc.nextInt();
      int n3=sc.nextInt();
        int sum= n1+n2+n3;
        int a=sum/3;
        System.out.println(a);
	}
}