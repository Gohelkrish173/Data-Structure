import java.util.*;
public class MinOfN
{
    public static void main(String[] args) {
        boolean j=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Stop when you enter 0");
		int min=Integer.MAX_VALUE;
		while(j)
		{
			int a=sc.nextInt();
			if(a==0)
			{
				j=false;
				break;
			}
			if(min>a)
			{
				min=a;
			}
		}
        System.out.println(min);
    }
}