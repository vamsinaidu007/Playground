import java.util.Scanner;
class Main
{
  public static int pon(int base,int expo)
  {
    int power=1;
    while(expo>=1)
    {
      power=power*base;
      expo--;
    }
    return power;
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int base = sc.nextInt();
    int expo = sc.nextInt();
    int a= pon(base,expo);
    System.out.println(a);
  }
}