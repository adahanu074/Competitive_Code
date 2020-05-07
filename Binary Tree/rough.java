public int find(int[] numbers, int maxGap) {
    int best = 0;
    Queue<Integer> min = new LinkedList<>();
    Queue<Integer> max = new LinkedList<>();
    int start=0;
    int end = 0;
    int beststart=0;
    int bestend = 0;
    while(end<numbers.length)
    {
        int x = numbers[end];

        while(!min.isEmpty() && x<=numbers[min.peekLast()])
        {
            min.removeLast();
        }
        min.add(end);
        while(!max.isEmpty() && x>=numbers[max.peekLast()])
        {
            max.removeLast();
        }
        max.add(end);
        int minVal = numbers[min.peekFirst()];
        int maxVal = numbers[max.peekFirst()];
        if(maxVal-minVal>maxGap)
        {
            start++;
            if(start>min.peekFirst())
            {
                min.removeFirst();
            }
            if(start>max.peekFirst())
            {
                max.removeFirst();
            }
        }
        else
        {
            if(end-start+1>best)
            {
                best=end-start+1;
                beststart=start;
                bestend = end;
            }
            end++;
        }
    }
}