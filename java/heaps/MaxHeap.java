import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxHeap {
    private List<Integer> heap;

    public MaxHeap() {
        heap = new ArrayList<>();
    }

    // Insert a new element into the heap
    public void insert(int val) {
        heap.add(val);
        int index = heap.size() - 1;
        int parent = (index - 1) / 2;

        // Bubble up (swap with parent while greater)
        while (index > 0 && heap.get(index) > heap.get(parent)) {
            Collections.swap(heap, index, parent);
            index = parent;
            parent = (index - 1) / 2;
        }
    }

    // Heapify a subtree at index i
    private void heapify(int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int size = heap.size();

        if (left < size && heap.get(left) > heap.get(largest)) {
            largest = left;
        }
        if (right < size && heap.get(right) > heap.get(largest)) {
            largest = right;
        }

        if (largest != i) {
            Collections.swap(heap, i, largest);
            heapify(largest);
        }
    }

    // Delete a specific value from heap
    public void delete(int val) {
        int s = heap.size();
        int index = heap.indexOf(val);

        if (index == -1) {
            System.out.println("Value not found");
            return;
        }

        // Swap with last element and remove
        Collections.swap(heap, index, s - 1);
        heap.remove(s - 1);

        // Rebuild heap property
        for (int i = s / 2 - 1; i >= 0; i--) {
            heapify(i);
        }
    }

    // Perform Heap Sort (without destroying original heap)
    public List<Integer> heapSort() {
        List<Integer> tempHeap = new ArrayList<>(heap);
        List<Integer> sorted = new ArrayList<>();

        int n = tempHeap.size();
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapifyForSort(tempHeap, i, n);
        }

        for (int i = n - 1; i >= 0; i--) {
            Collections.swap(tempHeap, 0, i);
            sorted.add(0, tempHeap.get(i)); // add smallest to front (ascending order)
            heapifyForSort(tempHeap, 0, i);
        }

        return sorted;
    }

    // Separate heapify for sorting
    private void heapifyForSort(List<Integer> arr, int i, int n) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr.get(left) > arr.get(largest)) {
            largest = left;
        }
        if (right < n && arr.get(right) > arr.get(largest)) {
            largest = right;
        }

        if (largest != i) {
            Collections.swap(arr, i, largest);
            heapifyForSort(arr, largest, n);
        }
    }

    // Print heap
    public void printHeap() {
        System.out.println(heap);
    }

    // Test
    public static void main(String[] args) {
        MaxHeap h = new MaxHeap();
        h.insert(10);
        h.insert(30);
        h.insert(20);
        h.insert(5);
        h.insert(40);

        System.out.print("Heap: ");
        h.printHeap();

        h.delete(20);
        System.out.print("After deleting 20: ");
        h.printHeap();

        List<Integer> sorted = h.heapSort();
        System.out.println("Heap Sort result: " + sorted);
    }
}
