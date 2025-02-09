public class date 
{
        public static void main(String[] args) 
        {
            int[] sales = {120, 340, 290, 500, 100, 700, 600};
            int maxSales = sales[0];
            int maxDay = 0;
            for (int i=1; i<sales.length;i++) 
            {
                if (sales[i]>maxSales) 
                {
                    maxSales=sales[i];
                    maxDay=i;
                }
            }
        
        }
    }
 

