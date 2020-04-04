import java.util.*;
class Majority
{
    public static void main(String [] args)
    {
        int arr[] =new int[]{4,7,4,4,7,4,4,9,4,3};
        HashMap<Integer,Integer> map = new HashMap<>();
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
        for(Map.Entry map2 : map.entrySet())
        {
            int value = (int)(map2.getValue());
            if(value>=(arr.length/2))
            {
                System.out.println(map2.getKey());
                break;
            }
        }
    }
}