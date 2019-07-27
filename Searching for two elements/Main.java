import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner sc =new Scanner(System.in);
      int size = sc.nextInt();
      int a[] = new int[size];
      for(int i=0; i<size;i++)
      {
        a[i]=sc.nextInt();
      }
       int search_elem_1 = sc.nextInt();
        int search_elem_2 = sc.nextInt();
       int element_1_index = -1;
       int element_2_index = -1;
      for(int i =0;i<size;i++)
      {
        if(search_elem_1 == a[i])
        {
           element_1_index = i;
        }
       
         if(search_elem_2 == a[i])
        {
          element_2_index = i;
        }
       
      }
        System.out.println(element_1_index);
       System.out.println(element_2_index);
    }
}