package chapter_19;

import java.util.Arrays;

public class test19_7 {
    public static <E extends Comparable<E>> int binarySearch(E[] list, E key){

        //初始左边和右边的值 来进行二分查找
        int left = 0 ;
        int right = list.length -1;
        int mid;
        while (left <= right){
             mid = (left + right) / 2;
            if (list[mid] == key )
                return mid;

            if (list[mid].compareTo(key) > 0)
                right = mid - 1 ;

            if (list[mid].compareTo(key) < 0)
                left = mid + 1;
        }
        return -1;
    }


}
