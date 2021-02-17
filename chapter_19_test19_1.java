package chapter_19;

public class test19_1<E> {
    private E[] list = (E[])new Object[10];
    private int countId = 0 ;

    public int getSize(){
        return countId;
    }

    public E peek(){
        return list[countId];
    }

    public void push(E o){
        list[countId] = o;
        countId ++;
        if (countId == list.length - 1){
            E[] temp = (E[]) new Object[2*list.length];
            for (int i = 0 ; i < list.length; i ++ ){
                temp[i] = list[i];
            }
            list = temp;
        }
    }

    public E pop(){
        E o = list[countId];
        countId--;
        return o;
    }

    public boolean isEmpty(){
        if (countId == 0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0 ; i < countId ; i ++ ){
            sb.append(list[i].toString()+ ',');
        }
        sb.append("]");
        return "stack" + sb;
    }


}
