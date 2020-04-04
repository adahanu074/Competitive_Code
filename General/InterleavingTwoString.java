import java.util.*;
public class InterleavingTwoString
{
    private static boolean check(String a ,String b, String c)
    {
        int i=0;
        int j=0;
        int k=0;
        while(k<c.length())
        {
            int flag =0;
            if(k<c.length() && i<a.length() && a.charAt(i)==c.charAt(k) )
            {
                flag=1;    
                i++;
                    k++;
            }
            if(j<b.length() && k<c.length() && b.charAt(j)==c.charAt(k))
            {
                flag=1;
                j++;
                k++;
            }
            if(flag==0)
            {
                break;
            }
        }
        if(k==c.length())
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
        String c = sc.next();
        boolean value = check(a,b,c);
        System.out.println(value);
    }
}