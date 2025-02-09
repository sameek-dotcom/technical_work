public class Ratings
{
    public static void main(String args[])
    {
        double value=0;
        double[] max_sales={9.6,10.6,9.6,4.6,10.6};
        int count=0;

        for(int i=0;i<max_sales.length;i++)
        {
            int count1=0;
            for(int j=0;j<max_sales.length;j++)
            {
                if(max_sales[i]==max_sales[j])
                {
                    count1++;
                }
            }
        if(count1>count)
        {
            count=count1;
            value=max_sales[i];
        }
    }   
    System.out.println("Count is:"+count);
    System.out.println("Ratings is:"+value);
    }
}
