import java.util.*;
public class FirstSubsequenceSecond
{
    private static boolean check(String a , String b)
    {
        int i=0;
        int j=0;
        while(i<a.length() && j<b.length())
        {
            if(a.charAt(i)==b.charAt(j))
            {
                i++;
                j++;
            }
            else 
            {
                j++;
            }
        }
        if(i==a.length())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        boolean value = check(a,b);
        System.out.println(value);
    }
}