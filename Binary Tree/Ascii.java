class Ascii
{
   
    class TrieNode
    {
        TrieNode [] children = new TrieNode[26];
        boolean isLast;
        TrieNode()
        {
            for(int i=0;i<26;i++)
            {
                children[i]=null;
            }
            isLast=false;
        }
    }
    public void insert(String key, TrieNode root)
    {
        TrieNode temp = root;
        int len = key.length();
        for(int i=0;i<len;i++)
        {
            int index= key.charAt(i)-'a';
            if(temp.children[index]==null)
            {
                temp.children[index]=new TrieNode();
            }
            temp=temp.children[index];
        }
        temp.isLast = true;
    }

    public boolean search(String key, TrieNode root)
    {
        int len = key.length();
        TrieNode temp = root;
        for(int i=0;i<len;i++)
        {
            int index = (int)(key.charAt(i)-'a');
            if(temp.children[index]==null)
            {
                return false;
            }
            else
            {
                temp = temp.children[index];
            }
        }
        return (temp!=null && temp.isLast==true);
    }
    public static void main(String [] args)
    {
        Ascii node = new Ascii();
        String  arr[] = new String[]{ "the", "a", "there", "answer", "any", "by", "bye", "their" }; 
        Ascii.TrieNode root =node.new TrieNode();
        for(int i=0;i<arr.length;i++)
        {
            node.insert(arr[i],root);
        }
        System.out.println(node.search("a",root));
    }
}


// class Ascii
// {
   
//     static class TrieNode
//     {
//         TrieNode [] children = new TrieNode[26];
//         boolean isLast;
//         TrieNode()
//         {
//             for(int i=0;i<26;i++)
//             {
//                 children[i]=null;
//             }
//             isLast=false;
//         }
//     }
//     public void insert(String key, TrieNode root)
//     {
//         TrieNode temp = root;
//         int len = key.length();
//         for(int i=0;i<len;i++)
//         {
//             int index= key.charAt(i)-'a';
//             if(temp.children[index]==null)
//             {
//                 temp.children[index]=new TrieNode();
//             }
//             temp=temp.children[index];
//         }
//         temp.isLast = true;
//     }

//     public boolean search(String key, TrieNode root)
//     {
//         int len = key.length();
//         TrieNode temp = root;
//         for(int i=0;i<len;i++)
//         {
//             int index = (int)(key.charAt(i)-'a');
//             if(temp.children[index]==null)
//             {
//                 return false;
//             }
//             else
//             {
//                 temp = temp.children[index];
//             }
//         }
//         return (temp!=null && temp.isLast==true);
//     }
//     public static void main(String [] args)
//     {
//         Ascii node = new Ascii();
//         String  arr[] = new String[]{ "the", "a", "there", "answer", "any", "by", "bye", "their" }; 
//         Ascii.TrieNode root = new Ascii.TrieNode();
//         for(int i=0;i<arr.length;i++)
//         {
//             node.insert(arr[i],root);
//         }
//         System.out.println(node.search("a",root));
//     }
// }




// // class Ascii
// // {
   
// //     static class TrieNode
// //     {
// //         TrieNode [] children = new TrieNode[26];
// //         boolean isLast;
// //         TrieNode()
// //         {
// //             for(int i=0;i<26;i++)
// //             {
// //                 children[i]=null;
// //             }
// //             isLast=false;
// //         }
// //     }
// //     static TrieNode root;
// //     public static void insert(String key)
// //     {
// //         TrieNode temp = root;
// //         int len = key.length();
// //         for(int i=0;i<len;i++)
// //         {
// //             int index= key.charAt(i)-'a';
// //             if(temp.children[index]==null)
// //             {
// //                 temp.children[index]=new TrieNode();
// //             }
// //             temp=temp.children[index];
// //         }
// //         temp.isLast = true;
// //     }

// //     public static boolean search(String key)
// //     {
// //         int len = key.length();
// //         TrieNode temp = root;
// //         for(int i=0;i<len;i++)
// //         {
// //             int index = (int)(key.charAt(i)-'a');
// //             if(temp.children[index]==null)
// //             {
// //                 return false;
// //             }
// //             else
// //             {
// //                 temp = temp.children[index];
// //             }
// //         }
// //         return (temp!=null && temp.isLast==true);
// //     }
// //     public static void main(String [] args)
// //     {
// //         // Ascii node = new Ascii();
// //         String  arr[] = new String[]{ "the", "a", "there", "answer", "any", "by", "bye", "their" }; 
// //         root = new TrieNode();
// //         for(int i=0;i<arr.length;i++)
// //         {
// //             insert(arr[i]);
// //         }
// //         System.out.println(search("bye"));
// //     }
// // }