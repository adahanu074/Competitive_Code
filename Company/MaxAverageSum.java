class MaxAverageSum
{
    public static void main(String [] args)
    {
        int arr[] =  new int[]{11,-8,16,-7,24,-2,3};
        int j=0;
        int sum=0;
        int max =0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            if((i-j+1)==3)
            {
                if(sum>max)
                {
                    max=sum;
                }
                sum=sum-arr[j];
                j++;
            }
        }
        System.out.println(max);

    }
}