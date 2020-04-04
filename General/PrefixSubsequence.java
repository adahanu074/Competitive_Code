import java.util.*;
public class PrefixSubsequence
{
    private static int count(String a, String b)
    {
        int count =0;
        for(int i=0;i<Math.min(a.length(),b.length());i++)
        {
            
            if(a.charAt(count)==b.charAt(i))
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
        String str1 = sc.next();
        int value = count(str,str1);
        System.out.println(value);
    }
}