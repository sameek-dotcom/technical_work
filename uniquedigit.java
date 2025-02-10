import java.util.Arrays;
import java.util.HashMap;
public class uniquedigit
{
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int digit[]={99,00,0,16,558,637,222,1};
        
        for(int num:digit)
        {
            //to take 0 as a unique digit
            int onum=num%10;
            map.put(onum, 1);
            //to take unique digit and tput that to hashmap
            while(num>0)
            {
                int rem=num%10;
                num/=10;
                map.put(rem, 1);
                
            }
        }
        int uniquedigit[]=new int[map.size()];
        int index=0;
        //adding value which is stored in key to another array
        for(Integer key:map.keySet()){
           uniquedigit[index++]=key;
        }
        System.out.println("Unique digits:"+Arrays.toString(uniquedigit));
    }
}

