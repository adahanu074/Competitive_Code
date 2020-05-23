import java.util.*;
public class Sieve
{
    public static void printval(int start,int end)
    {
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=start;i<=end;i++)
        {
            list.add(i);
        }
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list);
        }
        for(int i=0;i<list.size();i++)
        {
            int val = list.get(i);
            
            if(val!=(-1))
            {
                for(int j=val*val;j<=end;j=j+val)
                {
                    System.out.println(j+"*****");
                    int index = list.indexOf(j);
                    System.out.println(index);
                    list.set(index,-1);
                }
            }
        }
        
        // for(int i=0;i<list.size();i++)
        // {
        //     if(list.get(i)!=(-1))
        //     {
        //         System.out.print(list.get(i)+"  ");
        //     }
        // }
    }
    public static void main(String [] args)
    {
        int start = 2;
        int end = 50;
        printval(start,end);
    }
}