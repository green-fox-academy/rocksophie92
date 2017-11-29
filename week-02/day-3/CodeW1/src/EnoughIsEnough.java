import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EnoughIsEnough {

    public static void main(String[] args) {
        deleteNth(, 2);
    }
    public static int[] deleteNth ( int[] elements, int maxOcurrences){
        int i, j = 0;
        Set<Integer> set = new HashSet<Integer>();

        for (i = 0; i < elements.length; i++) {
            set.add(elements[i]);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        return null;
    }
}