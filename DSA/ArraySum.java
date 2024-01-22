import java.util.*;

public class ArraySum {
    public static void main(String[] args) {
        Scanner jt = new Scanner(System.in);
        System.out.println("Enter first number");
        int m = jt.nextInt();

        System.out.println("Enter second number");
        int n = jt.nextInt();
        int sum = 0;
        if(n>m)       
        {
           for(int i=m;i<=n;i++)
            {
                sum+=i;
            } 
        }
        else
        {    for(int i=n;i<=m;i++)
            {
                sum+=i;
            }
        }
        System.out.println(sum);

    }    
}
