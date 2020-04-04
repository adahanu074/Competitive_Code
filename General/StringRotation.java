import java.util.*;
public class StringRotation
{
    public static boolean checkRotation(String a, String b)
    {
        String str = a+a;
        if(str.contains(b))
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
        String b= sc.next();
        boolean value = checkRotation(a,b);
        System.out.println(value);
    }
}