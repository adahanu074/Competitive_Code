import java.util.*;
class Solution1 {
    public static int parent(int v, int arr[])
    {
        while(v!=arr[v])
        {
            v=arr[v];
        }
        return v;
    }
    
    public static boolean merge(int src, int dest, int arr[])
    {
        int par = parent(src,arr);
        int ch = parent(dest,arr);
        if(par==ch)
        {
            return false;
        }
        else
        {    
            arr[par]=ch;
            return true;
        }
    }
    public static String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        int n = s.length();
        if(n==0)
        {
            return "";
        }
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=i;
        }
        HashMap<Integer,Queue<Character>> map =new HashMap<>();
        for(List<Integer> list:pairs)
        {
            int src = list.get(0);
            int dest = list.get(1);
            merge(src,dest,arr);
            // int pa1 = parent(src,arr);
            // int pa2 = parent(dest,arr);
            // map.put()
        }
        // System.out.println(Arrays.toString(arr));
        for(int i=0;i<n;i++)
        {
            int value = parent(i,arr);
            if(map.containsKey(value))
            {
                Queue<Character> que = map.get(value);
                char c = s.charAt(i);
                que.add(c);
                map.put(value,que);
            }
            else
            {
                map.put(value,new PriorityQueue<>());
                Queue<Character> que = map.get(value);
                char c = s.charAt(i);
                que.add(c);
                map.put(value,que);
                // map.put(arr[i],map.get(arr[i]).add(s.charAt(i)));
            }     
        }
        System.out.println(map);
        System.out.println(Arrays.toString(arr));
        StringBuilder str = new StringBuilder();
        for(int i=0;i<n;i++)
        {
            int par = parent(i,arr);
            Queue<Character> que1 = map.get(par);
            System.out.println(str +"   "+que1);
            char val = que1.poll();
            str.append(val);
        }
        return str.toString();
    }
    public static void main(String [] args)
    {
        List<List<Integer>> pairs = new ArrayList<>();
        List<Integer> list1=Arrays.asList(0,3);
        List<Integer> list2=Arrays.asList(1,2);
        List<Integer> list3=Arrays.asList(0,2);
        pairs.add(list1);
        pairs.add(list2);
        pairs.add(list3);
        String str  =  smallestStringWithSwaps("dcab",pairs);
        System.out.println(str);
        System.out.println(-1%5);
    }
}