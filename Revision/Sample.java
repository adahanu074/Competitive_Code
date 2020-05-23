import java.util.*;

public class Sample
{
    static class Prio implements Comparable<Prio>
{
    int x;
    int y;
    int h;
    Prio(int x,int y, int h)
    {
        this.x=x;
        this.y=y;
        this.h=h;
    }
    public int compareTo(Prio pri)
    {
        if(this.x<pri.x)
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }
}
    
    public static void main(String[] args)
    {
        Queue<Prio> que = new PriorityQueue<>();
        Prio p = new Prio(5,2,4);
        Prio p1 = new Prio(9,2,5);
        Prio p2 = new Prio(3,1,2);
        Prio p3 = new Prio(10,7,8);
        que.add(p);
        que.add(p1);
        que.add(p2);
        que.add(p3);

        for(Prio pi:que)
        {
            System.out.println(pi.x +" "+pi.y+"  "+pi.h);
        }
        Prio per = que.remove();
        System.out.println(per.x+"  "+per.y+"  "+per.h+"*************");
        for(Prio pi:que)
        {
            System.out.println(pi.x +" "+pi.y+"  "+pi.h);
        }
    }
}