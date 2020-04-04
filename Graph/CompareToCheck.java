import java.util.*;
public class CompareToCheck
{
    public static void main(String [] args)
    {
        int arr[]=new int[]{1,2,3};
        int arr1[] = new int[]{2,4,1};
        int arr2[] = new int[]{1,3,2};
        ArrayList<Integer> list = new ArrayList(Arrays.asList(1,2,3));
        ArrayList<Integer> list1 =  new ArrayList(Arrays.asList(2,4,1));
        ArrayList<Integer> list2 =  new ArrayList(Arrays.asList(1,3,2));
        ArrayList<ArrayList<Integer>> lis = new ArrayList<ArrayList<Integer>>();
        lis.add(list);
        lis.add(list1);
        lis.add(list2);
        Collections.sort(lis, new Comparator<ArrayList<Integer>> (){
            public int compare(ArrayList<Integer> li, ArrayList<Integer> li1)
            {
                // System.out.println(li);
                // return (li.get(2)).compareTo(li1.get(2));
                if(li.get(2) < li1.get(2))
                {
                    return -1;
                }
                else if(li.get(2)>li1.get(2))
                {
                    return 1;
                }
                else
                {
                    return 0;
                }
            }
        });
        System.out.println(lis);
    }
}