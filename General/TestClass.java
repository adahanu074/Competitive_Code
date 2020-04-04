/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        ArrayList<Integer> list =new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            int value =sc.nextInt();
            list.add(value);
        }
        int call = sc.nextInt();
        
        String str[] =new String[call];
        
        for(int i=0;i<call;i++)
        {
            str[i]=sc.nextLine();
        }
        
        for(int i=0;i<call;i++)
        {
            if(str[i].contains("Left"))
            {
                int temp = list.get(0);
                list.remove(0);
                list.add(temp);
                
                
            }
            if(str[i].contains("Right"))
            {
                int temp = list.get(list.size()-1);
                list.remove(list.size()-1);
                list.add(0,temp);
            }
            if(str[i].contains("Update"))
            {
                String app[] = str[i].split(" ");
                int pos = Integer.parseInt(app[1]);
                int va = Integer.parseInt(app[2]);
                list.set(pos,va);
            }
           if(str[i].contains("Increment"))
            {
                String app[] =str[i].split(" ");
                int pos = Integer.parseInt(app[1]); 
                list.set(pos,list.get(pos)+1);
            }
            if(str[i].contains("?"))
            {
                String app[] =str[i].split(" ");
                System.out.println(list.get(Integer.parseInt(app[1])));
            }
        }
        System.out.println(list);

    }
}
