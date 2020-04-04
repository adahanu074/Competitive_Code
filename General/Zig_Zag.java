import java.util.*;
public class Zig_Zag
{
    public static void makeString(String str, int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<str.length();j=j+n)
            {
                System.out.print(str.charAt(j));
            }
        }
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n= sc.nextInt();
        makeString(str,n);
        // System.out.println("ejejejeje");
        // System.out.println(result);
    }
}