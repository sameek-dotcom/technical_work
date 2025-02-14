import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;
public class palindrome_list {
    public static boolean ispalindrome(List<Integer> mylist)
    {
        if(mylist==null ||mylist.isEmpty())
        {
            return true;
        }
        int left=0;
        int right=0;
        while(right<mylist.size() && right+1<mylist.size())
        {
            left++;
            right+=2;
        }
        List<Integer> secondhalf=new LinkedList<>(mylist.subList(left+1,mylist.size()));
        Collections.reverse(secondhalf);
        for(int i=0;i<secondhalf.size();i++)
        {
            if(!mylist.get(i).equals(secondhalf.get(i)))
            return false;
        }

        return true;
    }
    public static void main(String[] args) {
        List<Integer> mylist=new LinkedList<>(Arrays.asList(1,2,1,3,4,3,2,1));
        System.out.println(ispalindrome(mylist));
    }
}

