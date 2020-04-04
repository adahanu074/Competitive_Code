class MatrixDiagonal
{
    public static void main(String [] args)
    {
        int arr[][] = new int[][]{{1,2,3,4,5},
                                   {6,7,8,9,10},
                                   {11,12,13,14,15},
                                   {16,17,18,19,20},
                                   {16,17,18,19,20},
                                   {16,17,18,19,20}};
                                   
        // for(int i=0;i<arr.length;i++)
        // {
        //     int start=i;
        //     for(int j=0;j<=Math.min(arr[i].length,i);j++)
        //     {
        //         System.out.print(arr[start][j] + "  ");
        //         start--;
        //     }
        //     System.out.println();
        // }
        // for(int j=1;j<arr[0].length;j++)
        // {
        //     int end =j;
        //     for(int i=arr.length-1;i>=j-1;i--)
        //     {
        //         System.out.print(arr[i][end]+"  ");
        //         end++;
        //     }

        //     System.out.println();
        // }
        for(int i=0;i<arr.length;i++)
        {
            int start=i;
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j] + "  ");

            }
            System.out.println("\n");
        }
    }
}