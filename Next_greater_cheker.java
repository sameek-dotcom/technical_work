import java.util.Arrays;
public class Next_greater_cheker{
    public static int finding_greater(int[] arr,int start)
    {
        //base condition
        if(start==arr.length-1)
        return -1;
        //recursive call to find next gratere element
        finding_greater(arr, start+1);
        for(int i=start+1;i<arr.length;i++)
        {
            if(arr[i]>arr[start]){
            return arr[i];
            }
        }  
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        //int[] arr = {10, 20, 30, 50};
        int[] result =new int[arr.length];
        int start=0;
        //printing the elements in format
        for(int i=start;i<arr.length;i++){
            result[i]=finding_greater(arr,i);
        }
        System.out.println(Arrays.toString(result));
    }
}
