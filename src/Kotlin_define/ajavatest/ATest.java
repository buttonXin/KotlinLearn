package Kotlin_define.ajavatest;

import Kotlin_define.chapter3.funtion1_333.TestKtKt;
import java.util.ArrayList;

/**
 * Created by Administrator on 2017/8/21 0021.
 */
public class ATest {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(22);
        list.add(222);

        p(TestKtKt.joinToString(list, TestKtKt.UNIX , "" ,""));

    }

    private static void p(Object o){
        System.out.println(o);
    }
}
