public class inversion {
    public static void main(String[] args) {
        int count=0;
        //processing time in order
        int[] p={30,45,25,60,20};

        for(int i=0;i<p.length-1;i++)
        {
            for(int j=i+1;j<p.length;j++)
            {
                //checking condition that how many times earlier provcssing timeis greater than the current
                if(p[i]>p[j])
                {
                        count++;
                        System.out.println("The inversion pairs are:"+(p[i])+","+(p[j]));
                }
            }
        }
        System.out.println("The Inverstion count is:"+count);
    }
}