import java.util.HashSet;
public class duplicate {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,4,4,5};
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr){
            if(!set.contains(i)){
                set.add(i);
            }
        }
        System.out.println("The number of unique elements is: "+set.size());
        for(int i:set){
            System.out.print(i+" ");
        }
    }
}
