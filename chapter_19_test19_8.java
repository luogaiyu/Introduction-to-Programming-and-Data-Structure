package chapter_19;

import java.util.ArrayList;

public class test19_8 {

    public static <E> void shuffle(ArrayList<E> list){
        ArrayList<E> result = new ArrayList<>();
        while(!list.isEmpty()){
            int randomIndex = (int)((list.size()-1) * Math.random());
            result.add(list.get(randomIndex));
            list.remove(list.get(randomIndex));
        }


        for (int i = 0 ; i < result.size() ; i ++ ){
            list.add(result.get(i));
        }
    }
}
