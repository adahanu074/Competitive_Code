import java.util.*;
class LRUCache {
    HashMap<Integer,Integer> map;
    ArrayList<Integer> queue;
    int size=0;
    public LRUCache(int capacity) {
        map = new HashMap<Integer,Integer>();
        queue = new ArrayList<Integer>();
        size = capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            queue.remove(new Integer(key));
            queue.add(key);
            System.out.println(queue+"******");
            System.out.println(map+"///////////");
            return map.get(key);
        }else
        {
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(queue.size()==size)
        {
            if(map.containsKey(key))
            {
                queue.remove(new Integer(key));
                queue.add(key);
                map.put(key,value);
                System.out.println(queue+"******");
            System.out.println(map+"///////////");
            }
            else
            {
                int val =queue.get(0); 
                queue.remove(0);
                map.remove(val);
                map.put(key,value);
                System.out.println(queue+"******");
            System.out.println(map+"///////////");
                
            }
        }
        else
        {
        if(map.containsKey(key)){
            queue.remove(new Integer(key));
            queue.add(key);
            map.put(key,value);
            System.out.println(queue+"******");
            System.out.println(map+"///////////");
        }
            else
            {
                queue.add(key);
                map.put(key,value);
                System.out.println(queue+"******");
            System.out.println(map+"///////////");
            }
        }
    }
    public static void main(String [] java)
    {
        LRUCache obj = new LRUCache(2);
        obj.put(1,1);
        obj.put(2,2);
        System.out.println(obj.get(1));
        obj.put(3,3);
        System.out.println(obj.get(2));
        obj.put(4,4);
        System.out.println(obj.get(1));
        System.out.println(obj.get(3));
        System.out.println(obj.get(4));
    }
}
