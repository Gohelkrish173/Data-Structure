import java.util.*;
public class Avg 
{
    public static void main(String[] args) 
    {
        Scanner jt=new Scanner(System.in);
        System.out.println("Enter second number");
        int n=jt.nextInt();
        int sum=0;
        int c=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println(sum/n);    
    }    
}
