public class MaxXorPair
{
    static class TrieNode
    {
        TrieNode left;
        TrieNode right;
        TrieNode()
        {
            left =null;
            right = null;
        }
    }
    static TrieNode root;

    public static void insert(int value){
        TrieNode node = root;
        for(int i=31;i>=0;i--)
        {
            int val = (value>>i)&1;
            if(val==0)
            {
                if(node.left==null)
                {
                    node.left = new TrieNode();
                }
                node = node.left;
            }
            else
            {
                if(node.right==null)
                {
                    node.right = new TrieNode();
                }
                node = node.right;
            }
        }
    }
        public static int findMaxXorPair(int arr[] , int n)
        {
            int max_xor = Integer.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                int value = arr[i];
                int curr_xor = 0;
                TrieNode curr = root;
                for(int j=31;j>=0;j--)
                {
                    int val = (value>>j)&1;
                    if(val==1)
                    {
                        if(curr.left!=null)
                        {
                            curr_xor += (int)(Math.pow(2,j));
                            curr = curr.left;
                        }
                        else{
                            curr=curr.right;
                        }
                    }
                    else{
                        if(curr.right!=null)
                        {
                            curr_xor +=(int)(Math.pow(2,j));
                            curr = curr.right;
                        }
                        else{
                            curr = curr.left;
                        }
                    }
                }
                if(curr_xor>max_xor)
                {
                    max_xor= curr_xor;
                }
            }
            return max_xor;
        }

        public static void main(String [] args)
        {
            // root = new TrieNode();
            // int arr[] = new int[]{4, 6};
            // for(int i=0;i<arr.length;i++)
            // {
            //     insert(arr[i]);
            // }
            // System.out.println(findMaxXorPair(arr,arr.length));
            double m = 0.5;
            System.out.println(Math.ceil(m));
        }
}