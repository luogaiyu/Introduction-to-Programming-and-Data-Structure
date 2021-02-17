package chapter_19;

public class test19_5 {
    public static <E extends Comparable<E>> E max(E[] list){
        if(list.length == 0 ){
            throw new RuntimeException("The array is null ");
        }

        E max = list[0];

        for (int i = 0 ; i < list.length ; i ++ ){
            if (list[i].compareTo(max) > 0)
                max = list[i];
        }

        return max;
    }
}
