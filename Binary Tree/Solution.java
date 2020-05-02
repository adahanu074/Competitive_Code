import java.util.*;
class Solution {
        public static boolean isPalindrome(String s) {
            String str = "";
            s = s.toLowerCase();
            if(s.length()==0)
            {
                return true;
            }
            else
            {
                for(int i=0;i<s.length();i++)
                {
                    if(Character.isLetterOrDigit(s.charAt(i)))
                    {
                        str=str+Character.toString(s.charAt(i));
                    }
                }
                StringBuilder st = new StringBuilder(str);
                String res = st.reverse().toString();
                System.out.println(res);
                System.out.println(str);
                if(res.equals(str))
                {
                    return true;
                }
                return false;
            }
            
        }
    public static void main(String [] args){
    // {
    //     System.out.println((int)(Math.floor(Math.log(132)/Math.log(2))));
    //     System.out.println(Math.pow(2,(int)(Math.floor(Math.log(132)/Math.log(2)))));
    double c = Math.pow(10,12);
    int x = (int)(Math.pow(10,12));
    if(c==x)
    {
        System.out.println("yess");
    }
    else{
        System.out.println("nooo");
    }
    System.out.println();
    }
}