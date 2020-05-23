import java.util.*;
class Repeated {
    public static void helper(String s, int lps[],int n)
    {
        int j=1;
        int i=0;
        lps[i]=0;
        while(j<n)
        {
            if(s.charAt(j)==s.charAt(i))
            {
                lps[j]=i+1;
                i++;
                j++;
            }
            else
            {
                if(i!=0)
                i=lps[i-1];
                else
                {
                    lps[j]=i;
                    j++;
                }
            }
        }
    }
    public static boolean repeatedSubstringPattern(String s) {
       int n =s.length();
        int lps[]= new int[n];
        helper(s,lps,n);
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(lps[i]>max)
            {
                max=lps[i];
            }
        }
        String str = s.substring(0,max);
        System.out.println(Arrays.toString(lps));
        if(n%max!=0)
        {
            System.out.println("Arrays.toString");
            return false;
        }
        else
        {
            for(int i=0;i<n;i=i+max)
            {
                String st =s.substring(i,i+max);
                if(!st.equals(str))
                {
                    System.out.println("Arrays");
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String [] args)
    {
        String s ="aabcdaabc";
        // String s = "abcabcabcabc";
        boolean val = repeatedSubstringPattern(s);
        System.out.println(val);
    }
}