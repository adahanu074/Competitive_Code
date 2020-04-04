public class Segregate01
{
    public static void segregate(int arr[])
    {
        int low=0;
        int mid=0;
        for(mid =0;mid<arr.length;mid++)
        {
            if(arr[mid]==0)
            {
                int temp = arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
            }
            // else
            // {
            //     continue;
            // }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String [] args)
    {
       int arr [] ={ 0, 1, 0,1,1,1,1,1,0, 1,0,0,0,0,1,0,1, 1, 1 }; 
       segregate(arr);
    }
}