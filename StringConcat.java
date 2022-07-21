import java.util.*;

class StringConcat
{
	public static void main(String[] arg)
	{
		Scanner scan = new Scanner(System.in);
		String mystring1 = scan.next();
		
		String mystring2 = scan.next();
		
		scan.close();
		String c = mystring1 + " and " + mystring2;
		System.out.println(c);
		
	}
}