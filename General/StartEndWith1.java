import java.util.*;
public class StartEndWith1
{
    private static int count(String str)
    {
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='1')
            {
                count++;
            }
        }
        int value = ((count)*(count-1))/2;
        return value;
    } 
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int value = count(str);
        System.out.println(value);

    }
}