import java.util.*;
import java.io.*;
import java.lang.*;

public class create{

    private List<Integer> heap;
    public Maxheap(){
        heap = new ArrayList<>();
    }
    private void heapify(int index){
        int size = heap.size();
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        if (left < size && heap.get(left) > heap.get(largest)){
            largest = left;
        }
        if (right < size && heap.get(right) > heap.get(largest)){
            largest = right;
        }
        if (largest != index){
            Collections.swap(heap, index, largest);
            heapify(largest);
        }

    }
    public void insert(int value){
        heap.add(value);
        int size = heap.size();
        //re heapify fro bottom to top
        for(int i = size / 2 - 1; i >= 0; i--){
            heapify(i);
        }


    }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    MaxHeap maxheap = new MaxHeap();
    System.out.println("Enter a number to insert into the max-heap:");
    int n =sc.nextInt();
    for (int i=0;i<n;i++){
        System.out.println("Enter value "+ (i+1) + ":");
        int value = sc.nextInt();
        maxheap.insert(value);
    }
        Maxheap maxheap = new Maxheap();
        maxheap.insert(10);
        maxheap.insert(20);
        maxheap.insert(5);
        maxheap.insert(30);
        System.out.println(maxheap.heap); // Output should be a valid max-heap
    
  }
}