 class PivotElement
 {
    public static int findPivot(int arr[],int start, int end)
    {
        if(start<=end)
        {
        int mid = (start+end)/2;
        if(arr[mid]<arr[mid-1])
        {
            System.out.println("hellelele");
            return mid;
        }
        else if(arr[mid]>=arr[start])
        {
            return findPivot(arr,mid+1,end);
        }
        else{
            return findPivot(arr,start,mid-1);
        }  
    }
    else{
        return -1;
    }

    } 
    public static void main(String [] args)
     {
         int arr[] = new int[]{50,40,20,10};
         if(arr[0]<arr[arr.length-1])
         {
             System.out.println("0");
         }
         else
         System.out.println(findPivot(arr,0,arr.length-1));
     }
 }