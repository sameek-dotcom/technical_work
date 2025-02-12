import java.util.LinkedHashMap;
public class find_unique
{
    public static void finding_unique(String word)
    {
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        //loop for go throw each character from a string
        for(Character ch:word.toCharArray())
        {
            map.putIfAbsent(ch, 1);
        }
        //print the unique characters stored in the LinkedHashMap
        for(Character key:map.keySet()){
        System.out.print(key);
        }
    }
    public static void main(String[] args) {
        String word="banana";
        finding_unique(word);
    }
}