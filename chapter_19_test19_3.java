package chapter_19;
import java.util.ArrayList;
public class test19_3 {

    public static void main(String[] args){
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(1);
        temp.add(2);
        temp.add(1);

        System.out.print(temp.toString());

        ArrayList<Integer> result = test19_3.<Integer>removeDuplicates(temp);
        System.out.print(result.toString());
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
        ArrayList<E> result = new ArrayList<>();
        for (int i = 0 ; i < list.size() ; i ++){
            if (!(result.contains(list.get(i)))){
                result.add(list.get(i));
            }
        }
        return result;
    }
}


