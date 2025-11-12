import java.util.PriorityQueue;
public class pq{
   static class Student implements Comparable<Student>{
    String name;
    int rank;
    public Student(String name, int rank){
        this.name = name;
        this.rank = rank;
    }
    @Override
    public int compareTo(Student other){
        return this.rank - other.rank; // Ascending order based on rank
     }
    @Override
    public String toString(){
        return "{name='" + name + "', rank=" + rank + "}";
    }

   }


    public static void main(String[] args) {
        // use for reverse order
       // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("Alice", 2));
        pq.add(new Student("Bob", 1));
        pq.add(new Student("Charlie", 3));
        pq.add(new Student("David", 0));

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

    }
}