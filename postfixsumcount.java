public class postfixsumcount {
        public static void main(String args[]) {
            int[] fuel={5,10,3,7,8};
            int[] postfix=new int[fuel.length];
            postfix[fuel.length-1]=fuel[fuel.length-1];
            for(int i=fuel.length-2;i>=0;i--)
            {
                postfix[i]=postfix[i+1]+fuel[i];
            }
            System.out.print("Postfix sum is: [");
            for (int i=0; i<postfix.length;i++) 
            {
                System.out.print(postfix[i]); 
                if (i<postfix.length-1) 
                {
                    System.out.print(",");
                }
            }
            System.out.println("]"); 
        }
    }

