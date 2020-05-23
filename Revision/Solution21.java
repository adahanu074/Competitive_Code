import java.util.*;
class Solution21 {
    public static int wiggleMaxLength(int[] nums) {
        int len = nums.length;
        int visited[] = new int[len];
        int result[] = new int[len];
        Arrays.fill(result,1);
        Arrays.fill(visited,0);
        // visited[0]=false;
        if(len<2)
        {
            return len;
        }
        else
        {
        for(int i=1;i<len;i++)
        {
            for(int j=0;j<i;j++){
                
                if(j==0)
                {
                    if(nums[i]==nums[j])
                    {
                        visited[i]=visited[j];
                    }
                    else
                    {
                        if(nums[i]<nums[j])
                        {
                            visited[i]=-1;
                        }
                        else
                        {
                            visited[i]=1;
                        }
                        result[i]=result[j]+1;
                    }
                }
                else
                {
                    if(nums[i]==nums[j])
                    {
                        System.out.println("*******");
                        visited[i]=visited[j];
                        result[i]=result[j];
                    }
                    else
                    {
                        if(nums[i]>nums[j] && visited[j]<=0)
                        {
                            System.out.println("sameeee");
                            if((result[j]+1)>result[i])
                            {
                                
                                result[i]=result[j]+1;
                                visited[i]=1;
                                System.out.println(nums[j]+"  "+nums[i]+"////////" + result[i]);
                            }
                            // else
                            // {
                            //     System.out.println("sameeee");
                            //     result[i]=result[j];
                            //     visited[i]=visited[j];
                            // }
                            
                        }
                        else if(nums[i]<nums[j] && visited[j]>=0)
                        {
                            System.out.println("sameeee");
                            if((result[j]+1)>result[i])
                            {
                               
                                result[i]=result[j]+1;
                            visited[i]=-1;
                            System.out.println(nums[j]+"  "+nums[i] + "*****" + result[i]);
                            }
                            // else
                            // {
                            //     System.out.println("faaameeee");
                            //     result[i]=result[j];
                            //     visited[i]=visited[j];
                            // }
                        }
                        else
                        {
                            System.out.println("lammeeeee");
                            if(result[i]<result[j])
                            System.out.println("GAMeeee");
                                result[i]=result[j];
                            visited[i]=visited[j];
                        }
                        
                    }
                    
                }
            }
        }
            
        }
        System.out.println(Arrays.toString(result));
         System.out.println(Arrays.toString(visited));
            return result[nums.length-1];
    }
    public static void main(String [] args)
    {
        int arr[] = new int[]{3,3,3,2,5};
        wiggleMaxLength(arr);
    }
}