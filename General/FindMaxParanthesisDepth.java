import java.util.*;
public class FindMaxParanthesisDepth{
    private static int checkMaxPara(String str)
    {
        Stack<Character> stack = new Stack<> ();
        int max =0;
        for(int i=0 ;i<str.length();i++)
        {
            if(str.charAt(i)=='(')
            {
                stack.push('(');
            }
            if(str.charAt(i)==')')
            {
                if(stack.size()>max)
                {      
                    max=stack.size();
                }
                stack.pop();
            }
        }
        return max;
    }
    public static void main(String [] args )
    {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        int count = checkMaxPara(str);
        System.out.println(count);
    }
}