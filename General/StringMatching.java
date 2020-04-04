import java.util.*;
public class StringMatching
{
    public static boolean checkString(String first , String second ,int i ,int j, int firstStringLen , int secondStringLen)
    {
        if(i>=firstStringLen || j>=secondStringLen)
        {
            return false;
        }
        else if(first.charAt(i)==' ' && second.charAt(j)==' ')
        {
            return true;
        }
        else if(first.charAt(i) == ' ' || second.charAt(j)==' ')
        {
            return false;
        }
        else if(first.charAt(i)=='*' )
        {
            if((i+1)<firstStringLen && (j+1)<secondStringLen)
             {
                 if(first.charAt(i+1) != ' '  && second.charAt(j+1)==' ') 
                 {
                     return false;
                 }
             }
        }
        else if (first.charAt(i) == '?')
        {
            return checkString(first,second,i+1,j+1,firstStringLen,secondStringLen);
        }
        else if(first.charAt(i)=='*')
        {
            return checkString(first,second,i,j+1,firstStringLen,secondStringLen) || checkString(first,second,i+1,j,firstStringLen,secondStringLen);
        }
        else if(first.charAt(i)==second.charAt(j))
        {
            return checkString(first,second,i+1,j+1,firstStringLen,secondStringLen);
        }
        return true;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        boolean value = checkString(a,b,0,0,a.length(),b.length());
        System.out.println(value);
    }
}