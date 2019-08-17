//'main' method must be in a class 'Rextester'.
//Compiler version 1.8.0_111

import java.util.*;
import java.lang.*;

class Rextester
{  
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=n;j>=i+2;j--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        int p=n*2-1;
        int q=p-6;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<q;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<3;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*Input:(any number) eg:7
Output:      
      *
     ***
    *****
   *******
  *********
 ***********
*************
***       ***
***       ***
***       ***
*/