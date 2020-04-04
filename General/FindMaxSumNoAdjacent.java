class FindMaxSumNoAdjacent
{
    public static int sumForAdjacent(int arr[])
    {
        int include=arr[0];
        int exclude = 0;
        for(int i=1;i<arr.length;i++)
        {
            int exclu = Math.max(include,exclude);
            include = exclude+arr[i];
            exclude = exclu;
        }
        return Math.max(include,exclude);
    }
    public static void main(String [] args)
    {
        int arr[] =new int[]{5, 5, 10, 100, 10, 5};

        System.out.println(sumForAdjacent(arr));
    }
}