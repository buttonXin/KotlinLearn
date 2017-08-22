package kotlin1;

/**
 * Created by Administrator on 2017/6/22 0022.
 */
public class Test {

    public static void main(String[] args) {


        Kotlin3 kotlin3 = new Kotlin3("ss", 2);

        kotlin3.setAge(99);
        sop(kotlin3.getName() + kotlin3.getAge() );


    }


    public static void sop(String args) {
        System.out.println(args);
    }
}
