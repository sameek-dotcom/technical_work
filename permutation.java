import java.util.HashMap;
public class permutation {
    
    public static boolean finding_permutation(String s1,String s2)
    {
        int len1=s1.length();
        int len2=s2.length();
        if(len1>len2)
        {
            return false;
        }
        HashMap<Character,Integer> s1char=new HashMap<>();
        HashMap<Character,Integer> s2char=new HashMap<>();

        for(char c1:s1.toCharArray())
        {
            s1char.put(c1,s1char.getOrDefault(c1, 0)+1);
        }
        for(int i=0;i<len1;i++){
            char s=s2.charAt(i);
            s2char.put(s,s2char.getOrDefault(s,0)+1);
        }
        if(s1char.equals(s2char)){
        return true;
        }
        //slide Window
        for(int i=len1;i<len2;i++)
        {
            char newchar=s2.charAt(i);
            s2char.put(newchar,s2char.getOrDefault(newchar,0)+1);
    
            char oldchar=s2.charAt(i-len1);
            s2char.put(oldchar,s2char.get(oldchar)-1);
            if(s2char.get(oldchar)==0)
            s2char.remove(oldchar);
        
            if(s1char.equals(s2char)){
            return true;
            }
        }
    return false;
}
    public static void main(String[] args) {
        String s2="eidbaaoo";
        String s1="aba";
        System.out.println(finding_permutation(s1, s2));
    }
}



