import java.util.*;
class Solution76 {
    public static int compress(char[] chars) {
        int len = chars.length;
        if(len<2)
        {
            return len;
        }
        int count = 1;
        int start = 0;
        StringBuilder str = new StringBuilder(Character.toString(chars[0]));
        // System.out.println(str.toString());
        for(int i=0;i<len-1;i++)
        {
            if(chars[i]==chars[i+1])
            {
                str.append(chars[i]);
                // System.out.println(str.toString());
                
            }
            else
            {
                System.out.println(i);
                char b = chars[i+1];
                chars[start]=str.charAt(0);
                start++;
                chars[start]=Character.forDigit(str.length(),10);
                start++;
                str = new StringBuilder();
                System.out.println(str.toString());
                str.append(b);
            }
        }
        chars[start]=str.charAt(0);
        start++;
        chars[start]=Character.forDigit(str.length(),10);
        start++;
        chars = Arrays.copyOfRange(chars,0,start);
        return start;
    }
    public static void main(String [] args)
    {
        // char arr[]= new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b','b'};
        // System.out.println(compress(arr));
        
    }
}