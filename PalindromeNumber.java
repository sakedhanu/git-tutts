package OwnException;
import java.util.Scanner;
public class PalindromeNumber 
{
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the number");
    	String s = sc.next();
    	String rev = "";
    	for(int i=s.length()-1;i>=0;i--)
    	{
    	  rev = rev+s.charAt(i);
    	}
    	if(rev.equals(s))
    	{
    		System.out.println("Given String is Palindrome");
    	}
    	else
    	{
    		throw new NotPalindromeException();
    	}
    }
}
class NotPalindromeException extends RuntimeException
{
	public String toString()
	{
		return getClass()+":THe Reverse String Is Not Equals To Palindrome";
	}
}
