import java.util.*;
class InsertionInBinaryTree
{
    static class Node{
        int key;
        Node left,right;
        Node(int key)
        {
            this.key=key;
            left=null;
            right = null;
        }
    }
    static Node root;
    static Node temp = root;
    static void inorder(Node temp)
    {
        if(temp==null)
        {
            return;
        }
        else
        {
            inorder(temp.left);
            System.out.println(temp.key + "  ");
            inorder(temp.right);
        }
    }

    public static void insert(Node temp , int key)
    {
        Queue<Node> queue = new LinkedList<>();
        queue.add(temp);

        while(!queue.isEmpty())
        {
            Node tempo = queue.remove();
            if(tempo==null)
            {
                tempo = new Node(key);
                break;
            }
            if(tempo.left==null)
            {
                tempo.left= new Node(key);
                break;
            }
            else{
                queue.add(tempo.left);
            }
            if(tempo.right==null)
            {
                tempo.right = new Node(key);
                break;
            }
            else
            {
                queue.add(tempo.right);
            }
        }
    }

    public static void main(String[] args) {
        root = new Node(10);
        root.left = new Node(11); 
        root.left.left = new Node(7); 
        root.right = new Node(9); 
        root.right.left = new Node(15); 
        root.right.right = new Node(8); 
       
        System.out.print( "Inorder traversal before insertion:"); 
        inorder(root); 
       
        int key = 12; 
        insert(root, key); 
       
        System.out.print("\nInorder traversal after insertion:"); 
        inorder(root); 

        System.out.println(temp.key);
    }
}