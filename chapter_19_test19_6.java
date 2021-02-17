package chapter_19;

public class test19_6 {
    public static <E extends Comparable<E>> E max(E[][] list){
        if (list.length == 0){
            throw new RuntimeException("The array is null !!");
        }

        E max = list[0][0];
        for (int i = 0 ; i < list.length; i++){
            for (int j = 0 ; j < list[0].length; j++){
                if (list[i][j].compareTo(max) > 0){
                    max = list[i][j];
                }
            }
        }
        return max;
    }
}
