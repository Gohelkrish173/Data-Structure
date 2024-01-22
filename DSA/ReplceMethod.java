import java.util.*;
public class ReplceMethod 
{
    public static void main(String[] args) 
    {
        Scanner jt=new Scanner(System.in);
        //Scanner jt=new Scanner(System.in);
        System.out.println("How many number you enter");
        int n=jt.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=jt.nextInt();
        }
        System.out.println("Enter first number");
        int j=jt.nextInt();
        System.out.println("Enter second number");
        int t=jt.nextInt();

        arr[0]=j;
        arr[1]=t;

         for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }    
}
