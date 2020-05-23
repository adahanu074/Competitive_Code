import java.util.*;
class Solution99 {
    public static boolean validTicTacToe(String[] board) {
        char [][] result =new char[3][3];
        int countx= 0;
        int counto = 0;
         Set<String> setx = new HashSet<>();
         HashMap<String ,Integer> mapx = new HashMap<>();
         HashMap<String,Integer> mapo = new HashMap<>();
          Set<String> sety = new HashSet<>();
        for(int i=0;i<3;i++)
        {
            String str = board[i];
            for(int j=0;j<3;j++)
            {
                result[i][j]=str.charAt(j);
                if(str.charAt(j)=='X')
                {
                    countx++;
                    String row = "String X at "+ i + "row";
                    String col = "String X at "+ j + "col";
                    String mix = "String X at "+ i + "row" + j + "col";
                    
                    if(mapx.containsKey(row))
                    {
                        mapx.put(row,mapx.get(row)+1);
                    }
                    else
                    {
                        mapx.put(row,1);
                    }
                    if(mapx.containsKey(col))
                    {
                        mapx.put(col,mapx.get(col)+1);
                    }
                    else
                    {
                        mapx.put(col,1);
                    }
                    if(mapx.containsKey(mix))
                    {
                        mapx.put(mix,mapx.get(mix)+1);
                    }
                    else
                    {
                        mapx.put(mix,1);
                    }
                }
                if(str.charAt(j)=='O')
                {
                    counto++;
                    String row = "String O at "+ i + "row";
                    String col = "String O at "+ j + "col";
                    String mix = "String O at "+ i + "row" + j + "col";
                    
                    if(mapo.containsKey(row))
                    {
                        mapo.put(row,mapo.get(row)+1);
                    }
                    else
                    {
                        mapo.put(row,1);
                    }
                    if(mapo.containsKey(col))
                    {
                        mapo.put(col,mapo.get(col)+1);
                    }
                    else
                    {
                        mapo.put(col,1);
                    }
                    if(mapo.containsKey(mix))
                    {
                        mapo.put(mix,mapo.get(mix)+1);
                    }
                    else
                    {
                        mapo.put(mix,1);
                    }
                }
            }
        }
        if(countx<counto)
        {
            return false;
        }
        int flagx= 0;
        int flago = 0;
        System.out.println(mapx);
        System.out.println(mapo);      
        for(Map.Entry<String,Integer> map:mapx.entrySet())
        {
            int value = map.getValue();
            if(value>=3)
            {
                flagx=1;
            }
        }
        for(Map.Entry<String,Integer> map:mapo.entrySet())
        {
            int value = map.getValue();
            if(value>=3)
            {
                flago=1;
            }
        }
        if(flagx==1)
        {
            if(countx>=counto)
            {
                return false;
            }
        }
        if(flago==1)
        {
            if(counto<countx || counto>countx)
            {
                return false;
            }
        }
        return true;    
    }
    public static void main(String [] args)
    {
        // String arr[] = new String[]{"XOX","O O","XOX"};
        //     System.out.println(validTicTacToe(arr));
        ArrayList<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        ArrayList<Integer> list1 =new ArrayList<>(list);
        list.clear();
        System.out.println(list1);
    }
}