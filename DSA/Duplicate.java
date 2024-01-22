import java.util.*;
public class Duplicate 
{
    public static void main(String[] args) 
    {
        Scanner jt=new Scanner(System.in);
        System.out.println("How many number you enter");
        int n=jt.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=jt.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("Duplicate of index "+i+" and "+j);
                    break;
                }
            }            
        }

        
    }    
}
