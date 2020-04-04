import java.util.*;
public class Majority
{
    public static int check(int arr[])
    {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> map1:map.entrySet())
        {
            if(map1.getValue()>=arr.length/2)
            {
                return map1.getKey();
            }
        }
       return -1;
    }
    public static void main(String [] args)
    {
        int arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int value = check(arr);
        System.out.println(value);
    }
}