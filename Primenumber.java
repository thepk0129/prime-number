import java.util.Scanner;

public class Primenumber {
		public static void main(String args[])
	    {
	        int n, i, res;
	        boolean flag = true;
	    	Scanner sc = new Scanner(System.in);
	        System.out.println("Please Enter a No.");

	        n = sc.nextInt();
	        for (i = 2; i <= n / 2; i++)
	        {
	            res = n % i;
	            if (res == 0)
	            {
	                flag = false;
	                break;
	            }
	        }
	        if (flag)
	            System.out.println(n + " is Prime Number");
	        else
	            System.out.println(n + " is not Prime Number");

	}

}
