package chapter_19;

public class test19_4 {
    public static void main(String[] args){
        Integer[] temp = new Integer[10];
        for (int i = 0 ; i < 10 ; i ++ ){
            temp[i] = i ;
            System.out.print(temp[i]);
        }
        System.out.print(linearSearch(temp,2));
    }


    public static <E extends Comparable<E>> int linearSearch(E[] list, E key){
        for (int i = 0 ; i < list.length ; i ++){
            if(list[i].compareTo(key) == 0)
                return i;
        }
        return -1;
    }
}
