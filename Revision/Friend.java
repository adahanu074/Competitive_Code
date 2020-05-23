import java.util.*;
class Friend
{
    // static int max =0;
    // public static int jump(int count)
    // {
    //     max ++;
    //     return count;
    // }
    public static void main(String[] arg)
    {
    //     int a = 5;
    //     char b = Character.forDigit(a,10);
        
    //     for(int i=0;i<2;i++)
    //     {
    //     max=0;
    //     jump(0);
    //     System.out.println(max);
    //     }
    // }
    // int min=Integer.MAX_VALUE;
    // int sum = 0;
    // void getMiimal(TreeNode root)
    // {
    //     if(root==null)
    //     {
    //         return 0;
    //     }
    //     else
    //     {
    //         sum = sum+root.val;
    //         int li = getMiimal(root.left);
    //         int ri = getMiimal(root.right);
    //         min = Math.min(sum,min);
    //         return sum-root.val;
            int nums[] =new int[]{1,3,4,8,9,10,4,6,7,9,9};
            int arr[]= new int[nums.length];
            Arrays.fill(arr,Integer.MAX_VALUE);
            // int k=2;
            arr[0]=0;
            for(int j=1;j<nums.length;j++)
            {
                for(int i=0;i<j;i++)
                {
                  if((j-i)<=nums[i])
                  {
                      arr[j]=Math.min(arr[j],arr[i]+1);
                  }
                }
            }
            System.out.println(Arrays.toString(arr));
    }
}

