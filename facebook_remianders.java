import java.util.HashMap;
public class facebook_remianders {
    public static void tracking_rem(String[] keys,String[] values){
        HashMap<String,String> map=new HashMap<>();
        for(int i=0;i<keys.length;i++)
        {
            if(map.containsKey(keys[i]))
            {
                 map.put(keys[i],map.get(keys[i])+","+values[i]);
             }
             else
            {
                 map.put(keys[i],values[i]);
             }
        }
        System.out.print("Reminders for 02/03: ");
        System.out.println(map.get("02/03"));
        System.out.println(map);
    }
    public static void main(String[] args) {
        String[] keys={"02/03","05/03","06/09","02/03","01/05","06/03"};
        String[] values={"hi heera","iam a professor"," iam from raj group of institutes","iam from bengaluru.","wish me good luck","hey you are a good player"};
        System.out.println("Facebook remianders:");
        tracking_rem(keys,values);
    }
}
