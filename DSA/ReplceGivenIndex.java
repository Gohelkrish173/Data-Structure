import java.util.*;
public class ReplceGivenIndex 
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
        System.out.println("Enter index number");
        int j=jt.nextInt();
        System.out.println("Enter number");
        int t=jt.nextInt();

        arr[j]=t;

         for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }       
}
