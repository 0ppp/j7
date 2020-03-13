 Slip 7_1. Create a package series having two different classes to print the following series.
a.       Prime number
b.      Squares of numbers
Write a program to generate ‘n’ terms of the above series.

Prime.java

package Series;
public class Prime
{
                public void prime_range(int no)
                {
                                for(int i=1;i<=no;i++)
                                {
                                                int flag=0;
                                                for(int j=2;j<=i/2;j++)
                                                {
                                                                if(i%j==0)
                                                                {              flag=1;
                                                                                break;
                                                                }
                                                }
                                                if(flag==0)
                                                System.out.println(i+" ");
                                }
                }

}


Squar.java
package Series;
public class Square
{
                public void square_range(int no)
                {
                                for(int i=1;i<=no;i++)
                                {
                                                System.out.println(i+" = "+(i*i));
                                }
                }
}
import Series.Prime;
import Series.Square;
import java.io.*;

class Slip7_1
{
                public static void main(String a[]) throws IOException
                {
                                BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

                                System.out.println("Enter no :");
                                int no = Integer.parseInt(br.readLine());
                                Prime p = new Prime();
                                System.out.println("Prime no upto given nos are : ");
                                p.prime_range(no);

                                Square s = new Square();
                                System.out.println("Sqaure upto given nos are : ");
                                s.square_range(no);

                }
}
