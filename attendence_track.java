
import java.util.HashMap;
public class attendence_track {
    public static void tracking(String[] keys,int[] values){
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<keys.length;i++)
        {
            map.put(keys[i],map.getOrDefault(keys[i],0)+values[i]);
        }
        System.out.println((map.get("karan")+1));
        System.out.println(map);
    }
    public static void main(String[] args) {
        String[] keys={"mohan","vidya","girish","karan","vidya","mohan"};
        int[] values={4,6,7,2,4,8};
        System.out.println("Attendence tracking:");
        tracking(keys,values);
    }
}


