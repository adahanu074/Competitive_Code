import java.util.*;
public class NoSubStringWithKDistinctChar
{
    private static void countNoOfSubstring(String str , int k)
    {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int count = 0;
        int j =0;
        for(int i=0; i<str.length();i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
            else
            {
                map.put(str.charAt(i),1);
            }

            if(map.size()==k)
            {
                count++;
            }
            else if (map.size()>k)
            {
                while(map.size()>=k)
                {
                    if(map.size()==k)
                    {
                        count++;
                    }
                    int value = map.get(str.charAt(j));
                    if(value >1)
                    {
                        map.put(str.charAt(j),map.get(str.charAt(j))-1);
                    }
                    else
                    {
                        map.remove(str.charAt(j));
                        
                    }
                    j++;
                }
            }
            else
            {
                continue;
            }
        }
        if(map.size()==k)
        {
            count--;
        }
        while(map.size()>=k)
        {  
            if(map.size()==k)
        {
            count++;
        }
            int value = map.get(str.charAt(j));
            if(value >1)
            {
                map.put(str.charAt(j),map.get(str.charAt(j))-1);
            }
            else
            {
                map.remove(str.charAt(j));
            }
            j++;
        }
        System.out.println(count);
    }
    
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();
        countNoOfSubstring(str,k);
    }
}