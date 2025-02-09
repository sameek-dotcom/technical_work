public class prefixsumcount {
    public static void main(String args[]) {
        int[] sales={10, 20, 15, 30, 25};
        int[] prefixsum=new int[sales.length];
        prefixsum[0]=sales[0];
        for(int i=1;i<sales.length;i++)
        {
            prefixsum[i]=prefixsum[i-1]+sales[i];
        }
        System.out.print("Prefix sum is: [");
        for (int i=0; i<prefixsum.length;i++) 
        {
            System.out.print(prefixsum[i]); 
            if (i<prefixsum.length-1) 
            {
                System.out.print(",");
            }
        }
        System.out.println("]"); 
    }
}