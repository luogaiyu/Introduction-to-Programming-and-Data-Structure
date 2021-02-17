package chapter_19;
import java.util.ArrayList;
import java.util.Collections;

public class test19_10 {

    public static <E extends Comparable<E>> E max (ArrayList<E> list){
        E max = list.get(0);
        for ( int i = 0 ; i < list.size() ; i ++ ){
            if(list.get(i).compareTo(max) > 0 ){
                max = list.get(i);
            }
        }
        return max;
    }

}
