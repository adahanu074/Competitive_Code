class Mini {
    public int search(int nums[],int start,int end, int target)
    {
        if(start<=end)
        {
            int mid = (start+end)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]<target)
            {
                return search(nums,mid+1,end,target);
            }
            else
            {
                return search(nums,start,mid-1,target);
            }
        }
        return -1;
    }
    public int pivot(int nums[],int start,int end)
    {
        if(start<end)
        {
            int mid = (start+end)/2;
            if(nums[mid]>nums[mid+1])
            {
                return mid+1;
            }
            if(nums[mid]<nums[mid-1])
            {
                return mid;
            }
            else if(nums[mid]>nums[start])
            {
                return pivot(nums,mid+1,end);
            }
            else
            {
                return pivot(nums,start,mid-1);
            }
        }
        return start;
    }
    public int search(int[] nums, int target) {
        int value =-1;
        int n = nums.length-1;
        if(nums.length==0)
        {
            return value;
        }
        if(nums[0]<nums[n])
        {
            value = search(nums,0,n,target);
        }
        else
        {
            int pivo = pivot(nums,0,n);
            System.out.println(pivo);
            // // if(nums[pivo]==target)
            // // {
            // //     value=pivo;
            // // }
            if(target>=nums[pivo] && target<=nums[n])
            {
                System.out.println("pivo");
                value = search(nums,pivo,n,target);
            }
            else
            {
                value = search(nums,0,pivo-1,target);
            } 
        }
        return value;
    }
    public static void main(String [] args)
    {
        int arr[] = new int[]{5,1,3};
        Mini min = new Mini();
        int val = min.search(arr,3);
        System.out.println(val);
    }
}