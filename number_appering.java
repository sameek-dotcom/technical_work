import java.util.HashMap;
public class number_appering {
    public static void appearence(String str)
    {
        HashMap<String,Integer> map=new HashMap<>();
        //to covert uppercase letters to lowercase
        String word=str.toLowerCase();
        //to sperate the string into words 
        String[] words=word.split(" ");
        for(String w:words)
        {
            //to put word and their count into hashmap
            map.put(w,map.getOrDefault(w,0)+1);
        }
        //to print the hashmap with the their word count
        System.out.print(map);
    }
    public static void main(String[] args) {
        String str="The cat AND the hat";
        appearence(str);
    }
}
