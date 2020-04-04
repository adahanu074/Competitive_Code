import java.util.*;
public class RemovalOneInt
{
    private static int flipflop(String str)
    {
        int count =0 ;
        if(str.length()==0)
        {
            return 0;
        }
        if(str.charAt(i)=='1')
        {
            count++;
        }
        int i=0;
        for(i=1;i<str.length()-1;i++)
        {
            if(str.charAt(i)=='1' && str.charAt(i-1)=='0')
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = flipflop(str);
        System.out.println(count);
    }
}