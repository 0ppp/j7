import java.io.*;
import series.*;
import series.prime;
import series.sqaure;

class demo
{
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter n");
	int n=Integer.parseInt(br.readLine());
		System.out.println();
	  new prime(n);
		System.out.println();
	new sqaure(n);		
			
	}
	
	
}