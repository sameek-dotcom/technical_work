import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
public class removing_nth_node {
    public static void remove_node(List<Integer> num,int n)
    {
               num.remove(num.size()-n);
        }
     public static void main(String args[]) {
        List<Integer> num=new LinkedList<>(Arrays.asList(1,2));
        int n=1;
        remove_node(num,n);
        System.out.println(num);
    }
}
