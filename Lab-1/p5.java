import java.util.*;
public class p5{
	public static int fact(int n){
		if(n==0 || n==1){
			return 1;
		}
		else{
			return n*fact(n-1);
		}
	}
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int ans=fact(n);
	System.out.println(n+"!="+ans);
	}
}
