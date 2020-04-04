import java.util.*;
public class ConsecutiveOnes
{
    public static boolean check(String str)
    {
        int count = 0;
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)!=str.charAt(i-1))
            {
                count++;
            }
        }
        if(count>1)
        {
            return false;
        }
        return true;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc. next();
        boolean bool = check(str);
        System.out.println(bool);
    }
}