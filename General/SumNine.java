import java.util.*;
public class SumNine
{
    private static int getcount(int [] val,int value)
    {
        int j=0;
        int count = 0;
        for(int i=0;i<val.length;i++)
        {
            value = value - val[i];
            if(value ==0 )
            {
                count++;
            }
            else
            {
                while(value<0)
                {
                    value = value + val[j];
                    if(value==0)
                {
                    count++;
                }
                    j++;
                }
                
            }
        }
        return count;
    }
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);
        String str = sc.next();
        int value = sc.nextInt();
        char [] arr = str.toCharArray();
        int []val = new int[arr.length];
        for(int i=0;i<val.length;i++)
        {
            val[i]=Character.getNumericValue(arr[i]);
        }
        
        int count = getcount(val,value);
        System.out.println(count);
    }
}