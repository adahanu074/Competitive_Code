class Cheeeck
{
    public static void main(String [] args)
    {
        int arr[] = new int[]{1,2,3,4,5};
        int l = 1;
        int r = 4;
        System.out.println(l^1);
        int one =arr[++l];
        System.out.println(one);
        // arr[l>>1] = arr[l]+arr[l^1];
        System.out.println(l+"    "+r);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}