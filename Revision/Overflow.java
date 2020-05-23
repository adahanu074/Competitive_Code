import java.util.*;
class Overflow {
    public static int minFallingPathSum(int[][] arr) {
        int min =Integer.MAX_VALUE;
        int row = arr.length;
        if(row==0)
        {
            return 0;
        }
        else
        {
            int col = arr[0].length;
            for(int i =1;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    int temp_min = Integer.MAX_VALUE;
                    for(int k=0;k<col;k++)
                    {
                        if(j!=k)
                        {
                            temp_min = Math.min(temp_min,arr[i-1][k]);
                        }
                    }
                    arr[i][j]=arr[i][j]+temp_min;
                    // arr[i][j]=arr[i][j]+Math.min(left,right);
                }
            }
            for(int i=0;i<col;i++)
            {
                min = Math.min(arr[row-1][i],min);
            }
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            return min;
        }
    }
    public static void main(String [] args)
    {
        // int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
    //     int arr[][] = {{-73,61,43,-48,-36},
    //                     {3,30,27,57,10},
    //                     {96,-76,84,59,-15},
    //                     {5,-49,76,31,-7},
    //                     {97,91,61,-46,67}};
    // minFallingPathSum(arr);
    Queue<Integer> queue = new PriorityQueue<>();
    queue.add(1);
    queue.add(10);
    queue.add(5);
    queue.add(0);
    queue.add(-3);
    System.out.println(queue);
    System.out.println(queue.poll());
    }
}