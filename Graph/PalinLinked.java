import java.util.*;
class PalinLinked
{
    public static void main(String [] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        ArrayList<Integer> list1 = new ArrayList();
        for(int i=list.size()-1;i>=0;i--)
        {
            list1.add(list.get(i));
        }
        System.out.println(list1);
        System.out.println(list);
        
    }
}