package kotlin1;

/**
 * Created by Administrator on 2017/6/22 0022.
 */
public class Test {

    public static void main(String[] args) {


        Kotlin3 kotlin3 = new Kotlin3("ss", 2);

        kotlin3.setAge(99);
        sop(kotlin3.getName() + kotlin3.getAge() );

        int a= 2;
        int b = 2;
        boolean d = (a == b) ;
        sop(d);

        use use = new use();
        use.us();
        int aa = use.us;
        sop(aa);
    }


    public static void sop(Object args) {
        System.out.println(args);
    }

    interface Us{

        void us();
        int us = 8;
    }

    static class use implements Us{
        
        @Override
        public void us() {

        }
    }

}
