package numberques;
import java.util.*;

public class sunny {
    public static void main(String[] args) {
        int n = 100;

        for(int i=1;i<n;i++)
        if (Math.sqrt(i + 1) % 1 == 0) {
            System.out.print(i+" ");
        }
    }
}
