class Node{
    char data;
    Node left,right;
    Node(char data)
    {
        this.data = data;
        left=null;
        right = null;
    }
}
class ConstructTreePreIn
{
    Node root;
    int preIndex = 0;
    Node buildTree(char in[], char pre[],int start, int end)
    {
        if(start>end)
        {
            return null;
        }
        Node tnode = new Node(pre[preIndex]);
        preIndex++;
        if(start==end)
        {
            return tnode;
        }
        int index = search(in,start,end,tnode.data);

        tnode.left = buildTree(in,pre,start,index-1);
        tnode.right = buildTree(in,pre,index+1,end);

        return tnode;

    }
    public int search(char in[], int start,int end, char value)
    {
        int i;
        for(i=start;i<=end;i++)
        {
            if(in[i]==value)
            {
                return i;
            }
        }
        return i;
    }
    public void printInorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        else
        {
            printInorder(root.left);
            System.out.print(root.data);
            printInorder(root.right);
        }
    }
    public static void main(String args[]) 
    { 
        ConstructTreePreIn tree = new ConstructTreePreIn(); 
        char in[] = new char[] { 'D', 'B', 'E', 'A', 'F', 'C' }; 
        char pre[] = new char[] { 'A', 'B', 'D', 'E', 'C', 'F' }; 
        int len = in.length; 
        Node root = tree.buildTree(in, pre, 0, len - 1); 
  
        // building the tree by printing inorder traversal 
        System.out.println("Inorder traversal of constructed tree is : "); 
        tree.printInorder(root); 
    } 
}