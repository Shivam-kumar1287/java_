import java.util.ArrayList;

public class insert {
  static  class Heap{
    ArrayList<Integer> arr=new ArrayList<>();
    public void add(int data){
        arr.add(data);
    }
    int x=arr.size()-1;//x is child index
    int par=(x-1)/2 ;//par index
    while(arr.get(x) < arr.get(par)){
    int temp=arr.get(x);
    arr.set(x,arr.get(par));
    arr.set(par,temp);

    } 

  }  


    public static void main(String[] args) {
        
    }
}

