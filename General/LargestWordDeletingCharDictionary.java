import java.util.*;
public class LargestWordDeletingCharDictionary
{
    public static boolean isSubString(String st, String str)
    {
        int i=0;
        int j=0;
        while(i<st.length() && j<str.length())
        {
            if(st.charAt(i)==str.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                j++;
            }
        }
        if(i==st.length())
        {
            return true;
        }
        return false;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String arr [] = new String[]{"pintu", "geeksfor", "geeksgeeks", 
        " forgeek"};
        String str = sc.next();
        int max =0;
        String result ="";
        for(int i=0; i<arr.length;i++)
        {
            boolean value = isSubString(arr[i],str);
            if(value)
        {
            if(arr[i].length()>max)
            {
                max = arr[i].length();
                result = arr[i];
            }
        }
        }
        System.out.println(result);    
    }
}