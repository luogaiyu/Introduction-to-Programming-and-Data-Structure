package chapter_19;
import java.util.ArrayList;
import java.util.Collections;

public class test19_9 {
    public static <E extends Comparable<E>> void sort (ArrayList<E> list){
        Collections.sort(list);
    }
}
