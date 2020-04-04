import java.util.*;
class PalindromeRemoval
{
    public static boolean ispalin(String str)
    {
        StringBuilder str1 = new StringBuilder(str);
        StringBuilder str2 = str1.reverse();
        if(str2.toString().equals(str))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static int remo(String str)
    {
        if(ispalin(str))
        {
            return 1;
        }
        else
        {
            return 2;
        }
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int removal = remo(str);
        System.out.println(removal);
    }
}