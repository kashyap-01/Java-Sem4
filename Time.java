import java.io.*;

class Time
{
	public static void main(String[] a)
	{
		String h=a[0];
		String m=a[1];
		String s=a[2];
		String t=a[3];
		String x=new String("am");

		if(t.equals("am"))
		{
			System.out.println(h+":"+m+":"+s);
		}
		else
		{
			int b=Integer.parseInt(h);
			int b1 = b + 12;
			String H = String.valueOf(b1);
			System.out.println(H+":"+m+":"+s);		
		}

	}
}