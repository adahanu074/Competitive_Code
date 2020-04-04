import java.util.*;
public class CountWords
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count =1;
        if(str.length()==1)
        {
            System.out.println(count);
            System.exit(0);
        }

        if(str.charAt(0)==str.charAt(1))
        {
            count=count*1;
        }
        else
        {
            count=count*2;
        }
            int j=0;
        for( j=1;j<str.length()-1;j++)
        {
            if(str.charAt(j) == str.charAt(j-1) && str.charAt(j)==str.charAt(j+1))
            {
                count = count*1;
            }
            else if(str.charAt(j)==str.charAt(j-1) || str.charAt(j)==str.charAt(j+1) || str.charAt(j-1)==str.charAt(j+1))
            {
                count = count*2;
            }
            else{
                count=count*3;
            }
        }
        if(str.charAt(j-1) == str.charAt(j))
        {
            count=count*1;
        }
        else{
            count=count*2;
        }
        System.out.println(count);

    }
}