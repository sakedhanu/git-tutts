package OwnException;
import java.util.Scanner;
public class PrimeNumber 
{
   public static void main(String[] args)
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the Number");
	   int n= sc.nextInt();
	   int count=0;
	   for(int i=2;i<=n;i++)
	   {
		   if(n%i==0)
		   {
			   count++;
		   }
	   }
	   if(count==2)
	   {
		   System.out.println("Given is Prime Number");
	   }
	   else
	   {
		   InvalidPException e2 = new InvalidPException();
		   throw e2;
	   }
   }
}
class InvalidPException extends RuntimeException
{
	public String toString()
	{
		return getClass()+":You Entered Invalid Number For Prime Number";
	}
}
