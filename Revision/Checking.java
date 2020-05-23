import java.util.*;
class Checking
{
    public static void main(String [] args)
    {
        // List<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // List<Integer> list1 = new ArrayList<>(list);
        // list.remove(0);
        // System.out.println(list1);
        // System.out.println(list);
        int num []= new int[]{1,2,3,3};
        List<Integer> list =new ArrayList<Integer>(Arrays.asList((Integer)(num)));
        System.out.println(list);
    }
}