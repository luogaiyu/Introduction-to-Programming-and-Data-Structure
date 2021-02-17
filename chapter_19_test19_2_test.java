package chapter_19;

import java.util.Scanner;

public class test19_2_test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        test19_2<String>  temp = new test19_2<String>();
        for (int i = 0 ; i < 5 ; i ++){
            System.out.print("请输入第" + (i+1) + "个字符串");
            String te = input.next();
            temp.push(te);
        }


        while(!temp.isEmpty()){
            System.out.print(temp.pop());
            System.out.println();
        }
    }
}
